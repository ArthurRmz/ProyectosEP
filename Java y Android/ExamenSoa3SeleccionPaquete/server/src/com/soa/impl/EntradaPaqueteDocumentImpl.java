/*
 * An XML document type.
 * Localname: entradaPaquete
 * Namespace: http://soa.com
 * Java type: com.soa.EntradaPaqueteDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one entradaPaquete(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class EntradaPaqueteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.EntradaPaqueteDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntradaPaqueteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRADAPAQUETE$0 = 
        new javax.xml.namespace.QName("http://soa.com", "entradaPaquete");
    
    
    /**
     * Gets the "entradaPaquete" element
     */
    public com.soa.EntradaPaqueteDocument.EntradaPaquete getEntradaPaquete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.EntradaPaqueteDocument.EntradaPaquete target = null;
            target = (com.soa.EntradaPaqueteDocument.EntradaPaquete)get_store().find_element_user(ENTRADAPAQUETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entradaPaquete" element
     */
    public void setEntradaPaquete(com.soa.EntradaPaqueteDocument.EntradaPaquete entradaPaquete)
    {
        generatedSetterHelperImpl(entradaPaquete, ENTRADAPAQUETE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entradaPaquete" element
     */
    public com.soa.EntradaPaqueteDocument.EntradaPaquete addNewEntradaPaquete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.EntradaPaqueteDocument.EntradaPaquete target = null;
            target = (com.soa.EntradaPaqueteDocument.EntradaPaquete)get_store().add_element_user(ENTRADAPAQUETE$0);
            return target;
        }
    }
    /**
     * An XML entradaPaquete(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class EntradaPaqueteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.EntradaPaqueteDocument.EntradaPaquete
    {
        private static final long serialVersionUID = 1L;
        
        public EntradaPaqueteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MONTO$0 = 
            new javax.xml.namespace.QName("http://soa.com", "monto");
        
        
        /**
         * Gets the "monto" element
         */
        public double getMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "monto" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "monto" element
         */
        public void setMonto(double monto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$0);
                }
                target.setDoubleValue(monto);
            }
        }
        
        /**
         * Sets (as xml) the "monto" element
         */
        public void xsetMonto(org.apache.xmlbeans.XmlDouble monto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTO$0);
                }
                target.set(monto);
            }
        }
    }
}
