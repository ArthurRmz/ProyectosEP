/*
 * An XML document type.
 * Localname: salidaPaquete
 * Namespace: http://soa.com
 * Java type: com.soa.SalidaPaqueteDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one salidaPaquete(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class SalidaPaqueteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SalidaPaqueteDocument
{
    private static final long serialVersionUID = 1L;
    
    public SalidaPaqueteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALIDAPAQUETE$0 = 
        new javax.xml.namespace.QName("http://soa.com", "salidaPaquete");
    
    
    /**
     * Gets the "salidaPaquete" element
     */
    public com.soa.SalidaPaqueteDocument.SalidaPaquete getSalidaPaquete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SalidaPaqueteDocument.SalidaPaquete target = null;
            target = (com.soa.SalidaPaqueteDocument.SalidaPaquete)get_store().find_element_user(SALIDAPAQUETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "salidaPaquete" element
     */
    public void setSalidaPaquete(com.soa.SalidaPaqueteDocument.SalidaPaquete salidaPaquete)
    {
        generatedSetterHelperImpl(salidaPaquete, SALIDAPAQUETE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "salidaPaquete" element
     */
    public com.soa.SalidaPaqueteDocument.SalidaPaquete addNewSalidaPaquete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SalidaPaqueteDocument.SalidaPaquete target = null;
            target = (com.soa.SalidaPaqueteDocument.SalidaPaquete)get_store().add_element_user(SALIDAPAQUETE$0);
            return target;
        }
    }
    /**
     * An XML salidaPaquete(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class SalidaPaqueteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SalidaPaqueteDocument.SalidaPaquete
    {
        private static final long serialVersionUID = 1L;
        
        public SalidaPaqueteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PAQUETE$0 = 
            new javax.xml.namespace.QName("http://soa.com", "paquete");
        
        
        /**
         * Gets the "paquete" element
         */
        public java.lang.String getPaquete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAQUETE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paquete" element
         */
        public org.apache.xmlbeans.XmlString xgetPaquete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAQUETE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "paquete" element
         */
        public void setPaquete(java.lang.String paquete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAQUETE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAQUETE$0);
                }
                target.setStringValue(paquete);
            }
        }
        
        /**
         * Sets (as xml) the "paquete" element
         */
        public void xsetPaquete(org.apache.xmlbeans.XmlString paquete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAQUETE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAQUETE$0);
                }
                target.set(paquete);
            }
        }
    }
}
