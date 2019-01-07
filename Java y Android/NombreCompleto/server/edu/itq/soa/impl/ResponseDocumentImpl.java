/*
 * An XML document type.
 * Localname: response
 * Namespace: http://itq.edu/soa
 * Java type: edu.itq.soa.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.itq.soa.impl;
/**
 * A document containing one response(@http://itq.edu/soa) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.itq.soa.ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://itq.edu/soa", "response");
    
    
    /**
     * Gets the "response" element
     */
    public edu.itq.soa.ResponseDocument.Response getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.itq.soa.ResponseDocument.Response target = null;
            target = (edu.itq.soa.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(edu.itq.soa.ResponseDocument.Response response)
    {
        generatedSetterHelperImpl(response, RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public edu.itq.soa.ResponseDocument.Response addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.itq.soa.ResponseDocument.Response target = null;
            target = (edu.itq.soa.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML response(@http://itq.edu/soa).
     *
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.itq.soa.ResponseDocument.Response
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOMBRECOMPLETO$0 = 
            new javax.xml.namespace.QName("http://itq.edu/soa", "nombreCompleto");
        
        
        /**
         * Gets the "nombreCompleto" element
         */
        public java.lang.String getNombreCompleto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRECOMPLETO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nombreCompleto" element
         */
        public org.apache.xmlbeans.XmlString xgetNombreCompleto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRECOMPLETO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nombreCompleto" element
         */
        public void setNombreCompleto(java.lang.String nombreCompleto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRECOMPLETO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRECOMPLETO$0);
                }
                target.setStringValue(nombreCompleto);
            }
        }
        
        /**
         * Sets (as xml) the "nombreCompleto" element
         */
        public void xsetNombreCompleto(org.apache.xmlbeans.XmlString nombreCompleto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRECOMPLETO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRECOMPLETO$0);
                }
                target.set(nombreCompleto);
            }
        }
    }
}
