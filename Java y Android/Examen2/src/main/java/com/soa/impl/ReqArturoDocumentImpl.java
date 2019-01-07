/*
 * An XML document type.
 * Localname: reqArturo
 * Namespace: http://soa.com
 * Java type: com.soa.ReqArturoDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one reqArturo(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class ReqArturoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ReqArturoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReqArturoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQARTURO$0 = 
        new javax.xml.namespace.QName("http://soa.com", "reqArturo");
    
    
    /**
     * Gets the "reqArturo" element
     */
    public com.soa.ReqArturoDocument.ReqArturo getReqArturo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ReqArturoDocument.ReqArturo target = null;
            target = (com.soa.ReqArturoDocument.ReqArturo)get_store().find_element_user(REQARTURO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reqArturo" element
     */
    public void setReqArturo(com.soa.ReqArturoDocument.ReqArturo reqArturo)
    {
        generatedSetterHelperImpl(reqArturo, REQARTURO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reqArturo" element
     */
    public com.soa.ReqArturoDocument.ReqArturo addNewReqArturo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ReqArturoDocument.ReqArturo target = null;
            target = (com.soa.ReqArturoDocument.ReqArturo)get_store().add_element_user(REQARTURO$0);
            return target;
        }
    }
    /**
     * An XML reqArturo(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class ReqArturoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ReqArturoDocument.ReqArturo
    {
        private static final long serialVersionUID = 1L;
        
        public ReqArturoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APELLIDOPATERNO$0 = 
            new javax.xml.namespace.QName("http://soa.com", "apellidoPaterno");
        private static final javax.xml.namespace.QName APELLIDOMATERNO$2 = 
            new javax.xml.namespace.QName("http://soa.com", "apellidoMaterno");
        private static final javax.xml.namespace.QName NOMBRES$4 = 
            new javax.xml.namespace.QName("http://soa.com", "nombres");
        
        
        /**
         * Gets the "apellidoPaterno" element
         */
        public java.lang.String getApellidoPaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apellidoPaterno" element
         */
        public org.apache.xmlbeans.XmlString xgetApellidoPaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apellidoPaterno" element
         */
        public void setApellidoPaterno(java.lang.String apellidoPaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOPATERNO$0);
                }
                target.setStringValue(apellidoPaterno);
            }
        }
        
        /**
         * Sets (as xml) the "apellidoPaterno" element
         */
        public void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOPATERNO$0);
                }
                target.set(apellidoPaterno);
            }
        }
        
        /**
         * Gets the "apellidoMaterno" element
         */
        public java.lang.String getApellidoMaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apellidoMaterno" element
         */
        public org.apache.xmlbeans.XmlString xgetApellidoMaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apellidoMaterno" element
         */
        public void setApellidoMaterno(java.lang.String apellidoMaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOMATERNO$2);
                }
                target.setStringValue(apellidoMaterno);
            }
        }
        
        /**
         * Sets (as xml) the "apellidoMaterno" element
         */
        public void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOMATERNO$2);
                }
                target.set(apellidoMaterno);
            }
        }
        
        /**
         * Gets the "nombres" element
         */
        public java.lang.String getNombres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRES$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRES$4);
                }
                target.set(nombres);
            }
        }
    }
}
