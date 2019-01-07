/*
 * An XML document type.
 * Localname: datos
 * Namespace: http://soa.com
 * Java type: com.soa.DatosDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one datos(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class DatosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.DatosDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATOS$0 = 
        new javax.xml.namespace.QName("http://soa.com", "datos");
    
    
    /**
     * Gets the "datos" element
     */
    public com.soa.DatosDocument.Datos getDatos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.DatosDocument.Datos target = null;
            target = (com.soa.DatosDocument.Datos)get_store().find_element_user(DATOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datos" element
     */
    public void setDatos(com.soa.DatosDocument.Datos datos)
    {
        generatedSetterHelperImpl(datos, DATOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "datos" element
     */
    public com.soa.DatosDocument.Datos addNewDatos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.DatosDocument.Datos target = null;
            target = (com.soa.DatosDocument.Datos)get_store().add_element_user(DATOS$0);
            return target;
        }
    }
    /**
     * An XML datos(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class DatosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.DatosDocument.Datos
    {
        private static final long serialVersionUID = 1L;
        
        public DatosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMERO1$0 = 
            new javax.xml.namespace.QName("http://soa.com", "numero1");
        private static final javax.xml.namespace.QName NUMERO2$2 = 
            new javax.xml.namespace.QName("http://soa.com", "numero2");
        
        
        /**
         * Gets the "numero1" element
         */
        public int getNumero1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO1$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numero1" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumero1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMERO1$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numero1" element
         */
        public void setNumero1(int numero1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO1$0);
                }
                target.setIntValue(numero1);
            }
        }
        
        /**
         * Sets (as xml) the "numero1" element
         */
        public void xsetNumero1(org.apache.xmlbeans.XmlInt numero1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMERO1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMERO1$0);
                }
                target.set(numero1);
            }
        }
        
        /**
         * Gets the "numero2" element
         */
        public int getNumero2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO2$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numero2" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumero2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMERO2$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numero2" element
         */
        public void setNumero2(int numero2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO2$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO2$2);
                }
                target.setIntValue(numero2);
            }
        }
        
        /**
         * Sets (as xml) the "numero2" element
         */
        public void xsetNumero2(org.apache.xmlbeans.XmlInt numero2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMERO2$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMERO2$2);
                }
                target.set(numero2);
            }
        }
    }
}
