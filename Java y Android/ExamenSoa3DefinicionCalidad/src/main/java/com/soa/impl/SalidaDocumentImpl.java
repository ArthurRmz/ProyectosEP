/*
 * An XML document type.
 * Localname: salida
 * Namespace: http://soa.com
 * Java type: com.soa.SalidaDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one salida(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class SalidaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SalidaDocument
{
    private static final long serialVersionUID = 1L;
    
    public SalidaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALIDA$0 = 
        new javax.xml.namespace.QName("http://soa.com", "salida");
    
    
    /**
     * Gets the "salida" element
     */
    public com.soa.SalidaDocument.Salida getSalida()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SalidaDocument.Salida target = null;
            target = (com.soa.SalidaDocument.Salida)get_store().find_element_user(SALIDA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "salida" element
     */
    public void setSalida(com.soa.SalidaDocument.Salida salida)
    {
        generatedSetterHelperImpl(salida, SALIDA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "salida" element
     */
    public com.soa.SalidaDocument.Salida addNewSalida()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.SalidaDocument.Salida target = null;
            target = (com.soa.SalidaDocument.Salida)get_store().add_element_user(SALIDA$0);
            return target;
        }
    }
    /**
     * An XML salida(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class SalidaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.SalidaDocument.Salida
    {
        private static final long serialVersionUID = 1L;
        
        public SalidaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CALIDAD$0 = 
            new javax.xml.namespace.QName("http://soa.com", "calidad");
        
        
        /**
         * Gets the "calidad" element
         */
        public java.lang.String getCalidad()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALIDAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "calidad" element
         */
        public org.apache.xmlbeans.XmlString xgetCalidad()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALIDAD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "calidad" element
         */
        public void setCalidad(java.lang.String calidad)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALIDAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALIDAD$0);
                }
                target.setStringValue(calidad);
            }
        }
        
        /**
         * Sets (as xml) the "calidad" element
         */
        public void xsetCalidad(org.apache.xmlbeans.XmlString calidad)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALIDAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALIDAD$0);
                }
                target.set(calidad);
            }
        }
    }
}
