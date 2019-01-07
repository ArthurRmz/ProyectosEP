/*
 * An XML document type.
 * Localname: solicitarCredito
 * Namespace: http://soa.com
 * Java type: com.soa.SolicitarCreditoDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa;


/**
 * A document containing one solicitarCredito(@http://soa.com) element.
 *
 * This is a complex type.
 */
public interface SolicitarCreditoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SolicitarCreditoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6300A79F1472F96116D13CD5A5B68438").resolveHandle("solicitarcreditof07ddoctype");
    
    /**
     * Gets the "solicitarCredito" element
     */
    com.soa.SolicitarCreditoDocument.SolicitarCredito getSolicitarCredito();
    
    /**
     * Sets the "solicitarCredito" element
     */
    void setSolicitarCredito(com.soa.SolicitarCreditoDocument.SolicitarCredito solicitarCredito);
    
    /**
     * Appends and returns a new empty "solicitarCredito" element
     */
    com.soa.SolicitarCreditoDocument.SolicitarCredito addNewSolicitarCredito();
    
    /**
     * An XML solicitarCredito(@http://soa.com).
     *
     * This is a complex type.
     */
    public interface SolicitarCredito extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SolicitarCredito.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6300A79F1472F96116D13CD5A5B68438").resolveHandle("solicitarcredito9b89elemtype");
        
        /**
         * Gets the "Curp" element
         */
        java.lang.String getCurp();
        
        /**
         * Gets (as xml) the "Curp" element
         */
        org.apache.xmlbeans.XmlString xgetCurp();
        
        /**
         * Sets the "Curp" element
         */
        void setCurp(java.lang.String curp);
        
        /**
         * Sets (as xml) the "Curp" element
         */
        void xsetCurp(org.apache.xmlbeans.XmlString curp);
        
        /**
         * Gets the "Domicilio" element
         */
        java.lang.String getDomicilio();
        
        /**
         * Gets (as xml) the "Domicilio" element
         */
        org.apache.xmlbeans.XmlString xgetDomicilio();
        
        /**
         * Sets the "Domicilio" element
         */
        void setDomicilio(java.lang.String domicilio);
        
        /**
         * Sets (as xml) the "Domicilio" element
         */
        void xsetDomicilio(org.apache.xmlbeans.XmlString domicilio);
        
        /**
         * Gets the "Salario" element
         */
        double getSalario();
        
        /**
         * Gets (as xml) the "Salario" element
         */
        org.apache.xmlbeans.XmlDouble xgetSalario();
        
        /**
         * Sets the "Salario" element
         */
        void setSalario(double salario);
        
        /**
         * Sets (as xml) the "Salario" element
         */
        void xsetSalario(org.apache.xmlbeans.XmlDouble salario);
        
        /**
         * Gets the "Monto" element
         */
        double getMonto();
        
        /**
         * Gets (as xml) the "Monto" element
         */
        org.apache.xmlbeans.XmlDouble xgetMonto();
        
        /**
         * Sets the "Monto" element
         */
        void setMonto(double monto);
        
        /**
         * Sets (as xml) the "Monto" element
         */
        void xsetMonto(org.apache.xmlbeans.XmlDouble monto);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.SolicitarCreditoDocument.SolicitarCredito newInstance() {
              return (com.soa.SolicitarCreditoDocument.SolicitarCredito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.SolicitarCreditoDocument.SolicitarCredito newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.SolicitarCreditoDocument.SolicitarCredito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.SolicitarCreditoDocument newInstance() {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.SolicitarCreditoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.SolicitarCreditoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.SolicitarCreditoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.SolicitarCreditoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.SolicitarCreditoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.SolicitarCreditoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.SolicitarCreditoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.SolicitarCreditoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.SolicitarCreditoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.SolicitarCreditoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.SolicitarCreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
