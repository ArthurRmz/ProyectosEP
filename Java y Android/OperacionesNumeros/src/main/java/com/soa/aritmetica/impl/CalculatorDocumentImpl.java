/*
 * An XML document type.
 * Localname: calculator
 * Namespace: http://soa.com/aritmetica
 * Java type: com.soa.aritmetica.CalculatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.aritmetica.impl;
/**
 * A document containing one calculator(@http://soa.com/aritmetica) element.
 *
 * This is a complex type.
 */
public class CalculatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.aritmetica.CalculatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public CalculatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATOR$0 = 
        new javax.xml.namespace.QName("http://soa.com/aritmetica", "calculator");
    
    
    /**
     * Gets the "calculator" element
     */
    public com.soa.aritmetica.CalculatorDocument.Calculator getCalculator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.aritmetica.CalculatorDocument.Calculator target = null;
            target = (com.soa.aritmetica.CalculatorDocument.Calculator)get_store().find_element_user(CALCULATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "calculator" element
     */
    public void setCalculator(com.soa.aritmetica.CalculatorDocument.Calculator calculator)
    {
        generatedSetterHelperImpl(calculator, CALCULATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "calculator" element
     */
    public com.soa.aritmetica.CalculatorDocument.Calculator addNewCalculator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.aritmetica.CalculatorDocument.Calculator target = null;
            target = (com.soa.aritmetica.CalculatorDocument.Calculator)get_store().add_element_user(CALCULATOR$0);
            return target;
        }
    }
    /**
     * An XML calculator(@http://soa.com/aritmetica).
     *
     * This is a complex type.
     */
    public static class CalculatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.aritmetica.CalculatorDocument.Calculator
    {
        private static final long serialVersionUID = 1L;
        
        public CalculatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPERATOR$0 = 
            new javax.xml.namespace.QName("http://soa.com/aritmetica", "operator");
        private static final javax.xml.namespace.QName NUMBER1$2 = 
            new javax.xml.namespace.QName("http://soa.com/aritmetica", "number1");
        private static final javax.xml.namespace.QName NUMBER2$4 = 
            new javax.xml.namespace.QName("http://soa.com/aritmetica", "number2");
        
        
        /**
         * Gets the "operator" element
         */
        public java.lang.String getOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "operator" element
         */
        public org.apache.xmlbeans.XmlString xgetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "operator" element
         */
        public void setOperator(java.lang.String operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATOR$0);
                }
                target.setStringValue(operator);
            }
        }
        
        /**
         * Sets (as xml) the "operator" element
         */
        public void xsetOperator(org.apache.xmlbeans.XmlString operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATOR$0);
                }
                target.set(operator);
            }
        }
        
        /**
         * Gets the "number1" element
         */
        public double getNumber1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER1$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "number1" element
         */
        public org.apache.xmlbeans.XmlDouble xgetNumber1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NUMBER1$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "number1" element
         */
        public void setNumber1(double number1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER1$2);
                }
                target.setDoubleValue(number1);
            }
        }
        
        /**
         * Sets (as xml) the "number1" element
         */
        public void xsetNumber1(org.apache.xmlbeans.XmlDouble number1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NUMBER1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(NUMBER1$2);
                }
                target.set(number1);
            }
        }
        
        /**
         * Gets the "number2" element
         */
        public double getNumber2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER2$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "number2" element
         */
        public org.apache.xmlbeans.XmlDouble xgetNumber2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NUMBER2$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "number2" element
         */
        public void setNumber2(double number2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER2$4);
                }
                target.setDoubleValue(number2);
            }
        }
        
        /**
         * Sets (as xml) the "number2" element
         */
        public void xsetNumber2(org.apache.xmlbeans.XmlDouble number2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NUMBER2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(NUMBER2$4);
                }
                target.set(number2);
            }
        }
    }
}
