/*
 * An XML document type.
 * Localname: temperaturaCentigrados
 * Namespace: http://soa.com/grados
 * Java type: com.soa.grados.TemperaturaCentigradosDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.grados.impl;
/**
 * A document containing one temperaturaCentigrados(@http://soa.com/grados) element.
 *
 * This is a complex type.
 */
public class TemperaturaCentigradosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.grados.TemperaturaCentigradosDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemperaturaCentigradosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPERATURACENTIGRADOS$0 = 
        new javax.xml.namespace.QName("http://soa.com/grados", "temperaturaCentigrados");
    
    
    /**
     * Gets the "temperaturaCentigrados" element
     */
    public com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados getTemperaturaCentigrados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados target = null;
            target = (com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados)get_store().find_element_user(TEMPERATURACENTIGRADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temperaturaCentigrados" element
     */
    public void setTemperaturaCentigrados(com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados temperaturaCentigrados)
    {
        generatedSetterHelperImpl(temperaturaCentigrados, TEMPERATURACENTIGRADOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "temperaturaCentigrados" element
     */
    public com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados addNewTemperaturaCentigrados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados target = null;
            target = (com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados)get_store().add_element_user(TEMPERATURACENTIGRADOS$0);
            return target;
        }
    }
    /**
     * An XML temperaturaCentigrados(@http://soa.com/grados).
     *
     * This is a complex type.
     */
    public static class TemperaturaCentigradosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados
    {
        private static final long serialVersionUID = 1L;
        
        public TemperaturaCentigradosImpl(org.apache.xmlbeans.SchemaType sType)
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
