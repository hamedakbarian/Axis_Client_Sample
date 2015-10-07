/**
 * SigninInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class SigninInfo  implements java.io.Serializable {
    private java.lang.String ip;

    private java.lang.Long personNin;

    public SigninInfo() {
    }

    public SigninInfo(
           java.lang.String ip,
           java.lang.Long personNin) {
           this.ip = ip;
           this.personNin = personNin;
    }


    /**
     * Gets the ip value for this SigninInfo.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this SigninInfo.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the personNin value for this SigninInfo.
     * 
     * @return personNin
     */
    public java.lang.Long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this SigninInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(java.lang.Long personNin) {
        this.personNin = personNin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SigninInfo)) return false;
        SigninInfo other = (SigninInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.personNin==null && other.getPersonNin()==null) || 
             (this.personNin!=null &&
              this.personNin.equals(other.getPersonNin())));
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getPersonNin() != null) {
            _hashCode += getPersonNin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SigninInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "signinInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personNin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
