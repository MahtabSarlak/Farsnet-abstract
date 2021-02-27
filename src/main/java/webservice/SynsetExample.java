/**
 * SynsetExample.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class SynsetExample  implements java.io.Serializable {
    private String content;

    private int id;

    private String lexicon;

    public SynsetExample() {
    }

    public SynsetExample(
           String content,
           int id,
           String lexicon) {
           this.content = content;
           this.id = id;
           this.lexicon = lexicon;
    }


    /**
     * Gets the content value for this SynsetExample.
     * 
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this SynsetExample.
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the id value for this SynsetExample.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SynsetExample.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the lexicon value for this SynsetExample.
     * 
     * @return lexicon
     */
    public String getLexicon() {
        return lexicon;
    }


    /**
     * Sets the lexicon value for this SynsetExample.
     * 
     * @param lexicon
     */
    public void setLexicon(String lexicon) {
        this.lexicon = lexicon;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SynsetExample)) return false;
        SynsetExample other = (SynsetExample) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            this.id == other.getId() &&
            ((this.lexicon==null && other.getLexicon()==null) || 
             (this.lexicon!=null &&
              this.lexicon.equals(other.getLexicon())));
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
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += getId();
        if (getLexicon() != null) {
            _hashCode += getLexicon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynsetExample.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "SynsetExample"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "content"));
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
        elemField.setFieldName("lexicon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "lexicon"));
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
