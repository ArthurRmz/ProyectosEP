/*
 * An XML document type.
 * Localname: contarVocales
 * Namespace: http://soa.com
 * Java type: com.soa.ContarVocalesDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one contarVocales(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class ContarVocalesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ContarVocalesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContarVocalesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTARVOCALES$0 = 
        new javax.xml.namespace.QName("http://soa.com", "contarVocales");
    
    
    /**
     * Gets the "contarVocales" element
     */
    public com.soa.ContarVocalesDocument.ContarVocales getContarVocales()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ContarVocalesDocument.ContarVocales target = null;
            target = (com.soa.ContarVocalesDocument.ContarVocales)get_store().find_element_user(CONTARVOCALES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contarVocales" element
     */
    public void setContarVocales(com.soa.ContarVocalesDocument.ContarVocales contarVocales)
    {
        generatedSetterHelperImpl(contarVocales, CONTARVOCALES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contarVocales" element
     */
    public com.soa.ContarVocalesDocument.ContarVocales addNewContarVocales()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ContarVocalesDocument.ContarVocales target = null;
            target = (com.soa.ContarVocalesDocument.ContarVocales)get_store().add_element_user(CONTARVOCALES$0);
            return target;
        }
    }
    /**
     * An XML contarVocales(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class ContarVocalesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ContarVocalesDocument.ContarVocales
    {
        private static final long serialVersionUID = 1L;
        
        public ContarVocalesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMVOCALES$0 = 
            new javax.xml.namespace.QName("http://soa.com", "numVocales");
        
        
        /**
         * Gets the "numVocales" element
         */
        public int getNumVocales()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMVOCALES$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numVocales" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumVocales()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMVOCALES$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numVocales" element
         */
        public void setNumVocales(int numVocales)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMVOCALES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMVOCALES$0);
                }
                target.setIntValue(numVocales);
            }
        }
        
        /**
         * Sets (as xml) the "numVocales" element
         */
        public void xsetNumVocales(org.apache.xmlbeans.XmlInt numVocales)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMVOCALES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMVOCALES$0);
                }
                target.set(numVocales);
            }
        }
    }
}
