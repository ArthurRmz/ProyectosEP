/*
 * An XML document type.
 * Localname: responseService
 * Namespace: http://soa.com
 * Java type: com.soa.ResponseServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one responseService(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class ResponseServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ResponseServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSESERVICE$0 = 
        new javax.xml.namespace.QName("http://soa.com", "responseService");
    
    
    /**
     * Gets the "responseService" element
     */
    public com.soa.ResponseServiceDocument.ResponseService getResponseService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ResponseServiceDocument.ResponseService target = null;
            target = (com.soa.ResponseServiceDocument.ResponseService)get_store().find_element_user(RESPONSESERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseService" element
     */
    public void setResponseService(com.soa.ResponseServiceDocument.ResponseService responseService)
    {
        generatedSetterHelperImpl(responseService, RESPONSESERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseService" element
     */
    public com.soa.ResponseServiceDocument.ResponseService addNewResponseService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ResponseServiceDocument.ResponseService target = null;
            target = (com.soa.ResponseServiceDocument.ResponseService)get_store().add_element_user(RESPONSESERVICE$0);
            return target;
        }
    }
    /**
     * An XML responseService(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class ResponseServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ResponseServiceDocument.ResponseService
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseServiceImpl(org.apache.xmlbeans.SchemaType sType)
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
