/*
 * An XML document type.
 * Localname: temperaturaFarenheit
 * Namespace: http://soa.com/grados
 * Java type: com.soa.grados.TemperaturaFarenheitDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.grados;


/**
 * A document containing one temperaturaFarenheit(@http://soa.com/grados) element.
 *
 * This is a complex type.
 */
public interface TemperaturaFarenheitDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TemperaturaFarenheitDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8438A8BF4BD1BAA78A0524E98D617980").resolveHandle("temperaturafarenheit53ecdoctype");
    
    /**
     * Gets the "temperaturaFarenheit" element
     */
    com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit getTemperaturaFarenheit();
    
    /**
     * Sets the "temperaturaFarenheit" element
     */
    void setTemperaturaFarenheit(com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit temperaturaFarenheit);
    
    /**
     * Appends and returns a new empty "temperaturaFarenheit" element
     */
    com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit addNewTemperaturaFarenheit();
    
    /**
     * An XML temperaturaFarenheit(@http://soa.com/grados).
     *
     * This is a complex type.
     */
    public interface TemperaturaFarenheit extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TemperaturaFarenheit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8438A8BF4BD1BAA78A0524E98D617980").resolveHandle("temperaturafarenheitae78elemtype");
        
        /**
         * Gets the "grados" element
         */
        double getGrados();
        
        /**
         * Gets (as xml) the "grados" element
         */
        org.apache.xmlbeans.XmlDouble xgetGrados();
        
        /**
         * Sets the "grados" element
         */
        void setGrados(double grados);
        
        /**
         * Sets (as xml) the "grados" element
         */
        void xsetGrados(org.apache.xmlbeans.XmlDouble grados);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit newInstance() {
              return (com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.grados.TemperaturaFarenheitDocument newInstance() {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.grados.TemperaturaFarenheitDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.grados.TemperaturaFarenheitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.grados.TemperaturaFarenheitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.grados.TemperaturaFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
