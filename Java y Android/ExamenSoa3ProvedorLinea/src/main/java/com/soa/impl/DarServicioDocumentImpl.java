/*
 * An XML document type.
 * Localname: darServicio
 * Namespace: http://soa.com
 * Java type: com.soa.DarServicioDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one darServicio(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class DarServicioDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.DarServicioDocument
{
    private static final long serialVersionUID = 1L;
    
    public DarServicioDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DARSERVICIO$0 = 
        new javax.xml.namespace.QName("http://soa.com", "darServicio");
    
    
    /**
     * Gets the "darServicio" element
     */
    public com.soa.DarServicioDocument.DarServicio getDarServicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.DarServicioDocument.DarServicio target = null;
            target = (com.soa.DarServicioDocument.DarServicio)get_store().find_element_user(DARSERVICIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "darServicio" element
     */
    public void setDarServicio(com.soa.DarServicioDocument.DarServicio darServicio)
    {
        generatedSetterHelperImpl(darServicio, DARSERVICIO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "darServicio" element
     */
    public com.soa.DarServicioDocument.DarServicio addNewDarServicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.DarServicioDocument.DarServicio target = null;
            target = (com.soa.DarServicioDocument.DarServicio)get_store().add_element_user(DARSERVICIO$0);
            return target;
        }
    }
    /**
     * An XML darServicio(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class DarServicioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.DarServicioDocument.DarServicio
    {
        private static final long serialVersionUID = 1L;
        
        public DarServicioImpl(org.apache.xmlbeans.SchemaType sType)
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
