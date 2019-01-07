/*
 * An XML document type.
 * Localname: respuesta
 * Namespace: http://soa.com
 * Java type: com.soa.RespuestaDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one respuesta(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class RespuestaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.RespuestaDocument
{
    private static final long serialVersionUID = 1L;
    
    public RespuestaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPUESTA$0 = 
        new javax.xml.namespace.QName("http://soa.com", "respuesta");
    
    
    /**
     * Gets the "respuesta" element
     */
    public com.soa.RespuestaDocument.Respuesta getRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.RespuestaDocument.Respuesta target = null;
            target = (com.soa.RespuestaDocument.Respuesta)get_store().find_element_user(RESPUESTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "respuesta" element
     */
    public void setRespuesta(com.soa.RespuestaDocument.Respuesta respuesta)
    {
        generatedSetterHelperImpl(respuesta, RESPUESTA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "respuesta" element
     */
    public com.soa.RespuestaDocument.Respuesta addNewRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.RespuestaDocument.Respuesta target = null;
            target = (com.soa.RespuestaDocument.Respuesta)get_store().add_element_user(RESPUESTA$0);
            return target;
        }
    }
    /**
     * An XML respuesta(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class RespuestaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.RespuestaDocument.Respuesta
    {
        private static final long serialVersionUID = 1L;
        
        public RespuestaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MENSAJE$0 = 
            new javax.xml.namespace.QName("http://soa.com", "mensaje");
        
        
        /**
         * Gets the "mensaje" element
         */
        public java.lang.String getMensaje()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAJE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mensaje" element
         */
        public org.apache.xmlbeans.XmlString xgetMensaje()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAJE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mensaje" element
         */
        public void setMensaje(java.lang.String mensaje)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAJE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENSAJE$0);
                }
                target.setStringValue(mensaje);
            }
        }
        
        /**
         * Sets (as xml) the "mensaje" element
         */
        public void xsetMensaje(org.apache.xmlbeans.XmlString mensaje)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAJE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENSAJE$0);
                }
                target.set(mensaje);
            }
        }
    }
}
