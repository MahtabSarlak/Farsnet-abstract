/**
 * SynsetService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface SynsetService extends java.rmi.Remote {
    public SynsetExample[] getSynsetExamples(String userKey, int synsetId) throws java.rmi.RemoteException;
    public WordNetSynset[] getWordNetSynsets(String userKey, int synsetId) throws java.rmi.RemoteException;
    public SynsetRelation[] getSynsetRelationsById(String userKey, int synsetId) throws java.rmi.RemoteException;
    public SynsetRelation[] getSynsetRelationsByType(String userKey, int synsetId, String[] types) throws java.rmi.RemoteException;
    public Synset[] getSynsetsByWord(String userKey, String searchStyle, String searchKeyword) throws java.rmi.RemoteException;
    public Synset getSynsetById(String userKey, int synsetId) throws java.rmi.RemoteException;
    public SynsetGloss[] getSynsetGlosses(String userKey, int synsetId) throws java.rmi.RemoteException;
}
