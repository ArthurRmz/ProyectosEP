/*
 * XML Type:  Pago
 * Namespace: http://soa.com
 * Java type: com.soa.Pago
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * An XML Pago(@http://soa.com).
 *
 * This is a complex type.
 */
public class PagoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.Pago
{
    private static final long serialVersionUID = 1L;
    
    public PagoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGOMENSUAL$0 = 
        new javax.xml.namespace.QName("http://soa.com", "PagoMensual");
    private static final javax.xml.namespace.QName INTERES$2 = 
        new javax.xml.namespace.QName("http://soa.com", "Interes");
    private static final javax.xml.namespace.QName PRINCIPAL$4 = 
        new javax.xml.namespace.QName("http://soa.com", "Principal");
    
    
    /**
     * Gets the "PagoMensual" element
     */
    public double getPagoMensual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGOMENSUAL$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "PagoMensual" element
     */
    public org.apache.xmlbeans.XmlDouble xgetPagoMensual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PAGOMENSUAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PagoMensual" element
     */
    public void setPagoMensual(double pagoMensual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGOMENSUAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGOMENSUAL$0);
            }
            target.setDoubleValue(pagoMensual);
        }
    }
    
    /**
     * Sets (as xml) the "PagoMensual" element
     */
    public void xsetPagoMensual(org.apache.xmlbeans.XmlDouble pagoMensual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PAGOMENSUAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PAGOMENSUAL$0);
            }
            target.set(pagoMensual);
        }
    }
    
    /**
     * Gets the "Interes" element
     */
    public double getInteres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERES$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Interes" element
     */
    public org.apache.xmlbeans.XmlDouble xgetInteres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERES$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Interes" element
     */
    public void setInteres(double interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERES$2);
            }
            target.setDoubleValue(interes);
        }
    }
    
    /**
     * Sets (as xml) the "Interes" element
     */
    public void xsetInteres(org.apache.xmlbeans.XmlDouble interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(INTERES$2);
            }
            target.set(interes);
        }
    }
    
    /**
     * Gets the "Principal" element
     */
    public double getPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPAL$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Principal" element
     */
    public org.apache.xmlbeans.XmlDouble xgetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRINCIPAL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Principal" element
     */
    public void setPrincipal(double principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRINCIPAL$4);
            }
            target.setDoubleValue(principal);
        }
    }
    
    /**
     * Sets (as xml) the "Principal" element
     */
    public void xsetPrincipal(org.apache.xmlbeans.XmlDouble principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRINCIPAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PRINCIPAL$4);
            }
            target.set(principal);
        }
    }
}
