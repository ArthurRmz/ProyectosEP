/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package edu.itq.factura;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://itq.edu/factura".equals(namespaceURI) &&
                "domicilio_type0".equals(typeName)) {
            return edu.itq.factura.Domicilio_type0.Factory.parse(reader);
        }

        if ("http://itq.edu/factura".equals(namespaceURI) &&
                "cliente_type0".equals(typeName)) {
            return edu.itq.factura.Cliente_type0.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
