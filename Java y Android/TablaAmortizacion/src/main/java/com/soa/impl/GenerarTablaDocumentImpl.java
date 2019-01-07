/*
 * An XML document type.
 * Localname: generarTabla
 * Namespace: http://soa.com
 * Java type: com.soa.GenerarTablaDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.impl;
/**
 * A document containing one generarTabla(@http://soa.com) element.
 *
 * This is a complex type.
 */
public class GenerarTablaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.GenerarTablaDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenerarTablaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERARTABLA$0 = 
        new javax.xml.namespace.QName("http://soa.com", "generarTabla");
    
    
    /**
     * Gets the "generarTabla" element
     */
    public com.soa.GenerarTablaDocument.GenerarTabla getGenerarTabla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.GenerarTablaDocument.GenerarTabla target = null;
            target = (com.soa.GenerarTablaDocument.GenerarTabla)get_store().find_element_user(GENERARTABLA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "generarTabla" element
     */
    public void setGenerarTabla(com.soa.GenerarTablaDocument.GenerarTabla generarTabla)
    {
        generatedSetterHelperImpl(generarTabla, GENERARTABLA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "generarTabla" element
     */
    public com.soa.GenerarTablaDocument.GenerarTabla addNewGenerarTabla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.GenerarTablaDocument.GenerarTabla target = null;
            target = (com.soa.GenerarTablaDocument.GenerarTabla)get_store().add_element_user(GENERARTABLA$0);
            return target;
        }
    }
    /**
     * An XML generarTabla(@http://soa.com).
     *
     * This is a complex type.
     */
    public static class GenerarTablaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.GenerarTablaDocument.GenerarTabla
    {
        private static final long serialVersionUID = 1L;
        
        public GenerarTablaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PAGO$0 = 
            new javax.xml.namespace.QName("http://soa.com", "Pago");
        
        
        /**
         * Gets array of all "Pago" elements
         */
        public com.soa.Pago[] getPagoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PAGO$0, targetList);
                com.soa.Pago[] result = new com.soa.Pago[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Pago" element
         */
        public com.soa.Pago getPagoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.soa.Pago target = null;
                target = (com.soa.Pago)get_store().find_element_user(PAGO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Pago" element
         */
        public int sizeOfPagoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAGO$0);
            }
        }
        
        /**
         * Sets array of all "Pago" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPagoArray(com.soa.Pago[] pagoArray)
        {
            check_orphaned();
            arraySetterHelper(pagoArray, PAGO$0);
        }
        
        /**
         * Sets ith "Pago" element
         */
        public void setPagoArray(int i, com.soa.Pago pago)
        {
            generatedSetterHelperImpl(pago, PAGO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Pago" element
         */
        public com.soa.Pago insertNewPago(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.soa.Pago target = null;
                target = (com.soa.Pago)get_store().insert_element_user(PAGO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Pago" element
         */
        public com.soa.Pago addNewPago()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.soa.Pago target = null;
                target = (com.soa.Pago)get_store().add_element_user(PAGO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Pago" element
         */
        public void removePago(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAGO$0, i);
            }
        }
    }
}
