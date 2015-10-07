/**
 * SanadInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class SanadInfo  implements java.io.Serializable {
    private java.lang.String docIssueDate;

    private long personNin;

    private java.lang.String sanadSeri;

    private java.lang.String sanadSerialNo;

    private java.lang.String userId;

    public SanadInfo() {
    }

    public SanadInfo(
           java.lang.String docIssueDate,
           long personNin,
           java.lang.String sanadSeri,
           java.lang.String sanadSerialNo,
           java.lang.String userId) {
           this.docIssueDate = docIssueDate;
           this.personNin = personNin;
           this.sanadSeri = sanadSeri;
           this.sanadSerialNo = sanadSerialNo;
           this.userId = userId;
    }


    /**
     * Gets the docIssueDate value for this SanadInfo.
     * 
     * @return docIssueDate
     */
    public java.lang.String getDocIssueDate() {
        return docIssueDate;
    }


    /**
     * Sets the docIssueDate value for this SanadInfo.
     * 
     * @param docIssueDate
     */
    public void setDocIssueDate(java.lang.String docIssueDate) {
        this.docIssueDate = docIssueDate;
    }


    /**
     * Gets the personNin value for this SanadInfo.
     * 
     * @return personNin
     */
    public long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this SanadInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(long personNin) {
        this.personNin = personNin;
    }


    /**
     * Gets the sanadSeri value for this SanadInfo.
     * 
     * @return sanadSeri
     */
    public java.lang.String getSanadSeri() {
        return sanadSeri;
    }


    /**
     * Sets the sanadSeri value for this SanadInfo.
     * 
     * @param sanadSeri
     */
    public void setSanadSeri(java.lang.String sanadSeri) {
        this.sanadSeri = sanadSeri;
    }


    /**
     * Gets the sanadSerialNo value for this SanadInfo.
     * 
     * @return sanadSerialNo
     */
    public java.lang.String getSanadSerialNo() {
        return sanadSerialNo;
    }


    /**
     * Sets the sanadSerialNo value for this SanadInfo.
     * 
     * @param sanadSerialNo
     */
    public void setSanadSerialNo(java.lang.String sanadSerialNo) {
        this.sanadSerialNo = sanadSerialNo;
    }


    /**
     * Gets the userId value for this SanadInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SanadInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SanadInfo)) return false;
        SanadInfo other = (SanadInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docIssueDate==null && other.getDocIssueDate()==null) || 
             (this.docIssueDate!=null &&
              this.docIssueDate.equals(other.getDocIssueDate()))) &&
            this.personNin == other.getPersonNin() &&
            ((this.sanadSeri==null && other.getSanadSeri()==null) || 
             (this.sanadSeri!=null &&
              this.sanadSeri.equals(other.getSanadSeri()))) &&
            ((this.sanadSerialNo==null && other.getSanadSerialNo()==null) || 
             (this.sanadSerialNo!=null &&
              this.sanadSerialNo.equals(other.getSanadSerialNo()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getDocIssueDate() != null) {
            _hashCode += getDocIssueDate().hashCode();
        }
        _hashCode += new Long(getPersonNin()).hashCode();
        if (getSanadSeri() != null) {
            _hashCode += getSanadSeri().hashCode();
        }
        if (getSanadSerialNo() != null) {
            _hashCode += getSanadSerialNo().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SanadInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "sanadInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "docIssueDate"));
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
        elemField.setFieldName("sanadSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanadSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
