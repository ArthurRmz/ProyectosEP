/*
 * An XML document type.
 * Localname: calculator
 * Namespace: http://soa.com/aritmetica
 * Java type: com.soa.aritmetica.CalculatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.aritmetica;


/**
 * A document containing one calculator(@http://soa.com/aritmetica) element.
 *
 * This is a complex type.
 */
public interface CalculatorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalculatorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s46BF649E400E21BF9D85391E7B5BAD10").resolveHandle("calculator01ebdoctype");
    
    /**
     * Gets the "calculator" element
     */
    com.soa.aritmetica.CalculatorDocument.Calculator getCalculator();
    
    /**
     * Sets the "calculator" element
     */
    void setCalculator(com.soa.aritmetica.CalculatorDocument.Calculator calculator);
    
    /**
     * Appends and returns a new empty "calculator" element
     */
    com.soa.aritmetica.CalculatorDocument.Calculator addNewCalculator();
    
    /**
     * An XML calculator(@http://soa.com/aritmetica).
     *
     * This is a complex type.
     */
    public interface Calculator extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Calculator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s46BF649E400E21BF9D85391E7B5BAD10").resolveHandle("calculator768delemtype");
        
        /**
         * Gets the "operator" element
         */
        java.lang.String getOperator();
        
        /**
         * Gets (as xml) the "operator" element
         */
        org.apache.xmlbeans.XmlString xgetOperator();
        
        /**
         * Sets the "operator" element
         */
        void setOperator(java.lang.String operator);
        
        /**
         * Sets (as xml) the "operator" element
         */
        void xsetOperator(org.apache.xmlbeans.XmlString operator);
        
        /**
         * Gets the "number1" element
         */
        double getNumber1();
        
        /**
         * Gets (as xml) the "number1" element
         */
        org.apache.xmlbeans.XmlDouble xgetNumber1();
        
        /**
         * Sets the "number1" element
         */
        void setNumber1(double number1);
        
        /**
         * Sets (as xml) the "number1" element
         */
        void xsetNumber1(org.apache.xmlbeans.XmlDouble number1);
        
        /**
         * Gets the "number2" element
         */
        double getNumber2();
        
        /**
         * Gets (as xml) the "number2" element
         */
        org.apache.xmlbeans.XmlDouble xgetNumber2();
        
        /**
         * Sets the "number2" element
         */
        void setNumber2(double number2);
        
        /**
         * Sets (as xml) the "number2" element
         */
        void xsetNumber2(org.apache.xmlbeans.XmlDouble number2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.aritmetica.CalculatorDocument.Calculator newInstance() {
              return (com.soa.aritmetica.CalculatorDocument.Calculator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.aritmetica.CalculatorDocument.Calculator newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.aritmetica.CalculatorDocument.Calculator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.aritmetica.CalculatorDocument newInstance() {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.aritmetica.CalculatorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.aritmetica.CalculatorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.aritmetica.CalculatorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.aritmetica.CalculatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.aritmetica.CalculatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.aritmetica.CalculatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
