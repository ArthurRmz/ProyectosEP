/*
 * An XML document type.
 * Localname: entradaDatosIni
 * Namespace: http://soa.com
 * Java type: com.soa.EntradaDatosIniDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa;


/**
 * A document containing one entradaDatosIni(@http://soa.com) element.
 *
 * This is a complex type.
 */
public interface EntradaDatosIniDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntradaDatosIniDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s48F78B825D0128C4DC42FC833E061CE5").resolveHandle("entradadatosini289fdoctype");
    
    /**
     * Gets the "entradaDatosIni" element
     */
    com.soa.EntradaDatosIniDocument.EntradaDatosIni getEntradaDatosIni();
    
    /**
     * Sets the "entradaDatosIni" element
     */
    void setEntradaDatosIni(com.soa.EntradaDatosIniDocument.EntradaDatosIni entradaDatosIni);
    
    /**
     * Appends and returns a new empty "entradaDatosIni" element
     */
    com.soa.EntradaDatosIniDocument.EntradaDatosIni addNewEntradaDatosIni();
    
    /**
     * An XML entradaDatosIni(@http://soa.com).
     *
     * This is a complex type.
     */
    public interface EntradaDatosIni extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntradaDatosIni.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s48F78B825D0128C4DC42FC833E061CE5").resolveHandle("entradadatosinia813elemtype");
        
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
         * Gets the "apePaterno" element
         */
        java.lang.String getApePaterno();
        
        /**
         * Gets (as xml) the "apePaterno" element
         */
        org.apache.xmlbeans.XmlString xgetApePaterno();
        
        /**
         * Sets the "apePaterno" element
         */
        void setApePaterno(java.lang.String apePaterno);
        
        /**
         * Sets (as xml) the "apePaterno" element
         */
        void xsetApePaterno(org.apache.xmlbeans.XmlString apePaterno);
        
        /**
         * Gets the "apeMaterno" element
         */
        java.lang.String getApeMaterno();
        
        /**
         * Gets (as xml) the "apeMaterno" element
         */
        org.apache.xmlbeans.XmlString xgetApeMaterno();
        
        /**
         * Sets the "apeMaterno" element
         */
        void setApeMaterno(java.lang.String apeMaterno);
        
        /**
         * Sets (as xml) the "apeMaterno" element
         */
        void xsetApeMaterno(org.apache.xmlbeans.XmlString apeMaterno);
        
        /**
         * Gets the "correo" element
         */
        java.lang.String getCorreo();
        
        /**
         * Gets (as xml) the "correo" element
         */
        org.apache.xmlbeans.XmlString xgetCorreo();
        
        /**
         * Sets the "correo" element
         */
        void setCorreo(java.lang.String correo);
        
        /**
         * Sets (as xml) the "correo" element
         */
        void xsetCorreo(org.apache.xmlbeans.XmlString correo);
        
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
            public static com.soa.EntradaDatosIniDocument.EntradaDatosIni newInstance() {
              return (com.soa.EntradaDatosIniDocument.EntradaDatosIni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.EntradaDatosIniDocument.EntradaDatosIni newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.EntradaDatosIniDocument.EntradaDatosIni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.EntradaDatosIniDocument newInstance() {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.EntradaDatosIniDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.EntradaDatosIniDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.EntradaDatosIniDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.EntradaDatosIniDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.EntradaDatosIniDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.EntradaDatosIniDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.EntradaDatosIniDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.EntradaDatosIniDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.EntradaDatosIniDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.EntradaDatosIniDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.EntradaDatosIniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
