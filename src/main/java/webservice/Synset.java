/**
 * Synset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Synset  implements java.io.Serializable {
    private int id;

    private String noMapping;

    private String nofather;

    private String pos;

    private String semanticCategory;

    public Synset() {
    }

    public Synset(
           int id,
           String noMapping,
           String nofather,
           String pos,
           String semanticCategory) {
           this.id = id;
           this.noMapping = noMapping;
           this.nofather = nofather;
           this.pos = pos;
           this.semanticCategory = semanticCategory;
    }


    /**
     * Gets the id value for this Synset.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Synset.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the noMapping value for this Synset.
     * 
     * @return noMapping
     */
    public String getNoMapping() {
        return noMapping;
    }


    /**
     * Sets the noMapping value for this Synset.
     * 
     * @param noMapping
     */
    public void setNoMapping(String noMapping) {
        this.noMapping = noMapping;
    }


    /**
     * Gets the nofather value for this Synset.
     * 
     * @return nofather
     */
    public String getNofather() {
        return nofather;
    }


    /**
     * Sets the nofather value for this Synset.
     * 
     * @param nofather
     */
    public void setNofather(String nofather) {
        this.nofather = nofather;
    }


    /**
     * Gets the pos value for this Synset.
     * 
     * @return pos
     */
    public String getPos() {
        return pos;
    }


    /**
     * Sets the pos value for this Synset.
     * 
     * @param pos
     */
    public void setPos(String pos) {
        this.pos = pos;
    }


    /**
     * Gets the semanticCategory value for this Synset.
     * 
     * @return semanticCategory
     */
    public String getSemanticCategory() {
        return semanticCategory;
    }


    /**
     * Sets the semanticCategory value for this Synset.
     * 
     * @param semanticCategory
     */
    public void setSemanticCategory(String semanticCategory) {
        this.semanticCategory = semanticCategory;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Synset)) return false;
        Synset other = (Synset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.noMapping==null && other.getNoMapping()==null) || 
             (this.noMapping!=null &&
              this.noMapping.equals(other.getNoMapping()))) &&
            ((this.nofather==null && other.getNofather()==null) || 
             (this.nofather!=null &&
              this.nofather.equals(other.getNofather()))) &&
            ((this.pos==null && other.getPos()==null) || 
             (this.pos!=null &&
              this.pos.equals(other.getPos()))) &&
            ((this.semanticCategory==null && other.getSemanticCategory()==null) || 
             (this.semanticCategory!=null &&
              this.semanticCategory.equals(other.getSemanticCategory())));
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
        if (getNoMapping() != null) {
            _hashCode += getNoMapping().hashCode();
        }
        if (getNofather() != null) {
            _hashCode += getNofather().hashCode();
        }
        if (getPos() != null) {
            _hashCode += getPos().hashCode();
        }
        if (getSemanticCategory() != null) {
            _hashCode += getSemanticCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Synset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "Synset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "noMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nofather");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "nofather"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semanticCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "semanticCategory"));
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
