/*
 * An XML document type.
 * Localname: salidaDatosIni
 * Namespace: http://soa.com
 * Java type: com.soa.SalidaDatosIniDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one salidaDatosIni(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class SalidaDatosIniDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SalidaDatosIniDocument
{
    private static final long serialVersionUID = 1L;
    
    public SalidaDatosIniDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALIDADATOSINI$0 = 
        new javax.xml.namespace.QName("http://soa.com", "salidaDatosIni");
    
    
    /**
     * Gets the "salidaDatosIni" element
     */
    public com.soa.SalidaDatosIniDocument.SalidaDatosIni getSalidaDatosIni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SalidaDatosIniDocument.SalidaDatosIni target = null;
            target = (com.soa.SalidaDatosIniDocument.SalidaDatosIni)get_store().find_element_user(SALIDADATOSINI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "salidaDatosIni" element
     */
    public void setSalidaDatosIni(com.soa.SalidaDatosIniDocument.SalidaDatosIni salidaDatosIni)
    {
        generatedSetterHelperImpl(salidaDatosIni, SALIDADATOSINI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "salidaDatosIni" element
     */
    public com.soa.SalidaDatosIniDocument.SalidaDatosIni addNewSalidaDatosIni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SalidaDatosIniDocument.SalidaDatosIni target = null;
            target = (com.soa.SalidaDatosIniDocument.SalidaDatosIni)get_store().add_element_user(SALIDADATOSINI$0);
            return target;
        }
    }
    /**
     * An XML salidaDatosIni(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class SalidaDatosIniImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SalidaDatosIniDocument.SalidaDatosIni
    {
        private static final long serialVersionUID = 1L;
        
        public SalidaDatosIniImpl(org.apache.xmlbeans.SchemaType sType)
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
