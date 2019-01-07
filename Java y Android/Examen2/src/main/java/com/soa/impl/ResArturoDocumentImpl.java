/*
 * An XML document type.
 * Localname: resArturo
 * Namespace: http://soa.com
 * Java type: com.soa.ResArturoDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one resArturo(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class ResArturoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ResArturoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResArturoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESARTURO$0 = 
        new javax.xml.namespace.QName("http://soa.com", "resArturo");
    
    
    /**
     * Gets the "resArturo" element
     */
    public com.soa.ResArturoDocument.ResArturo getResArturo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ResArturoDocument.ResArturo target = null;
            target = (com.soa.ResArturoDocument.ResArturo)get_store().find_element_user(RESARTURO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resArturo" element
     */
    public void setResArturo(com.soa.ResArturoDocument.ResArturo resArturo)
    {
        generatedSetterHelperImpl(resArturo, RESARTURO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resArturo" element
     */
    public com.soa.ResArturoDocument.ResArturo addNewResArturo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.ResArturoDocument.ResArturo target = null;
            target = (com.soa.ResArturoDocument.ResArturo)get_store().add_element_user(RESARTURO$0);
            return target;
        }
    }
    /**
     * An XML resArturo(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class ResArturoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.ResArturoDocument.ResArturo
    {
        private static final long serialVersionUID = 1L;
        
        public ResArturoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INICIALES$0 = 
            new javax.xml.namespace.QName("http://soa.com", "iniciales");
        
        
        /**
         * Gets the "iniciales" element
         */
        public java.lang.String getIniciales()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INICIALES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "iniciales" element
         */
        public org.apache.xmlbeans.XmlString xgetIniciales()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INICIALES$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "iniciales" element
         */
        public void setIniciales(java.lang.String iniciales)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INICIALES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INICIALES$0);
                }
                target.setStringValue(iniciales);
            }
        }
        
        /**
         * Sets (as xml) the "iniciales" element
         */
        public void xsetIniciales(org.apache.xmlbeans.XmlString iniciales)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INICIALES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INICIALES$0);
                }
                target.set(iniciales);
            }
        }
    }
}
