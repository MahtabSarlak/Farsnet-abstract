/**
 * SynsetServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface SynsetServiceService extends javax.xml.rpc.Service {
    public String getSynsetServiceAddress();

    public  SynsetService getSynsetService() throws javax.xml.rpc.ServiceException;

    public  SynsetService getSynsetService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
