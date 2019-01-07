/*
 * An XML document type.
 * Localname: solicitarCredito
 * Namespace: http://soa.com
 * Java type: com.soa.SolicitarCreditoDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one solicitarCredito(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class SolicitarCreditoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SolicitarCreditoDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolicitarCreditoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITARCREDITO$0 = 
        new javax.xml.namespace.QName("http://soa.com", "solicitarCredito");
    
    
    /**
     * Gets the "solicitarCredito" element
     */
    public com.soa.SolicitarCreditoDocument.SolicitarCredito getSolicitarCredito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SolicitarCreditoDocument.SolicitarCredito target = null;
            target = (com.soa.SolicitarCreditoDocument.SolicitarCredito)get_store().find_element_user(SOLICITARCREDITO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitarCredito" element
     */
    public void setSolicitarCredito(com.soa.SolicitarCreditoDocument.SolicitarCredito solicitarCredito)
    {
        generatedSetterHelperImpl(solicitarCredito, SOLICITARCREDITO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solicitarCredito" element
     */
    public com.soa.SolicitarCreditoDocument.SolicitarCredito addNewSolicitarCredito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SolicitarCreditoDocument.SolicitarCredito target = null;
            target = (com.soa.SolicitarCreditoDocument.SolicitarCredito)get_store().add_element_user(SOLICITARCREDITO$0);
            return target;
        }
    }
    /**
     * An XML solicitarCredito(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class SolicitarCreditoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SolicitarCreditoDocument.SolicitarCredito
    {
        private static final long serialVersionUID = 1L;
        
        public SolicitarCreditoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CURP$0 = 
            new javax.xml.namespace.QName("http://soa.com", "Curp");
        private static final javax.xml.namespace.QName DOMICILIO$2 = 
            new javax.xml.namespace.QName("http://soa.com", "Domicilio");
        private static final javax.xml.namespace.QName SALARIO$4 = 
            new javax.xml.namespace.QName("http://soa.com", "Salario");
        private static final javax.xml.namespace.QName MONTO$6 = 
            new javax.xml.namespace.QName("http://soa.com", "Monto");
        
        
        /**
         * Gets the "Curp" element
         */
        public java.lang.String getCurp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Curp" element
         */
        public org.apache.xmlbeans.XmlString xgetCurp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURP$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Curp" element
         */
        public void setCurp(java.lang.String curp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURP$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURP$0);
                }
                target.setStringValue(curp);
            }
        }
        
        /**
         * Sets (as xml) the "Curp" element
         */
        public void xsetCurp(org.apache.xmlbeans.XmlString curp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURP$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURP$0);
                }
                target.set(curp);
            }
        }
        
        /**
         * Gets the "Domicilio" element
         */
        public java.lang.String getDomicilio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Domicilio" element
         */
        public org.apache.xmlbeans.XmlString xgetDomicilio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Domicilio" element
         */
        public void setDomicilio(java.lang.String domicilio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILIO$2);
                }
                target.setStringValue(domicilio);
            }
        }
        
        /**
         * Sets (as xml) the "Domicilio" element
         */
        public void xsetDomicilio(org.apache.xmlbeans.XmlString domicilio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILIO$2);
                }
                target.set(domicilio);
            }
        }
        
        /**
         * Gets the "Salario" element
         */
        public double getSalario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARIO$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "Salario" element
         */
        public org.apache.xmlbeans.XmlDouble xgetSalario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALARIO$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Salario" element
         */
        public void setSalario(double salario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARIO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALARIO$4);
                }
                target.setDoubleValue(salario);
            }
        }
        
        /**
         * Sets (as xml) the "Salario" element
         */
        public void xsetSalario(org.apache.xmlbeans.XmlDouble salario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALARIO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SALARIO$4);
                }
                target.set(salario);
            }
        }
        
        /**
         * Gets the "Monto" element
         */
        public double getMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$6, 0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$6);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTO$6);
                }
                target.set(monto);
            }
        }
    }
}
