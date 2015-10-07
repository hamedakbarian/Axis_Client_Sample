/**
 * ShenasnameInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class ShenasnameInfo  implements java.io.Serializable {
    private java.lang.String docIssueDate;

    private long personNin;

    private java.lang.String shenasnameSeri;

    private java.lang.String shenasnameSrno;

    private java.lang.String userId;

    public ShenasnameInfo() {
    }

    public ShenasnameInfo(
           java.lang.String docIssueDate,
           long personNin,
           java.lang.String shenasnameSeri,
           java.lang.String shenasnameSrno,
           java.lang.String userId) {
           this.docIssueDate = docIssueDate;
           this.personNin = personNin;
           this.shenasnameSeri = shenasnameSeri;
           this.shenasnameSrno = shenasnameSrno;
           this.userId = userId;
    }


    /**
     * Gets the docIssueDate value for this ShenasnameInfo.
     * 
     * @return docIssueDate
     */
    public java.lang.String getDocIssueDate() {
        return docIssueDate;
    }


    /**
     * Sets the docIssueDate value for this ShenasnameInfo.
     * 
     * @param docIssueDate
     */
    public void setDocIssueDate(java.lang.String docIssueDate) {
        this.docIssueDate = docIssueDate;
    }


    /**
     * Gets the personNin value for this ShenasnameInfo.
     * 
     * @return personNin
     */
    public long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this ShenasnameInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(long personNin) {
        this.personNin = personNin;
    }


    /**
     * Gets the shenasnameSeri value for this ShenasnameInfo.
     * 
     * @return shenasnameSeri
     */
    public java.lang.String getShenasnameSeri() {
        return shenasnameSeri;
    }


    /**
     * Sets the shenasnameSeri value for this ShenasnameInfo.
     * 
     * @param shenasnameSeri
     */
    public void setShenasnameSeri(java.lang.String shenasnameSeri) {
        this.shenasnameSeri = shenasnameSeri;
    }


    /**
     * Gets the shenasnameSrno value for this ShenasnameInfo.
     * 
     * @return shenasnameSrno
     */
    public java.lang.String getShenasnameSrno() {
        return shenasnameSrno;
    }


    /**
     * Sets the shenasnameSrno value for this ShenasnameInfo.
     * 
     * @param shenasnameSrno
     */
    public void setShenasnameSrno(java.lang.String shenasnameSrno) {
        this.shenasnameSrno = shenasnameSrno;
    }


    /**
     * Gets the userId value for this ShenasnameInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ShenasnameInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShenasnameInfo)) return false;
        ShenasnameInfo other = (ShenasnameInfo) obj;
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
            ((this.shenasnameSeri==null && other.getShenasnameSeri()==null) || 
             (this.shenasnameSeri!=null &&
              this.shenasnameSeri.equals(other.getShenasnameSeri()))) &&
            ((this.shenasnameSrno==null && other.getShenasnameSrno()==null) || 
             (this.shenasnameSrno!=null &&
              this.shenasnameSrno.equals(other.getShenasnameSrno()))) &&
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
        if (getShenasnameSeri() != null) {
            _hashCode += getShenasnameSeri().hashCode();
        }
        if (getShenasnameSrno() != null) {
            _hashCode += getShenasnameSrno().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShenasnameInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "shenasnameInfo"));
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
        elemField.setFieldName("shenasnameSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasnameSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shenasnameSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasnameSrno"));
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
