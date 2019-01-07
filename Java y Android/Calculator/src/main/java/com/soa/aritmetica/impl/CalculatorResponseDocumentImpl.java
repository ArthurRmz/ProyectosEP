/*
 * An XML document type.
 * Localname: calculatorResponse
 * Namespace: http://soa.com/aritmetica
 * Java type: com.soa.aritmetica.CalculatorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.aritmetica.impl;
/**
 * A document containing one calculatorResponse(@http://soa.com/aritmetica) element.
 *
 * This is a complex type.
 */
public class CalculatorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.aritmetica.CalculatorResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CalculatorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://soa.com/aritmetica", "calculatorResponse");
    
    
    /**
     * Gets the "calculatorResponse" element
     */
    public com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse getCalculatorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse target = null;
            target = (com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse)get_store().find_element_user(CALCULATORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "calculatorResponse" element
     */
    public void setCalculatorResponse(com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse calculatorResponse)
    {
        generatedSetterHelperImpl(calculatorResponse, CALCULATORRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "calculatorResponse" element
     */
    public com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse addNewCalculatorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse target = null;
            target = (com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse)get_store().add_element_user(CALCULATORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML calculatorResponse(@http://soa.com/aritmetica).
     *
     * This is a complex type.
     */
    public static class CalculatorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CalculatorResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTADO$0 = 
            new javax.xml.namespace.QName("http://soa.com/aritmetica", "resultado");
        
        
        /**
         * Gets the "resultado" element
         */
        public double getResultado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTADO$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "resultado" element
         */
        public org.apache.xmlbeans.XmlDouble xgetResultado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RESULTADO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "resultado" element
         */
        public void setResultado(double resultado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTADO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTADO$0);
                }
                target.setDoubleValue(resultado);
            }
        }
        
        /**
         * Sets (as xml) the "resultado" element
         */
        public void xsetResultado(org.apache.xmlbeans.XmlDouble resultado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RESULTADO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(RESULTADO$0);
                }
                target.set(resultado);
            }
        }
    }
}
