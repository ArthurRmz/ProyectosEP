/*
 * An XML document type.
 * Localname: consultarBuro
 * Namespace: http://soa.com
 * Java type: com.soa.ConsultarBuroDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one consultarBuro(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class ConsultarBuroDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ConsultarBuroDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsultarBuroDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTARBURO$0 = 
        new javax.xml.namespace.QName("http://soa.com", "consultarBuro");
    
    
    /**
     * Gets the "consultarBuro" element
     */
    public com.soa.ConsultarBuroDocument.ConsultarBuro getConsultarBuro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ConsultarBuroDocument.ConsultarBuro target = null;
            target = (com.soa.ConsultarBuroDocument.ConsultarBuro)get_store().find_element_user(CONSULTARBURO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "consultarBuro" element
     */
    public void setConsultarBuro(com.soa.ConsultarBuroDocument.ConsultarBuro consultarBuro)
    {
        generatedSetterHelperImpl(consultarBuro, CONSULTARBURO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "consultarBuro" element
     */
    public com.soa.ConsultarBuroDocument.ConsultarBuro addNewConsultarBuro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ConsultarBuroDocument.ConsultarBuro target = null;
            target = (com.soa.ConsultarBuroDocument.ConsultarBuro)get_store().add_element_user(CONSULTARBURO$0);
            return target;
        }
    }
    /**
     * An XML consultarBuro(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class ConsultarBuroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ConsultarBuroDocument.ConsultarBuro
    {
        private static final long serialVersionUID = 1L;
        
        public ConsultarBuroImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESPUESTA$0 = 
            new javax.xml.namespace.QName("http://soa.com", "respuesta");
        
        
        /**
         * Gets the "respuesta" element
         */
        public boolean getRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "respuesta" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESPUESTA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "respuesta" element
         */
        public void setRespuesta(boolean respuesta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPUESTA$0);
                }
                target.setBooleanValue(respuesta);
            }
        }
        
        /**
         * Sets (as xml) the "respuesta" element
         */
        public void xsetRespuesta(org.apache.xmlbeans.XmlBoolean respuesta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESPUESTA$0);
                }
                target.set(respuesta);
            }
        }
    }
}
