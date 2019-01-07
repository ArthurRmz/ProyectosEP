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
        
        private static final javax.xml.namespace.QName NOMBRES$0 = 
            new javax.xml.namespace.QName("http://soa.com", "nombres");
        private static final javax.xml.namespace.QName APEPATERNO$2 = 
            new javax.xml.namespace.QName("http://soa.com", "apePaterno");
        private static final javax.xml.namespace.QName APEMATERNO$4 = 
            new javax.xml.namespace.QName("http://soa.com", "apeMaterno");
        private static final javax.xml.namespace.QName CORREO$6 = 
            new javax.xml.namespace.QName("http://soa.com", "correo");
        private static final javax.xml.namespace.QName NOTARJETA$8 = 
            new javax.xml.namespace.QName("http://soa.com", "noTarjeta");
        private static final javax.xml.namespace.QName CODSEGTARJETA$10 = 
            new javax.xml.namespace.QName("http://soa.com", "codSegTarjeta");
        private static final javax.xml.namespace.QName FECHAEXPIRACION$12 = 
            new javax.xml.namespace.QName("http://soa.com", "fechaExpiracion");
        private static final javax.xml.namespace.QName MONTO$14 = 
            new javax.xml.namespace.QName("http://soa.com", "monto");
        
        
        /**
         * Gets the "nombres" element
         */
        public java.lang.String getNombres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nombres" element
         */
        public org.apache.xmlbeans.XmlString xgetNombres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nombres" element
         */
        public void setNombres(java.lang.String nombres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRES$0);
                }
                target.setStringValue(nombres);
            }
        }
        
        /**
         * Sets (as xml) the "nombres" element
         */
        public void xsetNombres(org.apache.xmlbeans.XmlString nombres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRES$0);
                }
                target.set(nombres);
            }
        }
        
        /**
         * Gets the "apePaterno" element
         */
        public java.lang.String getApePaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APEPATERNO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apePaterno" element
         */
        public org.apache.xmlbeans.XmlString xgetApePaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APEPATERNO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apePaterno" element
         */
        public void setApePaterno(java.lang.String apePaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APEPATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APEPATERNO$2);
                }
                target.setStringValue(apePaterno);
            }
        }
        
        /**
         * Sets (as xml) the "apePaterno" element
         */
        public void xsetApePaterno(org.apache.xmlbeans.XmlString apePaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APEPATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APEPATERNO$2);
                }
                target.set(apePaterno);
            }
        }
        
        /**
         * Gets the "apeMaterno" element
         */
        public java.lang.String getApeMaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APEMATERNO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apeMaterno" element
         */
        public org.apache.xmlbeans.XmlString xgetApeMaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APEMATERNO$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apeMaterno" element
         */
        public void setApeMaterno(java.lang.String apeMaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APEMATERNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APEMATERNO$4);
                }
                target.setStringValue(apeMaterno);
            }
        }
        
        /**
         * Sets (as xml) the "apeMaterno" element
         */
        public void xsetApeMaterno(org.apache.xmlbeans.XmlString apeMaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APEMATERNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APEMATERNO$4);
                }
                target.set(apeMaterno);
            }
        }
        
        /**
         * Gets the "correo" element
         */
        public java.lang.String getCorreo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORREO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "correo" element
         */
        public org.apache.xmlbeans.XmlString xgetCorreo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORREO$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "correo" element
         */
        public void setCorreo(java.lang.String correo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORREO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORREO$6);
                }
                target.setStringValue(correo);
            }
        }
        
        /**
         * Sets (as xml) the "correo" element
         */
        public void xsetCorreo(org.apache.xmlbeans.XmlString correo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORREO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORREO$6);
                }
                target.set(correo);
            }
        }
        
        /**
         * Gets the "noTarjeta" element
         */
        public java.lang.String getNoTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTARJETA$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "noTarjeta" element
         */
        public org.apache.xmlbeans.XmlString xgetNoTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTARJETA$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "noTarjeta" element
         */
        public void setNoTarjeta(java.lang.String noTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTARJETA$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTARJETA$8);
                }
                target.setStringValue(noTarjeta);
            }
        }
        
        /**
         * Sets (as xml) the "noTarjeta" element
         */
        public void xsetNoTarjeta(org.apache.xmlbeans.XmlString noTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTARJETA$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTARJETA$8);
                }
                target.set(noTarjeta);
            }
        }
        
        /**
         * Gets the "codSegTarjeta" element
         */
        public java.lang.String getCodSegTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODSEGTARJETA$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "codSegTarjeta" element
         */
        public org.apache.xmlbeans.XmlString xgetCodSegTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODSEGTARJETA$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "codSegTarjeta" element
         */
        public void setCodSegTarjeta(java.lang.String codSegTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODSEGTARJETA$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODSEGTARJETA$10);
                }
                target.setStringValue(codSegTarjeta);
            }
        }
        
        /**
         * Sets (as xml) the "codSegTarjeta" element
         */
        public void xsetCodSegTarjeta(org.apache.xmlbeans.XmlString codSegTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODSEGTARJETA$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODSEGTARJETA$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAEXPIRACION$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAEXPIRACION$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAEXPIRACION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHAEXPIRACION$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAEXPIRACION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHAEXPIRACION$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$14, 0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$14);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTO$14);
                }
                target.set(monto);
            }
        }
    }
}
