import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import com.banco.cuentas.CuentaChequesDocument;
import com.banco.cuentas.CuentaChequesDocument.CuentaCheques;

/**
 * Prueba de creacion de un objeto a partir de un xml y obtencion de un
 * elemento.
 * 
 * @author tlopez.
 */
public class XmlBeansTest {

    /**
     * Convierte el archivo cuentaCheques en un String y luego el String a
     * un objeto con el dataMapping generado con el build.xml de xmlbeans.
     * @throws XmlException Potencial error al convertir a objeto.
     * @throws IOException Potencial error al leer el archivo.
     */
    @Test
    public void test() throws XmlException, IOException {
        // Se obtiene la representacion String del archivo xml.
        String msg = readFileAsString("/cuentaCheques.xml");
        
        // Se toma el tiempo inicial de la conversion.
        long t1 = System.currentTimeMillis();
        
        // Con parse se convierte el String al objeto CuentaChequesDocument. 
        CuentaChequesDocument cuentaChequesDoc = CuentaChequesDocument.Factory
                .parse(msg);
        System.out.println("obj es valido?: " +cuentaChequesDoc.validate());

        // Se extrae el elemento hijo numeroCuenta, observese que el objeto raiz
        // CuentaChequesDocument es solo un envolvente, el primer hijo realmente
        // es cuentaChequesDoc.getCuentaCheques().
        String numeroCuenta = cuentaChequesDoc.getCuentaCheques()
                .getNumeroCuenta();
        CuentaCheques cuentaCheques = cuentaChequesDoc.getCuentaCheques();
        System.out.println(cuentaCheques.getCuentaHabiente());
        System.out.println(cuentaCheques.getCredito());
        assertEquals("1111-2222-3333-4444", numeroCuenta);
        long t2 = System.currentTimeMillis();
        System.out.println("Ejecución en milisegundos: " + (t2 - t1));
    }

    @Test
    public void creacionObjetoTest() throws XmlException, IOException {
        // Con parse se convierte el String al objeto CuentaChequesDocument. 
        CuentaChequesDocument cuentaChequesDoc = CuentaChequesDocument.Factory
                .newInstance();
        CuentaCheques cheques = cuentaChequesDoc.addNewCuentaCheques();
        cheques.setCredito(10000);
        cheques.setCuentaHabiente("Juan");
        cheques.setNumeroCuenta("1111");
        System.out.println(cuentaChequesDoc.xmlText());
       System.out.println("obj es valido?: " +cuentaChequesDoc.validate());
    }

    /**
     * Returns the file content as String.
     * 
     * @param fileName
     *            the name of the file to open.
     * @return File content as String.
     * @throws IOException
     */
    public String readFileAsString(String fileName) throws IOException {
        StringBuffer fileData = new StringBuffer(10000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                XmlBeansTest.class.getResourceAsStream(fileName)));
        String line = null;
        while ((line = reader.readLine()) != null) {
            fileData.append(line + "\n");
        }

        reader.close();
        return fileData.toString();
    }
}
