/*
 * An XML document type.
 * Localname: resquestService
 * Namespace: http://soa.com
 * Java type: com.soa.ResquestServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one resquestService(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class ResquestServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ResquestServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResquestServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESQUESTSERVICE$0 = 
        new javax.xml.namespace.QName("http://soa.com", "resquestService");
    
    
    /**
     * Gets the "resquestService" element
     */
    public com.soa.ResquestServiceDocument.ResquestService getResquestService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ResquestServiceDocument.ResquestService target = null;
            target = (com.soa.ResquestServiceDocument.ResquestService)get_store().find_element_user(RESQUESTSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resquestService" element
     */
    public void setResquestService(com.soa.ResquestServiceDocument.ResquestService resquestService)
    {
        generatedSetterHelperImpl(resquestService, RESQUESTSERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resquestService" element
     */
    public com.soa.ResquestServiceDocument.ResquestService addNewResquestService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ResquestServiceDocument.ResquestService target = null;
            target = (com.soa.ResquestServiceDocument.ResquestService)get_store().add_element_user(RESQUESTSERVICE$0);
            return target;
        }
    }
    /**
     * An XML resquestService(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class ResquestServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ResquestServiceDocument.ResquestService
    {
        private static final long serialVersionUID = 1L;
        
        public ResquestServiceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOTARJETA$0 = 
            new javax.xml.namespace.QName("http://soa.com", "noTarjeta");
        private static final javax.xml.namespace.QName CODSEGTARJETA$2 = 
            new javax.xml.namespace.QName("http://soa.com", "codSegTarjeta");
        private static final javax.xml.namespace.QName FECHAEXPIRACION$4 = 
            new javax.xml.namespace.QName("http://soa.com", "fechaExpiracion");
        private static final javax.xml.namespace.QName MONTO$6 = 
            new javax.xml.namespace.QName("http://soa.com", "monto");
        
        
        /**
         * Gets the "noTarjeta" element
         */
        public int getNoTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTARJETA$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "noTarjeta" element
         */
        public org.apache.xmlbeans.XmlInt xgetNoTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOTARJETA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "noTarjeta" element
         */
        public void setNoTarjeta(int noTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTARJETA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTARJETA$0);
                }
                target.setIntValue(noTarjeta);
            }
        }
        
        /**
         * Sets (as xml) the "noTarjeta" element
         */
        public void xsetNoTarjeta(org.apache.xmlbeans.XmlInt noTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOTARJETA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NOTARJETA$0);
                }
                target.set(noTarjeta);
            }
        }
        
        /**
         * Gets the "codSegTarjeta" element
         */
        public int getCodSegTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODSEGTARJETA$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "codSegTarjeta" element
         */
        public org.apache.xmlbeans.XmlInt xgetCodSegTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODSEGTARJETA$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "codSegTarjeta" element
         */
        public void setCodSegTarjeta(int codSegTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODSEGTARJETA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODSEGTARJETA$2);
                }
                target.setIntValue(codSegTarjeta);
            }
        }
        
        /**
         * Sets (as xml) the "codSegTarjeta" element
         */
        public void xsetCodSegTarjeta(org.apache.xmlbeans.XmlInt codSegTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODSEGTARJETA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODSEGTARJETA$2);
                }
                target.set(codSegTarjeta);
            }
        }
        
        /**
         * Gets the "fechaExpiracion" element
         */
        public java.lang.String getFechaExpiracion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAEXPIRACION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fechaExpiracion" element
         */
        public org.apache.xmlbeans.XmlString xgetFechaExpiracion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAEXPIRACION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fechaExpiracion" element
         */
        public void setFechaExpiracion(java.lang.String fechaExpiracion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAEXPIRACION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHAEXPIRACION$4);
                }
                target.setStringValue(fechaExpiracion);
            }
        }
        
        /**
         * Sets (as xml) the "fechaExpiracion" element
         */
        public void xsetFechaExpiracion(org.apache.xmlbeans.XmlString fechaExpiracion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAEXPIRACION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHAEXPIRACION$4);
                }
                target.set(fechaExpiracion);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$6, 0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$6);
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
