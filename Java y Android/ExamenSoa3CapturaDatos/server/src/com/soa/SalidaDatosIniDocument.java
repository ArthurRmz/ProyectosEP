/*
 * An XML document type.
 * Localname: salidaDatosIni
 * Namespace: http://soa.com
 * Java type: com.soa.SalidaDatosIniDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa;


/**
 * A document containing one salidaDatosIni(@http://soa.com) element.
 *
 * This is a complex type.
 */
public interface SalidaDatosIniDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SalidaDatosIniDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s48F78B825D0128C4DC42FC833E061CE5").resolveHandle("salidadatosinif93cdoctype");
    
    /**
     * Gets the "salidaDatosIni" element
     */
    com.soa.SalidaDatosIniDocument.SalidaDatosIni getSalidaDatosIni();
    
    /**
     * Sets the "salidaDatosIni" element
     */
    void setSalidaDatosIni(com.soa.SalidaDatosIniDocument.SalidaDatosIni salidaDatosIni);
    
    /**
     * Appends and returns a new empty "salidaDatosIni" element
     */
    com.soa.SalidaDatosIniDocument.SalidaDatosIni addNewSalidaDatosIni();
    
    /**
     * An XML salidaDatosIni(@http://soa.com).
     *
     * This is a complex type.
     */
    public interface SalidaDatosIni extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SalidaDatosIni.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s48F78B825D0128C4DC42FC833E061CE5").resolveHandle("salidadatosinia029elemtype");
        
        /**
         * Gets the "respuesta" element
         */
        boolean getRespuesta();
        
        /**
         * Gets (as xml) the "respuesta" element
         */
        org.apache.xmlbeans.XmlBoolean xgetRespuesta();
        
        /**
         * Sets the "respuesta" element
         */
        void setRespuesta(boolean respuesta);
        
        /**
         * Sets (as xml) the "respuesta" element
         */
        void xsetRespuesta(org.apache.xmlbeans.XmlBoolean respuesta);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.SalidaDatosIniDocument.SalidaDatosIni newInstance() {
              return (com.soa.SalidaDatosIniDocument.SalidaDatosIni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.SalidaDatosIniDocument.SalidaDatosIni newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.SalidaDatosIniDocument.SalidaDatosIni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.SalidaDatosIniDocument newInstance() {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.SalidaDatosIniDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.SalidaDatosIniDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.SalidaDatosIniDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.SalidaDatosIniDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.SalidaDatosIniDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.SalidaDatosIniDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.SalidaDatosIniDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.SalidaDatosIniDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.SalidaDatosIniDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.SalidaDatosIniDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.SalidaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
