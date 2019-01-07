/*
 * An XML document type.
 * Localname: reqArturo
 * Namespace: http://soa.com
 * Java type: com.soa.ReqArturoDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa;


/**
 * A document containing one reqArturo(@http://soa.com) element.
 *
 * This is a complex type.
 */
public interface ReqArturoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReqArturoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF15168BD0FCEBDE758E26C3768635B26").resolveHandle("reqarturo0ef2doctype");
    
    /**
     * Gets the "reqArturo" element
     */
    com.soa.ReqArturoDocument.ReqArturo getReqArturo();
    
    /**
     * Sets the "reqArturo" element
     */
    void setReqArturo(com.soa.ReqArturoDocument.ReqArturo reqArturo);
    
    /**
     * Appends and returns a new empty "reqArturo" element
     */
    com.soa.ReqArturoDocument.ReqArturo addNewReqArturo();
    
    /**
     * An XML reqArturo(@http://soa.com).
     *
     * This is a complex type.
     */
    public interface ReqArturo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReqArturo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF15168BD0FCEBDE758E26C3768635B26").resolveHandle("reqarturo6a79elemtype");
        
        /**
         * Gets the "apellidoPaterno" element
         */
        java.lang.String getApellidoPaterno();
        
        /**
         * Gets (as xml) the "apellidoPaterno" element
         */
        org.apache.xmlbeans.XmlString xgetApellidoPaterno();
        
        /**
         * Sets the "apellidoPaterno" element
         */
        void setApellidoPaterno(java.lang.String apellidoPaterno);
        
        /**
         * Sets (as xml) the "apellidoPaterno" element
         */
        void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno);
        
        /**
         * Gets the "apellidoMaterno" element
         */
        java.lang.String getApellidoMaterno();
        
        /**
         * Gets (as xml) the "apellidoMaterno" element
         */
        org.apache.xmlbeans.XmlString xgetApellidoMaterno();
        
        /**
         * Sets the "apellidoMaterno" element
         */
        void setApellidoMaterno(java.lang.String apellidoMaterno);
        
        /**
         * Sets (as xml) the "apellidoMaterno" element
         */
        void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno);
        
        /**
         * Gets the "nombres" element
         */
        java.lang.String getNombres();
        
        /**
         * Gets (as xml) the "nombres" element
         */
        org.apache.xmlbeans.XmlString xgetNombres();
        
        /**
         * Sets the "nombres" element
         */
        void setNombres(java.lang.String nombres);
        
        /**
         * Sets (as xml) the "nombres" element
         */
        void xsetNombres(org.apache.xmlbeans.XmlString nombres);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.ReqArturoDocument.ReqArturo newInstance() {
              return (com.soa.ReqArturoDocument.ReqArturo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.ReqArturoDocument.ReqArturo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.ReqArturoDocument.ReqArturo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.ReqArturoDocument newInstance() {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.ReqArturoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.ReqArturoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.ReqArturoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.ReqArturoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.ReqArturoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.ReqArturoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.ReqArturoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.ReqArturoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.ReqArturoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.ReqArturoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.ReqArturoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.ReqArturoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.ReqArturoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.ReqArturoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.ReqArturoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.ReqArturoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.ReqArturoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.ReqArturoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
