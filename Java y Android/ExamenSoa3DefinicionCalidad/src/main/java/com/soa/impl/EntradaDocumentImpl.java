/*
 * An XML document type.
 * Localname: entrada
 * Namespace: http://soa.com
 * Java type: com.soa.EntradaDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one entrada(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class EntradaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.EntradaDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntradaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRADA$0 = 
        new javax.xml.namespace.QName("http://soa.com", "entrada");
    
    
    /**
     * Gets the "entrada" element
     */
    public com.soa.EntradaDocument.Entrada getEntrada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.EntradaDocument.Entrada target = null;
            target = (com.soa.EntradaDocument.Entrada)get_store().find_element_user(ENTRADA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entrada" element
     */
    public void setEntrada(com.soa.EntradaDocument.Entrada entrada)
    {
        generatedSetterHelperImpl(entrada, ENTRADA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entrada" element
     */
    public com.soa.EntradaDocument.Entrada addNewEntrada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.EntradaDocument.Entrada target = null;
            target = (com.soa.EntradaDocument.Entrada)get_store().add_element_user(ENTRADA$0);
            return target;
        }
    }
    /**
     * An XML entrada(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class EntradaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.EntradaDocument.Entrada
    {
        private static final long serialVersionUID = 1L;
        
        public EntradaImpl(org.apache.xmlbeans.SchemaType sType)
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
