/**
 * MarriagesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class MarriagesInfo  implements java.io.Serializable {
    private Services.MarriageInfo[] marriages;

    private Services.ReturnMessage returnMessage;

    public MarriagesInfo() {
    }

    public MarriagesInfo(
           Services.MarriageInfo[] marriages,
           Services.ReturnMessage returnMessage) {
           this.marriages = marriages;
           this.returnMessage = returnMessage;
    }


    /**
     * Gets the marriages value for this MarriagesInfo.
     * 
     * @return marriages
     */
    public Services.MarriageInfo[] getMarriages() {
        return marriages;
    }


    /**
     * Sets the marriages value for this MarriagesInfo.
     * 
     * @param marriages
     */
    public void setMarriages(Services.MarriageInfo[] marriages) {
        this.marriages = marriages;
    }


    /**
     * Gets the returnMessage value for this MarriagesInfo.
     * 
     * @return returnMessage
     */
    public Services.ReturnMessage getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the returnMessage value for this MarriagesInfo.
     * 
     * @param returnMessage
     */
    public void setReturnMessage(Services.ReturnMessage returnMessage) {
        this.returnMessage = returnMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarriagesInfo)) return false;
        MarriagesInfo other = (MarriagesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.marriages==null && other.getMarriages()==null) || 
             (this.marriages!=null &&
              java.util.Arrays.equals(this.marriages, other.getMarriages()))) &&
            ((this.returnMessage==null && other.getReturnMessage()==null) || 
             (this.returnMessage!=null &&
              this.returnMessage.equals(other.getReturnMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMarriages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarriages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarriages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnMessage() != null) {
            _hashCode += getReturnMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarriagesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "marriagesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marriages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "marriages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Server", "marriageInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Server", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "returnMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Server", "ReturnMessage"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
