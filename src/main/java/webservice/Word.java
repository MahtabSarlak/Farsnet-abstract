/**
 * Word.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Word  implements java.io.Serializable {
    private String defaultPhonetic;

    private String defaultValue;

    private int id;

    private String pos;

    public Word() {
    }

    public Word(
           String defaultPhonetic,
           String defaultValue,
           int id,
           String pos) {
           this.defaultPhonetic = defaultPhonetic;
           this.defaultValue = defaultValue;
           this.id = id;
           this.pos = pos;
    }


    /**
     * Gets the defaultPhonetic value for this Word.
     * 
     * @return defaultPhonetic
     */
    public String getDefaultPhonetic() {
        return defaultPhonetic;
    }


    /**
     * Sets the defaultPhonetic value for this Word.
     * 
     * @param defaultPhonetic
     */
    public void setDefaultPhonetic(String defaultPhonetic) {
        this.defaultPhonetic = defaultPhonetic;
    }


    /**
     * Gets the defaultValue value for this Word.
     * 
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this Word.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the id value for this Word.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Word.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the pos value for this Word.
     * 
     * @return pos
     */
    public String getPos() {
        return pos;
    }


    /**
     * Sets the pos value for this Word.
     * 
     * @param pos
     */
    public void setPos(String pos) {
        this.pos = pos;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Word)) return false;
        Word other = (Word) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultPhonetic==null && other.getDefaultPhonetic()==null) || 
             (this.defaultPhonetic!=null &&
              this.defaultPhonetic.equals(other.getDefaultPhonetic()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            this.id == other.getId() &&
            ((this.pos==null && other.getPos()==null) || 
             (this.pos!=null &&
              this.pos.equals(other.getPos())));
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
        if (getDefaultPhonetic() != null) {
            _hashCode += getDefaultPhonetic().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        _hashCode += getId();
        if (getPos() != null) {
            _hashCode += getPos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Word.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "Word"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPhonetic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "defaultPhonetic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "pos"));
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
