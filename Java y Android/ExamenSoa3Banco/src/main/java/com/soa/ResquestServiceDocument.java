/*
 * An XML document type.
 * Localname: resquestService
 * Namespace: http://soa.com
 * Java type: com.soa.ResquestServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa;


/**
 * A document containing one resquestService(@http://soa.com) element.
 *
 * This is a complex type.
 */
public interface ResquestServiceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResquestServiceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC277E6DCF388EB6A41FA37A4E4E4E21F").resolveHandle("resquestservicea5ccdoctype");
    
    /**
     * Gets the "resquestService" element
     */
    com.soa.ResquestServiceDocument.ResquestService getResquestService();
    
    /**
     * Sets the "resquestService" element
     */
    void setResquestService(com.soa.ResquestServiceDocument.ResquestService resquestService);
    
    /**
     * Appends and returns a new empty "resquestService" element
     */
    com.soa.ResquestServiceDocument.ResquestService addNewResquestService();
    
    /**
     * An XML resquestService(@http://soa.com).
     *
     * This is a complex type.
     */
    public interface ResquestService extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResquestService.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC277E6DCF388EB6A41FA37A4E4E4E21F").resolveHandle("resquestservice912delemtype");
        
        /**
         * Gets the "noTarjeta" element
         */
        int getNoTarjeta();
        
        /**
         * Gets (as xml) the "noTarjeta" element
         */
        org.apache.xmlbeans.XmlInt xgetNoTarjeta();
        
        /**
         * Sets the "noTarjeta" element
         */
        void setNoTarjeta(int noTarjeta);
        
        /**
         * Sets (as xml) the "noTarjeta" element
         */
        void xsetNoTarjeta(org.apache.xmlbeans.XmlInt noTarjeta);
        
        /**
         * Gets the "codSegTarjeta" element
         */
        int getCodSegTarjeta();
        
        /**
         * Gets (as xml) the "codSegTarjeta" element
         */
        org.apache.xmlbeans.XmlInt xgetCodSegTarjeta();
        
        /**
         * Sets the "codSegTarjeta" element
         */
        void setCodSegTarjeta(int codSegTarjeta);
        
        /**
         * Sets (as xml) the "codSegTarjeta" element
         */
        void xsetCodSegTarjeta(org.apache.xmlbeans.XmlInt codSegTarjeta);
        
        /**
         * Gets the "fechaExpiracion" element
         */
        java.lang.String getFechaExpiracion();
        
        /**
         * Gets (as xml) the "fechaExpiracion" element
         */
        org.apache.xmlbeans.XmlString xgetFechaExpiracion();
        
        /**
         * Sets the "fechaExpiracion" element
         */
        void setFechaExpiracion(java.lang.String fechaExpiracion);
        
        /**
         * Sets (as xml) the "fechaExpiracion" element
         */
        void xsetFechaExpiracion(org.apache.xmlbeans.XmlString fechaExpiracion);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.ResquestServiceDocument.ResquestService newInstance() {
              return (com.soa.ResquestServiceDocument.ResquestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.ResquestServiceDocument.ResquestService newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.ResquestServiceDocument.ResquestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.ResquestServiceDocument newInstance() {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.ResquestServiceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.ResquestServiceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.ResquestServiceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.ResquestServiceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.ResquestServiceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.ResquestServiceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.ResquestServiceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.ResquestServiceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.ResquestServiceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.ResquestServiceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.ResquestServiceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.ResquestServiceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.ResquestServiceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.ResquestServiceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.ResquestServiceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.ResquestServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.ResquestServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.ResquestServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
