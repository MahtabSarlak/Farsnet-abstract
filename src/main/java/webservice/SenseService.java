/**
 * SenseService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface SenseService extends java.rmi.Remote {
    public Sense[] getSensesBySynset(String userKey, int synsetId) throws java.rmi.RemoteException;
    public SenseRelation[] getSenseRelationsById(String userKey, int senseId) throws java.rmi.RemoteException;
    public PhoneticForm[] getPhoneticFormsByWord(String userKey, int wordId) throws java.rmi.RemoteException;
    public WrittenForm[] getWrittenFormsByWord(String userKey, int wordId) throws java.rmi.RemoteException;
    public SenseRelation[] getSenseRelationsByType(String userKey, int senseId, String[] types) throws java.rmi.RemoteException;
    public Sense[] getSensesByWord(String userKey, String searchStyle, String searchKeyword) throws java.rmi.RemoteException;
    public Sense getSenseById(String userKey, int senseId) throws java.rmi.RemoteException;
}
