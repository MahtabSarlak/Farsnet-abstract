/**
 * SimilarityService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package similarity;

public interface SimilarityService extends java.rmi.Remote {
    public double similarityBySynset(int synsetId1, int synsetId2, String type) throws java.rmi.RemoteException;
}
