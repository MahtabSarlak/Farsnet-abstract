/**
 * SynsetRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class SynsetRelation  implements java.io.Serializable {
    private int id;

    private String reverseType;

    private int synsetId1;

    private int synsetId2;

    private String synsetWords1;

    private String synsetWords2;

    private String type;

    public SynsetRelation() {
    }

    public SynsetRelation(
           int id,
           String reverseType,
           int synsetId1,
           int synsetId2,
           String synsetWords1,
           String synsetWords2,
           String type) {
           this.id = id;
           this.reverseType = reverseType;
           this.synsetId1 = synsetId1;
           this.synsetId2 = synsetId2;
           this.synsetWords1 = synsetWords1;
           this.synsetWords2 = synsetWords2;
           this.type = type;
    }


    /**
     * Gets the id value for this SynsetRelation.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SynsetRelation.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the reverseType value for this SynsetRelation.
     * 
     * @return reverseType
     */
    public String getReverseType() {
        return reverseType;
    }


    /**
     * Sets the reverseType value for this SynsetRelation.
     * 
     * @param reverseType
     */
    public void setReverseType(String reverseType) {
        this.reverseType = reverseType;
    }


    /**
     * Gets the synsetId1 value for this SynsetRelation.
     * 
     * @return synsetId1
     */
    public int getSynsetId1() {
        return synsetId1;
    }


    /**
     * Sets the synsetId1 value for this SynsetRelation.
     * 
     * @param synsetId1
     */
    public void setSynsetId1(int synsetId1) {
        this.synsetId1 = synsetId1;
    }


    /**
     * Gets the synsetId2 value for this SynsetRelation.
     * 
     * @return synsetId2
     */
    public int getSynsetId2() {
        return synsetId2;
    }


    /**
     * Sets the synsetId2 value for this SynsetRelation.
     * 
     * @param synsetId2
     */
    public void setSynsetId2(int synsetId2) {
        this.synsetId2 = synsetId2;
    }


    /**
     * Gets the synsetWords1 value for this SynsetRelation.
     * 
     * @return synsetWords1
     */
    public String getSynsetWords1() {
        return synsetWords1;
    }


    /**
     * Sets the synsetWords1 value for this SynsetRelation.
     * 
     * @param synsetWords1
     */
    public void setSynsetWords1(String synsetWords1) {
        this.synsetWords1 = synsetWords1;
    }


    /**
     * Gets the synsetWords2 value for this SynsetRelation.
     * 
     * @return synsetWords2
     */
    public String getSynsetWords2() {
        return synsetWords2;
    }


    /**
     * Sets the synsetWords2 value for this SynsetRelation.
     * 
     * @param synsetWords2
     */
    public void setSynsetWords2(String synsetWords2) {
        this.synsetWords2 = synsetWords2;
    }


    /**
     * Gets the type value for this SynsetRelation.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this SynsetRelation.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SynsetRelation)) return false;
        SynsetRelation other = (SynsetRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.reverseType==null && other.getReverseType()==null) || 
             (this.reverseType!=null &&
              this.reverseType.equals(other.getReverseType()))) &&
            this.synsetId1 == other.getSynsetId1() &&
            this.synsetId2 == other.getSynsetId2() &&
            ((this.synsetWords1==null && other.getSynsetWords1()==null) || 
             (this.synsetWords1!=null &&
              this.synsetWords1.equals(other.getSynsetWords1()))) &&
            ((this.synsetWords2==null && other.getSynsetWords2()==null) || 
             (this.synsetWords2!=null &&
              this.synsetWords2.equals(other.getSynsetWords2()))) &&
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
        if (getReverseType() != null) {
            _hashCode += getReverseType().hashCode();
        }
        _hashCode += getSynsetId1();
        _hashCode += getSynsetId2();
        if (getSynsetWords1() != null) {
            _hashCode += getSynsetWords1().hashCode();
        }
        if (getSynsetWords2() != null) {
            _hashCode += getSynsetWords2().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynsetRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "SynsetRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "reverseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synsetId1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "synsetId1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synsetId2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "synsetId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synsetWords1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "synsetWords1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synsetWords2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "synsetWords2"));
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
