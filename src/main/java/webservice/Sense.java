/**
 * Sense.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Sense  implements java.io.Serializable {
    private String adjectiveType1;

    private String adjectiveType2;

    private String adverbType1;

    private String adverbType2;

    private int id;

    private Boolean isAbbreviation;

    private Boolean isCausative;

    private Boolean isColloquial;

    private Boolean isIdiomatic;

    private String nounCategory;

    private String nounNumeralType;

    private String nounPluralType;

    private String nounSpecifityType;

    private String nounType;

    private String preNounAdjectiveType;

    private String pronoun;

    private String seqId;

    private String synsetId;

    private String transitiveType;

    private String value;

    private String verbActivePassive;

    private String verbPastStem;

    private String verbPresentStem;

    private String verbTransitivity;

    private String verbType;

    private Word word;

    public Sense() {
    }

    public Sense(
           String adjectiveType1,
           String adjectiveType2,
           String adverbType1,
           String adverbType2,
           int id,
           Boolean isAbbreviation,
           Boolean isCausative,
           Boolean isColloquial,
           Boolean isIdiomatic,
           String nounCategory,
           String nounNumeralType,
           String nounPluralType,
           String nounSpecifityType,
           String nounType,
           String preNounAdjectiveType,
           String pronoun,
           String seqId,
           String synsetId,
           String transitiveType,
           String value,
           String verbActivePassive,
           String verbPastStem,
           String verbPresentStem,
           String verbTransitivity,
           String verbType,
           Word word) {
           this.adjectiveType1 = adjectiveType1;
           this.adjectiveType2 = adjectiveType2;
           this.adverbType1 = adverbType1;
           this.adverbType2 = adverbType2;
           this.id = id;
           this.isAbbreviation = isAbbreviation;
           this.isCausative = isCausative;
           this.isColloquial = isColloquial;
           this.isIdiomatic = isIdiomatic;
           this.nounCategory = nounCategory;
           this.nounNumeralType = nounNumeralType;
           this.nounPluralType = nounPluralType;
           this.nounSpecifityType = nounSpecifityType;
           this.nounType = nounType;
           this.preNounAdjectiveType = preNounAdjectiveType;
           this.pronoun = pronoun;
           this.seqId = seqId;
           this.synsetId = synsetId;
           this.transitiveType = transitiveType;
           this.value = value;
           this.verbActivePassive = verbActivePassive;
           this.verbPastStem = verbPastStem;
           this.verbPresentStem = verbPresentStem;
           this.verbTransitivity = verbTransitivity;
           this.verbType = verbType;
           this.word = word;
    }


    /**
     * Gets the adjectiveType1 value for this Sense.
     * 
     * @return adjectiveType1
     */
    public String getAdjectiveType1() {
        return adjectiveType1;
    }


    /**
     * Sets the adjectiveType1 value for this Sense.
     * 
     * @param adjectiveType1
     */
    public void setAdjectiveType1(String adjectiveType1) {
        this.adjectiveType1 = adjectiveType1;
    }


    /**
     * Gets the adjectiveType2 value for this Sense.
     * 
     * @return adjectiveType2
     */
    public String getAdjectiveType2() {
        return adjectiveType2;
    }


    /**
     * Sets the adjectiveType2 value for this Sense.
     * 
     * @param adjectiveType2
     */
    public void setAdjectiveType2(String adjectiveType2) {
        this.adjectiveType2 = adjectiveType2;
    }


    /**
     * Gets the adverbType1 value for this Sense.
     * 
     * @return adverbType1
     */
    public String getAdverbType1() {
        return adverbType1;
    }


    /**
     * Sets the adverbType1 value for this Sense.
     * 
     * @param adverbType1
     */
    public void setAdverbType1(String adverbType1) {
        this.adverbType1 = adverbType1;
    }


    /**
     * Gets the adverbType2 value for this Sense.
     * 
     * @return adverbType2
     */
    public String getAdverbType2() {
        return adverbType2;
    }


    /**
     * Sets the adverbType2 value for this Sense.
     * 
     * @param adverbType2
     */
    public void setAdverbType2(String adverbType2) {
        this.adverbType2 = adverbType2;
    }


    /**
     * Gets the id value for this Sense.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Sense.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the isAbbreviation value for this Sense.
     * 
     * @return isAbbreviation
     */
    public Boolean getIsAbbreviation() {
        return isAbbreviation;
    }


    /**
     * Sets the isAbbreviation value for this Sense.
     * 
     * @param isAbbreviation
     */
    public void setIsAbbreviation(Boolean isAbbreviation) {
        this.isAbbreviation = isAbbreviation;
    }


    /**
     * Gets the isCausative value for this Sense.
     * 
     * @return isCausative
     */
    public Boolean getIsCausative() {
        return isCausative;
    }


    /**
     * Sets the isCausative value for this Sense.
     * 
     * @param isCausative
     */
    public void setIsCausative(Boolean isCausative) {
        this.isCausative = isCausative;
    }


    /**
     * Gets the isColloquial value for this Sense.
     * 
     * @return isColloquial
     */
    public Boolean getIsColloquial() {
        return isColloquial;
    }


    /**
     * Sets the isColloquial value for this Sense.
     * 
     * @param isColloquial
     */
    public void setIsColloquial(Boolean isColloquial) {
        this.isColloquial = isColloquial;
    }


    /**
     * Gets the isIdiomatic value for this Sense.
     * 
     * @return isIdiomatic
     */
    public Boolean getIsIdiomatic() {
        return isIdiomatic;
    }


    /**
     * Sets the isIdiomatic value for this Sense.
     * 
     * @param isIdiomatic
     */
    public void setIsIdiomatic(Boolean isIdiomatic) {
        this.isIdiomatic = isIdiomatic;
    }


    /**
     * Gets the nounCategory value for this Sense.
     * 
     * @return nounCategory
     */
    public String getNounCategory() {
        return nounCategory;
    }


    /**
     * Sets the nounCategory value for this Sense.
     * 
     * @param nounCategory
     */
    public void setNounCategory(String nounCategory) {
        this.nounCategory = nounCategory;
    }


    /**
     * Gets the nounNumeralType value for this Sense.
     * 
     * @return nounNumeralType
     */
    public String getNounNumeralType() {
        return nounNumeralType;
    }


    /**
     * Sets the nounNumeralType value for this Sense.
     * 
     * @param nounNumeralType
     */
    public void setNounNumeralType(String nounNumeralType) {
        this.nounNumeralType = nounNumeralType;
    }


    /**
     * Gets the nounPluralType value for this Sense.
     * 
     * @return nounPluralType
     */
    public String getNounPluralType() {
        return nounPluralType;
    }


    /**
     * Sets the nounPluralType value for this Sense.
     * 
     * @param nounPluralType
     */
    public void setNounPluralType(String nounPluralType) {
        this.nounPluralType = nounPluralType;
    }


    /**
     * Gets the nounSpecifityType value for this Sense.
     * 
     * @return nounSpecifityType
     */
    public String getNounSpecifityType() {
        return nounSpecifityType;
    }


    /**
     * Sets the nounSpecifityType value for this Sense.
     * 
     * @param nounSpecifityType
     */
    public void setNounSpecifityType(String nounSpecifityType) {
        this.nounSpecifityType = nounSpecifityType;
    }


    /**
     * Gets the nounType value for this Sense.
     * 
     * @return nounType
     */
    public String getNounType() {
        return nounType;
    }


    /**
     * Sets the nounType value for this Sense.
     * 
     * @param nounType
     */
    public void setNounType(String nounType) {
        this.nounType = nounType;
    }


    /**
     * Gets the preNounAdjectiveType value for this Sense.
     * 
     * @return preNounAdjectiveType
     */
    public String getPreNounAdjectiveType() {
        return preNounAdjectiveType;
    }


    /**
     * Sets the preNounAdjectiveType value for this Sense.
     * 
     * @param preNounAdjectiveType
     */
    public void setPreNounAdjectiveType(String preNounAdjectiveType) {
        this.preNounAdjectiveType = preNounAdjectiveType;
    }


    /**
     * Gets the pronoun value for this Sense.
     * 
     * @return pronoun
     */
    public String getPronoun() {
        return pronoun;
    }


    /**
     * Sets the pronoun value for this Sense.
     * 
     * @param pronoun
     */
    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }


    /**
     * Gets the seqId value for this Sense.
     * 
     * @return seqId
     */
    public String getSeqId() {
        return seqId;
    }


    /**
     * Sets the seqId value for this Sense.
     * 
     * @param seqId
     */
    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }


    /**
     * Gets the synsetId value for this Sense.
     * 
     * @return synsetId
     */
    public String getSynsetId() {
        return synsetId;
    }


    /**
     * Sets the synsetId value for this Sense.
     * 
     * @param synsetId
     */
    public void setSynsetId(String synsetId) {
        this.synsetId = synsetId;
    }


    /**
     * Gets the transitiveType value for this Sense.
     * 
     * @return transitiveType
     */
    public String getTransitiveType() {
        return transitiveType;
    }


    /**
     * Sets the transitiveType value for this Sense.
     * 
     * @param transitiveType
     */
    public void setTransitiveType(String transitiveType) {
        this.transitiveType = transitiveType;
    }


    /**
     * Gets the value value for this Sense.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Sense.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Gets the verbActivePassive value for this Sense.
     * 
     * @return verbActivePassive
     */
    public String getVerbActivePassive() {
        return verbActivePassive;
    }


    /**
     * Sets the verbActivePassive value for this Sense.
     * 
     * @param verbActivePassive
     */
    public void setVerbActivePassive(String verbActivePassive) {
        this.verbActivePassive = verbActivePassive;
    }


    /**
     * Gets the verbPastStem value for this Sense.
     * 
     * @return verbPastStem
     */
    public String getVerbPastStem() {
        return verbPastStem;
    }


    /**
     * Sets the verbPastStem value for this Sense.
     * 
     * @param verbPastStem
     */
    public void setVerbPastStem(String verbPastStem) {
        this.verbPastStem = verbPastStem;
    }


    /**
     * Gets the verbPresentStem value for this Sense.
     * 
     * @return verbPresentStem
     */
    public String getVerbPresentStem() {
        return verbPresentStem;
    }


    /**
     * Sets the verbPresentStem value for this Sense.
     * 
     * @param verbPresentStem
     */
    public void setVerbPresentStem(String verbPresentStem) {
        this.verbPresentStem = verbPresentStem;
    }


    /**
     * Gets the verbTransitivity value for this Sense.
     * 
     * @return verbTransitivity
     */
    public String getVerbTransitivity() {
        return verbTransitivity;
    }


    /**
     * Sets the verbTransitivity value for this Sense.
     * 
     * @param verbTransitivity
     */
    public void setVerbTransitivity(String verbTransitivity) {
        this.verbTransitivity = verbTransitivity;
    }


    /**
     * Gets the verbType value for this Sense.
     * 
     * @return verbType
     */
    public String getVerbType() {
        return verbType;
    }


    /**
     * Sets the verbType value for this Sense.
     * 
     * @param verbType
     */
    public void setVerbType(String verbType) {
        this.verbType = verbType;
    }


    /**
     * Gets the word value for this Sense.
     * 
     * @return word
     */
    public Word getWord() {
        return word;
    }


    /**
     * Sets the word value for this Sense.
     * 
     * @param word
     */
    public void setWord(Word word) {
        this.word = word;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Sense)) return false;
        Sense other = (Sense) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adjectiveType1==null && other.getAdjectiveType1()==null) || 
             (this.adjectiveType1!=null &&
              this.adjectiveType1.equals(other.getAdjectiveType1()))) &&
            ((this.adjectiveType2==null && other.getAdjectiveType2()==null) || 
             (this.adjectiveType2!=null &&
              this.adjectiveType2.equals(other.getAdjectiveType2()))) &&
            ((this.adverbType1==null && other.getAdverbType1()==null) || 
             (this.adverbType1!=null &&
              this.adverbType1.equals(other.getAdverbType1()))) &&
            ((this.adverbType2==null && other.getAdverbType2()==null) || 
             (this.adverbType2!=null &&
              this.adverbType2.equals(other.getAdverbType2()))) &&
            this.id == other.getId() &&
            ((this.isAbbreviation==null && other.getIsAbbreviation()==null) || 
             (this.isAbbreviation!=null &&
              this.isAbbreviation.equals(other.getIsAbbreviation()))) &&
            ((this.isCausative==null && other.getIsCausative()==null) || 
             (this.isCausative!=null &&
              this.isCausative.equals(other.getIsCausative()))) &&
            ((this.isColloquial==null && other.getIsColloquial()==null) || 
             (this.isColloquial!=null &&
              this.isColloquial.equals(other.getIsColloquial()))) &&
            ((this.isIdiomatic==null && other.getIsIdiomatic()==null) || 
             (this.isIdiomatic!=null &&
              this.isIdiomatic.equals(other.getIsIdiomatic()))) &&
            ((this.nounCategory==null && other.getNounCategory()==null) || 
             (this.nounCategory!=null &&
              this.nounCategory.equals(other.getNounCategory()))) &&
            ((this.nounNumeralType==null && other.getNounNumeralType()==null) || 
             (this.nounNumeralType!=null &&
              this.nounNumeralType.equals(other.getNounNumeralType()))) &&
            ((this.nounPluralType==null && other.getNounPluralType()==null) || 
             (this.nounPluralType!=null &&
              this.nounPluralType.equals(other.getNounPluralType()))) &&
            ((this.nounSpecifityType==null && other.getNounSpecifityType()==null) || 
             (this.nounSpecifityType!=null &&
              this.nounSpecifityType.equals(other.getNounSpecifityType()))) &&
            ((this.nounType==null && other.getNounType()==null) || 
             (this.nounType!=null &&
              this.nounType.equals(other.getNounType()))) &&
            ((this.preNounAdjectiveType==null && other.getPreNounAdjectiveType()==null) || 
             (this.preNounAdjectiveType!=null &&
              this.preNounAdjectiveType.equals(other.getPreNounAdjectiveType()))) &&
            ((this.pronoun==null && other.getPronoun()==null) || 
             (this.pronoun!=null &&
              this.pronoun.equals(other.getPronoun()))) &&
            ((this.seqId==null && other.getSeqId()==null) || 
             (this.seqId!=null &&
              this.seqId.equals(other.getSeqId()))) &&
            ((this.synsetId==null && other.getSynsetId()==null) || 
             (this.synsetId!=null &&
              this.synsetId.equals(other.getSynsetId()))) &&
            ((this.transitiveType==null && other.getTransitiveType()==null) || 
             (this.transitiveType!=null &&
              this.transitiveType.equals(other.getTransitiveType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.verbActivePassive==null && other.getVerbActivePassive()==null) || 
             (this.verbActivePassive!=null &&
              this.verbActivePassive.equals(other.getVerbActivePassive()))) &&
            ((this.verbPastStem==null && other.getVerbPastStem()==null) || 
             (this.verbPastStem!=null &&
              this.verbPastStem.equals(other.getVerbPastStem()))) &&
            ((this.verbPresentStem==null && other.getVerbPresentStem()==null) || 
             (this.verbPresentStem!=null &&
              this.verbPresentStem.equals(other.getVerbPresentStem()))) &&
            ((this.verbTransitivity==null && other.getVerbTransitivity()==null) || 
             (this.verbTransitivity!=null &&
              this.verbTransitivity.equals(other.getVerbTransitivity()))) &&
            ((this.verbType==null && other.getVerbType()==null) || 
             (this.verbType!=null &&
              this.verbType.equals(other.getVerbType()))) &&
            ((this.word==null && other.getWord()==null) || 
             (this.word!=null &&
              this.word.equals(other.getWord())));
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
        if (getAdjectiveType1() != null) {
            _hashCode += getAdjectiveType1().hashCode();
        }
        if (getAdjectiveType2() != null) {
            _hashCode += getAdjectiveType2().hashCode();
        }
        if (getAdverbType1() != null) {
            _hashCode += getAdverbType1().hashCode();
        }
        if (getAdverbType2() != null) {
            _hashCode += getAdverbType2().hashCode();
        }
        _hashCode += getId();
        if (getIsAbbreviation() != null) {
            _hashCode += getIsAbbreviation().hashCode();
        }
        if (getIsCausative() != null) {
            _hashCode += getIsCausative().hashCode();
        }
        if (getIsColloquial() != null) {
            _hashCode += getIsColloquial().hashCode();
        }
        if (getIsIdiomatic() != null) {
            _hashCode += getIsIdiomatic().hashCode();
        }
        if (getNounCategory() != null) {
            _hashCode += getNounCategory().hashCode();
        }
        if (getNounNumeralType() != null) {
            _hashCode += getNounNumeralType().hashCode();
        }
        if (getNounPluralType() != null) {
            _hashCode += getNounPluralType().hashCode();
        }
        if (getNounSpecifityType() != null) {
            _hashCode += getNounSpecifityType().hashCode();
        }
        if (getNounType() != null) {
            _hashCode += getNounType().hashCode();
        }
        if (getPreNounAdjectiveType() != null) {
            _hashCode += getPreNounAdjectiveType().hashCode();
        }
        if (getPronoun() != null) {
            _hashCode += getPronoun().hashCode();
        }
        if (getSeqId() != null) {
            _hashCode += getSeqId().hashCode();
        }
        if (getSynsetId() != null) {
            _hashCode += getSynsetId().hashCode();
        }
        if (getTransitiveType() != null) {
            _hashCode += getTransitiveType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getVerbActivePassive() != null) {
            _hashCode += getVerbActivePassive().hashCode();
        }
        if (getVerbPastStem() != null) {
            _hashCode += getVerbPastStem().hashCode();
        }
        if (getVerbPresentStem() != null) {
            _hashCode += getVerbPresentStem().hashCode();
        }
        if (getVerbTransitivity() != null) {
            _hashCode += getVerbTransitivity().hashCode();
        }
        if (getVerbType() != null) {
            _hashCode += getVerbType().hashCode();
        }
        if (getWord() != null) {
            _hashCode += getWord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sense.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "Sense"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjectiveType1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "adjectiveType1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjectiveType2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "adjectiveType2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adverbType1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "adverbType1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adverbType2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "adverbType2"));
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
        elemField.setFieldName("isAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "isAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCausative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "isCausative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isColloquial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "isColloquial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIdiomatic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "isIdiomatic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nounCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "nounCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nounNumeralType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "nounNumeralType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nounPluralType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "nounPluralType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nounSpecifityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "nounSpecifityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nounType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "nounType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preNounAdjectiveType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "preNounAdjectiveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pronoun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "pronoun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "seqId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synsetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "synsetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitiveType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "transitiveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verbActivePassive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "verbActivePassive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verbPastStem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "verbPastStem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verbPresentStem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "verbPresentStem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verbTransitivity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "verbTransitivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verbType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "verbType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("word");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.farsnet", "word"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.farsnet", "Word"));
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
