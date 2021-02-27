/**
 * WordNetSynset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class WordNetSynset  implements java.io.Serializable {
    private String example;

    private String gloss;

    private int id;

    private int synset;

    private String type;

    private String wnOffset;

    private String wnPos;

    public WordNetSynset() {
    }

    public WordNetSynset(
           String example,
           String gloss,
           int id,
           int synset,
           String type,
           String wnOffset,
           String wnPos) {
           this.example = example;
           this.gloss = gloss;
           this.id = id;
           this.synset = synset;
           this.type = type;
           this.wnOffset = wnOffset;
           this.wnPos = wnPos;
    }


    /**
     * Gets the example value for this WordNetSynset.
     * 
     * @return example
     */
    public String getExample() {
        return example;
    }


    /**
     * Sets the example value for this WordNetSynset.
     * 
     * @param example
     */
    public void setExample(String example) {
        this.example = example;
    }


    /**
     * Gets the gloss value for this WordNetSynset.
     * 
     * @return gloss
     */
    public String getGloss() {
        return gloss;
    }


    /**
     * Sets the gloss value for this WordNetSynset.
     * 
     * @param gloss
     */
    public void setGloss(String gloss) {
        this.gloss = gloss;
    }


    /**
     * Gets the id value for this WordNetSynset.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this WordNetSynset.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the synset value for this WordNetSynset.
     * 
     * @return synset
     */
    public int getSynset() {
        return synset;
    }


    /**
     * Sets the synset value for this WordNetSynset.
     * 
     * @param synset
     */
    public void setSynset(int synset) {
        this.synset = synset;
    }


    /**
     * Gets the type value for this WordNetSynset.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this WordNetSynset.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the wnOffset value for this WordNetSynset.
     * 
     * @return wnOffset
     */
    public String getWnOffset() {
        return wnOffset;
    }


    /**
     * Sets the wnOffset value for this WordNetSynset.
     * 
     * @param wnOffset
     */
    public void setWnOffset(String wnOffset) {
        this.wnOffset = wnOffset;
    }


    /**
     * Gets the wnPos value for this WordNetSynset.
     * 
     * @return wnPos
     */
    public String getWnPos() {
        return wnPos;
    }


    /**
     * Sets the wnPos value for this WordNetSynset.
     * 
     * @param wnPos
     */
    public void setWnPos(String wnPos) {
        this.wnPos = wnPos;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WordNetSynset)) return false;
        WordNetSynset other = (WordNetSynset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.example==null && other.getExample()==null) || 
             (this.example!=null &&
              this.example.equals(other.getExample()))) &&
            ((this.gloss==null && other.getGloss()==null) || 
             (this.gloss!=null &&
              this.gloss.equals(other.getGloss()))) &&
            this.id == other.getId() &&
            this.synset == other.getSynset() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.wnOffset==null && other.getWnOffset()==null) || 
             (this.wnOffset!=null &&
              this.wnOffset.equals(other.getWnOffset()))) &&
            ((this.wnPos==null && other.getWnPos()==null) || 
             (this.wnPos!=null &&
              this.wnPos.equals(other.getWnPos())));
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
        if (getExample() != null) {
            _hashCode += getExample().hashCode();
        }
        if (getGloss() != null) {
            _hashCode += getGloss().hashCode();
        }
        _hashCode += getId();
        _hashCode += getSynset();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getWnOffset() != null) {
            _hashCode += getWnOffset().hashCode();
        }
        if (getWnPos() != null) {
            _hashCode += getWnPos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WordNetSynset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "WordNetSynset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("example");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "example"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gloss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "gloss"));
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
        elemField.setFieldName("synset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "synset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wnOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "wnOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wnPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "wnPos"));
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
