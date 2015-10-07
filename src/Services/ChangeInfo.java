/**
 * ChangeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class ChangeInfo  implements java.io.Serializable {
    private java.lang.String changeActionTypeCode;

    private java.lang.String changeFormTypeCode;

    private java.lang.String formDate;

    private java.lang.String newValue;

    private long personNin;

    private java.lang.String userId;

    public ChangeInfo() {
    }

    public ChangeInfo(
           java.lang.String changeActionTypeCode,
           java.lang.String changeFormTypeCode,
           java.lang.String formDate,
           java.lang.String newValue,
           long personNin,
           java.lang.String userId) {
           this.changeActionTypeCode = changeActionTypeCode;
           this.changeFormTypeCode = changeFormTypeCode;
           this.formDate = formDate;
           this.newValue = newValue;
           this.personNin = personNin;
           this.userId = userId;
    }


    /**
     * Gets the changeActionTypeCode value for this ChangeInfo.
     * 
     * @return changeActionTypeCode
     */
    public java.lang.String getChangeActionTypeCode() {
        return changeActionTypeCode;
    }


    /**
     * Sets the changeActionTypeCode value for this ChangeInfo.
     * 
     * @param changeActionTypeCode
     */
    public void setChangeActionTypeCode(java.lang.String changeActionTypeCode) {
        this.changeActionTypeCode = changeActionTypeCode;
    }


    /**
     * Gets the changeFormTypeCode value for this ChangeInfo.
     * 
     * @return changeFormTypeCode
     */
    public java.lang.String getChangeFormTypeCode() {
        return changeFormTypeCode;
    }


    /**
     * Sets the changeFormTypeCode value for this ChangeInfo.
     * 
     * @param changeFormTypeCode
     */
    public void setChangeFormTypeCode(java.lang.String changeFormTypeCode) {
        this.changeFormTypeCode = changeFormTypeCode;
    }


    /**
     * Gets the formDate value for this ChangeInfo.
     * 
     * @return formDate
     */
    public java.lang.String getFormDate() {
        return formDate;
    }


    /**
     * Sets the formDate value for this ChangeInfo.
     * 
     * @param formDate
     */
    public void setFormDate(java.lang.String formDate) {
        this.formDate = formDate;
    }


    /**
     * Gets the newValue value for this ChangeInfo.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this ChangeInfo.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the personNin value for this ChangeInfo.
     * 
     * @return personNin
     */
    public long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this ChangeInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(long personNin) {
        this.personNin = personNin;
    }


    /**
     * Gets the userId value for this ChangeInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ChangeInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeInfo)) return false;
        ChangeInfo other = (ChangeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeActionTypeCode==null && other.getChangeActionTypeCode()==null) || 
             (this.changeActionTypeCode!=null &&
              this.changeActionTypeCode.equals(other.getChangeActionTypeCode()))) &&
            ((this.changeFormTypeCode==null && other.getChangeFormTypeCode()==null) || 
             (this.changeFormTypeCode!=null &&
              this.changeFormTypeCode.equals(other.getChangeFormTypeCode()))) &&
            ((this.formDate==null && other.getFormDate()==null) || 
             (this.formDate!=null &&
              this.formDate.equals(other.getFormDate()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            this.personNin == other.getPersonNin() &&
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
        if (getChangeActionTypeCode() != null) {
            _hashCode += getChangeActionTypeCode().hashCode();
        }
        if (getChangeFormTypeCode() != null) {
            _hashCode += getChangeFormTypeCode().hashCode();
        }
        if (getFormDate() != null) {
            _hashCode += getFormDate().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        _hashCode += new Long(getPersonNin()).hashCode();
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "changeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeActionTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "changeActionTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeFormTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "changeFormTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "formDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "newValue"));
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
