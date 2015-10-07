/**
 * WifeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class WifeInfo  implements java.io.Serializable {
    private java.lang.String addressGeoSerial;

    private java.lang.String educationCode;

    private java.lang.String jobCode;

    private long personNin;

    private java.lang.String religionCode;

    private java.lang.String sexCode;

    private int times;

    public WifeInfo() {
    }

    public WifeInfo(
           java.lang.String addressGeoSerial,
           java.lang.String educationCode,
           java.lang.String jobCode,
           long personNin,
           java.lang.String religionCode,
           java.lang.String sexCode,
           int times) {
           this.addressGeoSerial = addressGeoSerial;
           this.educationCode = educationCode;
           this.jobCode = jobCode;
           this.personNin = personNin;
           this.religionCode = religionCode;
           this.sexCode = sexCode;
           this.times = times;
    }


    /**
     * Gets the addressGeoSerial value for this WifeInfo.
     * 
     * @return addressGeoSerial
     */
    public java.lang.String getAddressGeoSerial() {
        return addressGeoSerial;
    }


    /**
     * Sets the addressGeoSerial value for this WifeInfo.
     * 
     * @param addressGeoSerial
     */
    public void setAddressGeoSerial(java.lang.String addressGeoSerial) {
        this.addressGeoSerial = addressGeoSerial;
    }


    /**
     * Gets the educationCode value for this WifeInfo.
     * 
     * @return educationCode
     */
    public java.lang.String getEducationCode() {
        return educationCode;
    }


    /**
     * Sets the educationCode value for this WifeInfo.
     * 
     * @param educationCode
     */
    public void setEducationCode(java.lang.String educationCode) {
        this.educationCode = educationCode;
    }


    /**
     * Gets the jobCode value for this WifeInfo.
     * 
     * @return jobCode
     */
    public java.lang.String getJobCode() {
        return jobCode;
    }


    /**
     * Sets the jobCode value for this WifeInfo.
     * 
     * @param jobCode
     */
    public void setJobCode(java.lang.String jobCode) {
        this.jobCode = jobCode;
    }


    /**
     * Gets the personNin value for this WifeInfo.
     * 
     * @return personNin
     */
    public long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this WifeInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(long personNin) {
        this.personNin = personNin;
    }


    /**
     * Gets the religionCode value for this WifeInfo.
     * 
     * @return religionCode
     */
    public java.lang.String getReligionCode() {
        return religionCode;
    }


    /**
     * Sets the religionCode value for this WifeInfo.
     * 
     * @param religionCode
     */
    public void setReligionCode(java.lang.String religionCode) {
        this.religionCode = religionCode;
    }


    /**
     * Gets the sexCode value for this WifeInfo.
     * 
     * @return sexCode
     */
    public java.lang.String getSexCode() {
        return sexCode;
    }


    /**
     * Sets the sexCode value for this WifeInfo.
     * 
     * @param sexCode
     */
    public void setSexCode(java.lang.String sexCode) {
        this.sexCode = sexCode;
    }


    /**
     * Gets the times value for this WifeInfo.
     * 
     * @return times
     */
    public int getTimes() {
        return times;
    }


    /**
     * Sets the times value for this WifeInfo.
     * 
     * @param times
     */
    public void setTimes(int times) {
        this.times = times;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WifeInfo)) return false;
        WifeInfo other = (WifeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressGeoSerial==null && other.getAddressGeoSerial()==null) || 
             (this.addressGeoSerial!=null &&
              this.addressGeoSerial.equals(other.getAddressGeoSerial()))) &&
            ((this.educationCode==null && other.getEducationCode()==null) || 
             (this.educationCode!=null &&
              this.educationCode.equals(other.getEducationCode()))) &&
            ((this.jobCode==null && other.getJobCode()==null) || 
             (this.jobCode!=null &&
              this.jobCode.equals(other.getJobCode()))) &&
            this.personNin == other.getPersonNin() &&
            ((this.religionCode==null && other.getReligionCode()==null) || 
             (this.religionCode!=null &&
              this.religionCode.equals(other.getReligionCode()))) &&
            ((this.sexCode==null && other.getSexCode()==null) || 
             (this.sexCode!=null &&
              this.sexCode.equals(other.getSexCode()))) &&
            this.times == other.getTimes();
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
        if (getAddressGeoSerial() != null) {
            _hashCode += getAddressGeoSerial().hashCode();
        }
        if (getEducationCode() != null) {
            _hashCode += getEducationCode().hashCode();
        }
        if (getJobCode() != null) {
            _hashCode += getJobCode().hashCode();
        }
        _hashCode += new Long(getPersonNin()).hashCode();
        if (getReligionCode() != null) {
            _hashCode += getReligionCode().hashCode();
        }
        if (getSexCode() != null) {
            _hashCode += getSexCode().hashCode();
        }
        _hashCode += getTimes();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WifeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "wifeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGeoSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "addressGeoSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "educationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "jobCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personNin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("religionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "religionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sexCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("times");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "times"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
