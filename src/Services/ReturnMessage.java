/**
 * ReturnMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class ReturnMessage  implements java.io.Serializable {
    private int code;

    private java.lang.String description;

    private long traceCode;

    public ReturnMessage() {
    }

    public ReturnMessage(
           int code,
           java.lang.String description,
           long traceCode) {
           this.code = code;
           this.description = description;
           this.traceCode = traceCode;
    }


    /**
     * Gets the code value for this ReturnMessage.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this ReturnMessage.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the description value for this ReturnMessage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ReturnMessage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the traceCode value for this ReturnMessage.
     * 
     * @return traceCode
     */
    public long getTraceCode() {
        return traceCode;
    }


    /**
     * Sets the traceCode value for this ReturnMessage.
     * 
     * @param traceCode
     */
    public void setTraceCode(long traceCode) {
        this.traceCode = traceCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnMessage)) return false;
        ReturnMessage other = (ReturnMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.code == other.getCode() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.traceCode == other.getTraceCode();
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
        _hashCode += getCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Long(getTraceCode()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "ReturnMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "traceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
