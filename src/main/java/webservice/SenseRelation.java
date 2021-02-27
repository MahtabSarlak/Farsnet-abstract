/**
 * SenseRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class SenseRelation  implements java.io.Serializable {
    private int id;

    private int senseId1;

    private int senseId2;

    private String senseWord1;

    private String senseWord2;

    private String type;

    public SenseRelation() {
    }

    public SenseRelation(
           int id,
           int senseId1,
           int senseId2,
           String senseWord1,
           String senseWord2,
           String type) {
           this.id = id;
           this.senseId1 = senseId1;
           this.senseId2 = senseId2;
           this.senseWord1 = senseWord1;
           this.senseWord2 = senseWord2;
           this.type = type;
    }


    /**
     * Gets the id value for this SenseRelation.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SenseRelation.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the senseId1 value for this SenseRelation.
     * 
     * @return senseId1
     */
    public int getSenseId1() {
        return senseId1;
    }


    /**
     * Sets the senseId1 value for this SenseRelation.
     * 
     * @param senseId1
     */
    public void setSenseId1(int senseId1) {
        this.senseId1 = senseId1;
    }


    /**
     * Gets the senseId2 value for this SenseRelation.
     * 
     * @return senseId2
     */
    public int getSenseId2() {
        return senseId2;
    }


    /**
     * Sets the senseId2 value for this SenseRelation.
     * 
     * @param senseId2
     */
    public void setSenseId2(int senseId2) {
        this.senseId2 = senseId2;
    }


    /**
     * Gets the senseWord1 value for this SenseRelation.
     * 
     * @return senseWord1
     */
    public String getSenseWord1() {
        return senseWord1;
    }


    /**
     * Sets the senseWord1 value for this SenseRelation.
     * 
     * @param senseWord1
     */
    public void setSenseWord1(String senseWord1) {
        this.senseWord1 = senseWord1;
    }


    /**
     * Gets the senseWord2 value for this SenseRelation.
     * 
     * @return senseWord2
     */
    public String getSenseWord2() {
        return senseWord2;
    }


    /**
     * Sets the senseWord2 value for this SenseRelation.
     * 
     * @param senseWord2
     */
    public void setSenseWord2(String senseWord2) {
        this.senseWord2 = senseWord2;
    }


    /**
     * Gets the type value for this SenseRelation.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this SenseRelation.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SenseRelation)) return false;
        SenseRelation other = (SenseRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.senseId1 == other.getSenseId1() &&
            this.senseId2 == other.getSenseId2() &&
            ((this.senseWord1==null && other.getSenseWord1()==null) || 
             (this.senseWord1!=null &&
              this.senseWord1.equals(other.getSenseWord1()))) &&
            ((this.senseWord2==null && other.getSenseWord2()==null) || 
             (this.senseWord2!=null &&
              this.senseWord2.equals(other.getSenseWord2()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        _hashCode += getId();
        _hashCode += getSenseId1();
        _hashCode += getSenseId2();
        if (getSenseWord1() != null) {
            _hashCode += getSenseWord1().hashCode();
        }
        if (getSenseWord2() != null) {
            _hashCode += getSenseWord2().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SenseRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "SenseRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senseId1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "senseId1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senseId2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "senseId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senseWord1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "senseWord1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senseWord2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "senseWord2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "type"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
