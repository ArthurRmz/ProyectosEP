/*
 * An XML document type.
 * Localname: temperaturaFarenheit
 * Namespace: http://soa.com/grados
 * Java type: com.soa.grados.TemperaturaFarenheitDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.grados.impl;
/**
 * A document containing one temperaturaFarenheit(@http://soa.com/grados) element.
 *
 * This is a complex type.
 */
public class TemperaturaFarenheitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.grados.TemperaturaFarenheitDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemperaturaFarenheitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPERATURAFARENHEIT$0 = 
        new javax.xml.namespace.QName("http://soa.com/grados", "temperaturaFarenheit");
    
    
    /**
     * Gets the "temperaturaFarenheit" element
     */
    public com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit getTemperaturaFarenheit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit target = null;
            target = (com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit)get_store().find_element_user(TEMPERATURAFARENHEIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temperaturaFarenheit" element
     */
    public void setTemperaturaFarenheit(com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit temperaturaFarenheit)
    {
        generatedSetterHelperImpl(temperaturaFarenheit, TEMPERATURAFARENHEIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "temperaturaFarenheit" element
     */
    public com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit addNewTemperaturaFarenheit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit target = null;
            target = (com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit)get_store().add_element_user(TEMPERATURAFARENHEIT$0);
            return target;
        }
    }
    /**
     * An XML temperaturaFarenheit(@http://soa.com/grados).
     *
     * This is a complex type.
     */
    public static class TemperaturaFarenheitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit
    {
        private static final long serialVersionUID = 1L;
        
        public TemperaturaFarenheitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GRADOS$0 = 
            new javax.xml.namespace.QName("http://soa.com/grados", "grados");
        
        
        /**
         * Gets the "grados" element
         */
        public double getGrados()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRADOS$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "grados" element
         */
        public org.apache.xmlbeans.XmlDouble xgetGrados()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GRADOS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "grados" element
         */
        public void setGrados(double grados)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRADOS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRADOS$0);
                }
                target.setDoubleValue(grados);
            }
        }
        
        /**
         * Sets (as xml) the "grados" element
         */
        public void xsetGrados(org.apache.xmlbeans.XmlDouble grados)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GRADOS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(GRADOS$0);
                }
                target.set(grados);
            }
        }
    }
}
