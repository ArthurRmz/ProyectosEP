/*
 * An XML document type.
 * Localname: frase
 * Namespace: http://soa.com
 * Java type: com.soa.FraseDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one frase(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class FraseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.FraseDocument
{
    private static final long serialVersionUID = 1L;
    
    public FraseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRASE$0 = 
        new javax.xml.namespace.QName("http://soa.com", "frase");
    
    
    /**
     * Gets the "frase" element
     */
    public com.soa.FraseDocument.Frase getFrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.FraseDocument.Frase target = null;
            target = (com.soa.FraseDocument.Frase)get_store().find_element_user(FRASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "frase" element
     */
    public void setFrase(com.soa.FraseDocument.Frase frase)
    {
        generatedSetterHelperImpl(frase, FRASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "frase" element
     */
    public com.soa.FraseDocument.Frase addNewFrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.FraseDocument.Frase target = null;
            target = (com.soa.FraseDocument.Frase)get_store().add_element_user(FRASE$0);
            return target;
        }
    }
    /**
     * An XML frase(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class FraseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.FraseDocument.Frase
    {
        private static final long serialVersionUID = 1L;
        
        public FraseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PALABRA$0 = 
            new javax.xml.namespace.QName("http://soa.com", "palabra");
        
        
        /**
         * Gets the "palabra" element
         */
        public java.lang.String getPalabra()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PALABRA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "palabra" element
         */
        public org.apache.xmlbeans.XmlString xgetPalabra()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PALABRA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "palabra" element
         */
        public void setPalabra(java.lang.String palabra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PALABRA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PALABRA$0);
                }
                target.setStringValue(palabra);
            }
        }
        
        /**
         * Sets (as xml) the "palabra" element
         */
        public void xsetPalabra(org.apache.xmlbeans.XmlString palabra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PALABRA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PALABRA$0);
                }
                target.set(palabra);
            }
        }
    }
}
