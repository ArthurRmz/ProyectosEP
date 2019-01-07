package itq.soa.jms;

import java.util.Properties;
import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author Arthur
 *
 */
public class jmsConsumer implements MessageListener {

    /**
     * Contexto de comunicación JMS.
     */
    private Context ctx = null;

    /**
     * Conexión a la queue.
     */
    private Connection connection = null;

    /**
     * Programa principal para leer mensajes de queues.
     * 
     * @param args Argumentos para la lectura en formato: <servidor> <puerto>
     *            <nombreQueue>
     */
    public static void main(String args[]) {
            jmsConsumer consumer = new jmsConsumer();
            consumer.consume("localhost", "1099", "A");
    }

    /**
     * Obtiene el contexto inicial JNDI.
     * @param servidor Servidor JNDI.
     * @param puerto Puerto del servicio JNDI.
     * @return Contexto inicial.
     * @throws NamingException
     */
    public Context getInitialContext(final String servidor, final String puerto) throws NamingException 
    {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
        props.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");
        props.put(Context.PROVIDER_URL, "jnp://" + servidor + ":" + puerto);
        return new InitialContext(props);
    }

    /**
     * Prepara el consumo de mensajes en una queue.
     * 
     * @param servidor Servidor del queue manager.
     * @param puerto Puerto jndi.
     * @param nombreQueue Nombre de la queue.
     */
    public void consume(final String servidor, final String puerto,final String nombreQueue) {
        String destinationName = "queue/" + nombreQueue;
        ConnectionFactory cf = null;
        try {
            this.ctx = getInitialContext(servidor, puerto);
            cf = (ConnectionFactory) ctx.lookup("/ConnectionFactory");
            Queue queue = (Queue) ctx.lookup(destinationName);
            this.connection = cf.createConnection();
            Session session = connection.createSession(false,
                    Session.AUTO_ACKNOWLEDGE);
            MessageConsumer messageConsumer = session.createConsumer(queue);
            messageConsumer.setMessageListener(this);
            connection.start();
            Scanner keyIn = new Scanner(System.in);
            System.out.println("Servidor ["+servidor+":"+puerto+":"+nombreQueue+"] escuchando. Escribe una tecla para salir\n");
            keyIn.next();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            freeResources();
        }
    }

    /**
     * Libera recursos utilizados.
     */
    private void freeResources() {
        if (ctx != null) {
            try {
                ctx.close();
            } catch (NamingException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            String text = textMessage.getText();
            text = text.trim();
            System.out.println("Mensaje recibido: [" + text + "]");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}