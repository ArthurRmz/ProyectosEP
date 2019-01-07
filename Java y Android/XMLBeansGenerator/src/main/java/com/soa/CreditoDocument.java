/*
 * An XML document type.
 * Localname: credito
 * Namespace: http://soa.com
 * Java type: com.soa.CreditoDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa;


/**
 * A document containing one credito(@http://soa.com) element.
 *
 * This is a complex type.
 */
public interface CreditoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4137487F1B589A0DA30EE2F2DB314A68").resolveHandle("creditoefe9doctype");
    
    /**
     * Gets the "credito" element
     */
    com.soa.CreditoDocument.Credito getCredito();
    
    /**
     * Sets the "credito" element
     */
    void setCredito(com.soa.CreditoDocument.Credito credito);
    
    /**
     * Appends and returns a new empty "credito" element
     */
    com.soa.CreditoDocument.Credito addNewCredito();
    
    /**
     * An XML credito(@http://soa.com).
     *
     * This is a complex type.
     */
    public interface Credito extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Credito.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4137487F1B589A0DA30EE2F2DB314A68").resolveHandle("credito6527elemtype");
        
        /**
         * Gets the "nombre" element
         */
        java.lang.String getNombre();
        
        /**
         * Gets (as xml) the "nombre" element
         */
        org.apache.xmlbeans.XmlString xgetNombre();
        
        /**
         * Sets the "nombre" element
         */
        void setNombre(java.lang.String nombre);
        
        /**
         * Sets (as xml) the "nombre" element
         */
        void xsetNombre(org.apache.xmlbeans.XmlString nombre);
        
        /**
         * Gets the "apellidos" element
         */
        java.lang.String getApellidos();
        
        /**
         * Gets (as xml) the "apellidos" element
         */
        org.apache.xmlbeans.XmlString xgetApellidos();
        
        /**
         * Sets the "apellidos" element
         */
        void setApellidos(java.lang.String apellidos);
        
        /**
         * Sets (as xml) the "apellidos" element
         */
        void xsetApellidos(org.apache.xmlbeans.XmlString apellidos);
        
        /**
         * Gets the "curp" element
         */
        java.lang.String getCurp();
        
        /**
         * Gets (as xml) the "curp" element
         */
        org.apache.xmlbeans.XmlString xgetCurp();
        
        /**
         * Sets the "curp" element
         */
        void setCurp(java.lang.String curp);
        
        /**
         * Sets (as xml) the "curp" element
         */
        void xsetCurp(org.apache.xmlbeans.XmlString curp);
        
        /**
         * Gets the "domicilio" element
         */
        java.lang.String getDomicilio();
        
        /**
         * Gets (as xml) the "domicilio" element
         */
        org.apache.xmlbeans.XmlString xgetDomicilio();
        
        /**
         * Sets the "domicilio" element
         */
        void setDomicilio(java.lang.String domicilio);
        
        /**
         * Sets (as xml) the "domicilio" element
         */
        void xsetDomicilio(org.apache.xmlbeans.XmlString domicilio);
        
        /**
         * Gets the "salario" element
         */
        double getSalario();
        
        /**
         * Gets (as xml) the "salario" element
         */
        org.apache.xmlbeans.XmlDouble xgetSalario();
        
        /**
         * Sets the "salario" element
         */
        void setSalario(double salario);
        
        /**
         * Sets (as xml) the "salario" element
         */
        void xsetSalario(org.apache.xmlbeans.XmlDouble salario);
        
        /**
         * Gets the "monto" element
         */
        double getMonto();
        
        /**
         * Gets (as xml) the "monto" element
         */
        org.apache.xmlbeans.XmlDouble xgetMonto();
        
        /**
         * Sets the "monto" element
         */
        void setMonto(double monto);
        
        /**
         * Sets (as xml) the "monto" element
         */
        void xsetMonto(org.apache.xmlbeans.XmlDouble monto);
        
        /**
         * Gets the "tasaInteres" element
         */
        double getTasaInteres();
        
        /**
         * Gets (as xml) the "tasaInteres" element
         */
        org.apache.xmlbeans.XmlDouble xgetTasaInteres();
        
        /**
         * Sets the "tasaInteres" element
         */
        void setTasaInteres(double tasaInteres);
        
        /**
         * Sets (as xml) the "tasaInteres" element
         */
        void xsetTasaInteres(org.apache.xmlbeans.XmlDouble tasaInteres);
        
        /**
         * Gets the "plazo" element
         */
        int getPlazo();
        
        /**
         * Gets (as xml) the "plazo" element
         */
        org.apache.xmlbeans.XmlInt xgetPlazo();
        
        /**
         * Sets the "plazo" element
         */
        void setPlazo(int plazo);
        
        /**
         * Sets (as xml) the "plazo" element
         */
        void xsetPlazo(org.apache.xmlbeans.XmlInt plazo);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.CreditoDocument.Credito newInstance() {
              return (com.soa.CreditoDocument.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.CreditoDocument.Credito newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.CreditoDocument.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.CreditoDocument newInstance() {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.CreditoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.CreditoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.CreditoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.CreditoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.CreditoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.CreditoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.CreditoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.CreditoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.CreditoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.CreditoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.CreditoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.CreditoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.CreditoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.CreditoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.CreditoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.CreditoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.CreditoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.CreditoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
