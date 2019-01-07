/*
 * An XML document type.
 * Localname: request
 * Namespace: http://itq.edu/soa
 * Java type: edu.itq.soa.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.itq.soa.impl;
/**
 * A document containing one request(@http://itq.edu/soa) element.
 *
 * This is a complex type.
 */
public class RequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.itq.soa.RequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("http://itq.edu/soa", "request");
    
    
    /**
     * Gets the "request" element
     */
    public edu.itq.soa.RequestDocument.Request getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.itq.soa.RequestDocument.Request target = null;
            target = (edu.itq.soa.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(edu.itq.soa.RequestDocument.Request request)
    {
        generatedSetterHelperImpl(request, REQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public edu.itq.soa.RequestDocument.Request addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.itq.soa.RequestDocument.Request target = null;
            target = (edu.itq.soa.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
    /**
     * An XML request(@http://itq.edu/soa).
     *
     * This is a complex type.
     */
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.itq.soa.RequestDocument.Request
    {
        private static final long serialVersionUID = 1L;
        
        public RequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOMBRE$0 = 
            new javax.xml.namespace.QName("http://itq.edu/soa", "nombre");
        private static final javax.xml.namespace.QName APELLIDOPATERNO$2 = 
            new javax.xml.namespace.QName("http://itq.edu/soa", "apellidoPaterno");
        private static final javax.xml.namespace.QName APELLIDOMATERNO$4 = 
            new javax.xml.namespace.QName("http://itq.edu/soa", "apellidoMaterno");
        
        
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
         * Gets the "apellidoPaterno" element
         */
        public java.lang.String getApellidoPaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOPATERNO$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOPATERNO$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOMATERNO$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOMATERNO$4);
                }
                target.set(apellidoMaterno);
            }
        }
    }
}
