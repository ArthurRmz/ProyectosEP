/*
 * An XML document type.
 * Localname: credito
 * Namespace: http://soa.com
 * Java type: com.soa.CreditoDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one credito(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class CreditoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.CreditoDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITO$0 = 
        new javax.xml.namespace.QName("http://soa.com", "credito");
    
    
    /**
     * Gets the "credito" element
     */
    public com.soa.CreditoDocument.Credito getCredito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.CreditoDocument.Credito target = null;
            target = (com.soa.CreditoDocument.Credito)get_store().find_element_user(CREDITO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "credito" element
     */
    public void setCredito(com.soa.CreditoDocument.Credito credito)
    {
        generatedSetterHelperImpl(credito, CREDITO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "credito" element
     */
    public com.soa.CreditoDocument.Credito addNewCredito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.CreditoDocument.Credito target = null;
            target = (com.soa.CreditoDocument.Credito)get_store().add_element_user(CREDITO$0);
            return target;
        }
    }
    /**
     * An XML credito(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class CreditoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.CreditoDocument.Credito
    {
        private static final long serialVersionUID = 1L;
        
        public CreditoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOMBRE$0 = 
            new javax.xml.namespace.QName("http://soa.com", "nombre");
        private static final javax.xml.namespace.QName APELLIDOS$2 = 
            new javax.xml.namespace.QName("http://soa.com", "apellidos");
        private static final javax.xml.namespace.QName CURP$4 = 
            new javax.xml.namespace.QName("http://soa.com", "curp");
        private static final javax.xml.namespace.QName DOMICILIO$6 = 
            new javax.xml.namespace.QName("http://soa.com", "domicilio");
        private static final javax.xml.namespace.QName SALARIO$8 = 
            new javax.xml.namespace.QName("http://soa.com", "salario");
        private static final javax.xml.namespace.QName MONTO$10 = 
            new javax.xml.namespace.QName("http://soa.com", "monto");
        private static final javax.xml.namespace.QName TASAINTERES$12 = 
            new javax.xml.namespace.QName("http://soa.com", "tasaInteres");
        private static final javax.xml.namespace.QName PLAZO$14 = 
            new javax.xml.namespace.QName("http://soa.com", "plazo");
        
        
        /**
         * Gets the "nombre" element
         */
        public java.lang.String getNombre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nombre" element
         */
        public org.apache.xmlbeans.XmlString xgetNombre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nombre" element
         */
        public void setNombre(java.lang.String nombre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRE$0);
                }
                target.setStringValue(nombre);
            }
        }
        
        /**
         * Sets (as xml) the "nombre" element
         */
        public void xsetNombre(org.apache.xmlbeans.XmlString nombre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$0);
                }
                target.set(nombre);
            }
        }
        
        /**
         * Gets the "apellidos" element
         */
        public java.lang.String getApellidos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apellidos" element
         */
        public org.apache.xmlbeans.XmlString xgetApellidos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apellidos" element
         */
        public void setApellidos(java.lang.String apellidos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOS$2);
                }
                target.setStringValue(apellidos);
            }
        }
        
        /**
         * Sets (as xml) the "apellidos" element
         */
        public void xsetApellidos(org.apache.xmlbeans.XmlString apellidos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOS$2);
                }
                target.set(apellidos);
            }
        }
        
        /**
         * Gets the "curp" element
         */
        public java.lang.String getCurp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "curp" element
         */
        public org.apache.xmlbeans.XmlString xgetCurp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURP$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "curp" element
         */
        public void setCurp(java.lang.String curp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURP$4);
                }
                target.setStringValue(curp);
            }
        }
        
        /**
         * Sets (as xml) the "curp" element
         */
        public void xsetCurp(org.apache.xmlbeans.XmlString curp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURP$4);
                }
                target.set(curp);
            }
        }
        
        /**
         * Gets the "domicilio" element
         */
        public java.lang.String getDomicilio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "domicilio" element
         */
        public org.apache.xmlbeans.XmlString xgetDomicilio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "domicilio" element
         */
        public void setDomicilio(java.lang.String domicilio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILIO$6);
                }
                target.setStringValue(domicilio);
            }
        }
        
        /**
         * Sets (as xml) the "domicilio" element
         */
        public void xsetDomicilio(org.apache.xmlbeans.XmlString domicilio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILIO$6);
                }
                target.set(domicilio);
            }
        }
        
        /**
         * Gets the "salario" element
         */
        public double getSalario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARIO$8, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "salario" element
         */
        public org.apache.xmlbeans.XmlDouble xgetSalario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALARIO$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "salario" element
         */
        public void setSalario(double salario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARIO$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALARIO$8);
                }
                target.setDoubleValue(salario);
            }
        }
        
        /**
         * Sets (as xml) the "salario" element
         */
        public void xsetSalario(org.apache.xmlbeans.XmlDouble salario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALARIO$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SALARIO$8);
                }
                target.set(salario);
            }
        }
        
        /**
         * Gets the "monto" element
         */
        public double getMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$10, 0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$10);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTO$10);
                }
                target.set(monto);
            }
        }
        
        /**
         * Gets the "tasaInteres" element
         */
        public double getTasaInteres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAINTERES$12, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "tasaInteres" element
         */
        public org.apache.xmlbeans.XmlDouble xgetTasaInteres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TASAINTERES$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "tasaInteres" element
         */
        public void setTasaInteres(double tasaInteres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAINTERES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASAINTERES$12);
                }
                target.setDoubleValue(tasaInteres);
            }
        }
        
        /**
         * Sets (as xml) the "tasaInteres" element
         */
        public void xsetTasaInteres(org.apache.xmlbeans.XmlDouble tasaInteres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TASAINTERES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TASAINTERES$12);
                }
                target.set(tasaInteres);
            }
        }
        
        /**
         * Gets the "plazo" element
         */
        public int getPlazo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZO$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "plazo" element
         */
        public org.apache.xmlbeans.XmlInt xgetPlazo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PLAZO$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "plazo" element
         */
        public void setPlazo(int plazo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLAZO$14);
                }
                target.setIntValue(plazo);
            }
        }
        
        /**
         * Sets (as xml) the "plazo" element
         */
        public void xsetPlazo(org.apache.xmlbeans.XmlInt plazo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PLAZO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PLAZO$14);
                }
                target.set(plazo);
            }
        }
    }
}
