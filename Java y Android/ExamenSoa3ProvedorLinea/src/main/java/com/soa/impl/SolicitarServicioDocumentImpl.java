/*
 * An XML document type.
 * Localname: solicitarServicio
 * Namespace: http://soa.com
 * Java type: com.soa.SolicitarServicioDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one solicitarServicio(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class SolicitarServicioDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SolicitarServicioDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolicitarServicioDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITARSERVICIO$0 = 
        new javax.xml.namespace.QName("http://soa.com", "solicitarServicio");
    
    
    /**
     * Gets the "solicitarServicio" element
     */
    public com.soa.SolicitarServicioDocument.SolicitarServicio getSolicitarServicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SolicitarServicioDocument.SolicitarServicio target = null;
            target = (com.soa.SolicitarServicioDocument.SolicitarServicio)get_store().find_element_user(SOLICITARSERVICIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitarServicio" element
     */
    public void setSolicitarServicio(com.soa.SolicitarServicioDocument.SolicitarServicio solicitarServicio)
    {
        generatedSetterHelperImpl(solicitarServicio, SOLICITARSERVICIO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solicitarServicio" element
     */
    public com.soa.SolicitarServicioDocument.SolicitarServicio addNewSolicitarServicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SolicitarServicioDocument.SolicitarServicio target = null;
            target = (com.soa.SolicitarServicioDocument.SolicitarServicio)get_store().add_element_user(SOLICITARSERVICIO$0);
            return target;
        }
    }
    /**
     * An XML solicitarServicio(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class SolicitarServicioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SolicitarServicioDocument.SolicitarServicio
    {
        private static final long serialVersionUID = 1L;
        
        public SolicitarServicioImpl(org.apache.xmlbeans.SchemaType sType)
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
