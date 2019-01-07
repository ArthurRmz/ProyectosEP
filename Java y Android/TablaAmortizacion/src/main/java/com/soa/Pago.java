/*
 * XML Type:  Pago
 * Namespace: http://soa.com
 * Java type: com.soa.Pago
 *
 * Automatically generated - do not modify.
 */
package com.soa;


/**
 * An XML Pago(@http://soa.com).
 *
 * This is a complex type.
 */
public interface Pago extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pago.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0EAF3FC2E0972D16069C8728F3715B3E").resolveHandle("pago0ea4type");
    
    /**
     * Gets the "PagoMensual" element
     */
    double getPagoMensual();
    
    /**
     * Gets (as xml) the "PagoMensual" element
     */
    org.apache.xmlbeans.XmlDouble xgetPagoMensual();
    
    /**
     * Sets the "PagoMensual" element
     */
    void setPagoMensual(double pagoMensual);
    
    /**
     * Sets (as xml) the "PagoMensual" element
     */
    void xsetPagoMensual(org.apache.xmlbeans.XmlDouble pagoMensual);
    
    /**
     * Gets the "Interes" element
     */
    double getInteres();
    
    /**
     * Gets (as xml) the "Interes" element
     */
    org.apache.xmlbeans.XmlDouble xgetInteres();
    
    /**
     * Sets the "Interes" element
     */
    void setInteres(double interes);
    
    /**
     * Sets (as xml) the "Interes" element
     */
    void xsetInteres(org.apache.xmlbeans.XmlDouble interes);
    
    /**
     * Gets the "Principal" element
     */
    double getPrincipal();
    
    /**
     * Gets (as xml) the "Principal" element
     */
    org.apache.xmlbeans.XmlDouble xgetPrincipal();
    
    /**
     * Sets the "Principal" element
     */
    void setPrincipal(double principal);
    
    /**
     * Sets (as xml) the "Principal" element
     */
    void xsetPrincipal(org.apache.xmlbeans.XmlDouble principal);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.Pago newInstance() {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.Pago newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.Pago parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.Pago parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.Pago parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.Pago parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.Pago parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.Pago parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.Pago parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.Pago parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.Pago parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.Pago parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.Pago parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.Pago parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.Pago parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.Pago parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.Pago parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.Pago parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.Pago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
