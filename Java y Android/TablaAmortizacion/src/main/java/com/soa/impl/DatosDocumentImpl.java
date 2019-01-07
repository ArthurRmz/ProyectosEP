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
        
        private static final javax.xml.namespace.QName MONTO$0 = 
            new javax.xml.namespace.QName("http://soa.com", "Monto");
        private static final javax.xml.namespace.QName TASAINTERES$2 = 
            new javax.xml.namespace.QName("http://soa.com", "TasaInteres");
        private static final javax.xml.namespace.QName PLAZO$4 = 
            new javax.xml.namespace.QName("http://soa.com", "Plazo");
        
        
        /**
         * Gets the "Monto" element
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
         * Gets (as xml) the "Monto" element
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
         * Sets the "Monto" element
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
         * Sets (as xml) the "Monto" element
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
        
        /**
         * Gets the "TasaInteres" element
         */
        public double getTasaInteres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAINTERES$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "TasaInteres" element
         */
        public org.apache.xmlbeans.XmlDouble xgetTasaInteres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TASAINTERES$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TasaInteres" element
         */
        public void setTasaInteres(double tasaInteres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAINTERES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASAINTERES$2);
                }
                target.setDoubleValue(tasaInteres);
            }
        }
        
        /**
         * Sets (as xml) the "TasaInteres" element
         */
        public void xsetTasaInteres(org.apache.xmlbeans.XmlDouble tasaInteres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TASAINTERES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TASAINTERES$2);
                }
                target.set(tasaInteres);
            }
        }
        
        /**
         * Gets the "Plazo" element
         */
        public int getPlazo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZO$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Plazo" element
         */
        public org.apache.xmlbeans.XmlInt xgetPlazo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PLAZO$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Plazo" element
         */
        public void setPlazo(int plazo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLAZO$4);
                }
                target.setIntValue(plazo);
            }
        }
        
        /**
         * Sets (as xml) the "Plazo" element
         */
        public void xsetPlazo(org.apache.xmlbeans.XmlInt plazo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PLAZO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PLAZO$4);
                }
                target.set(plazo);
            }
        }
    }
}
