/**
 * SenseServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface SenseServiceService extends javax.xml.rpc.Service {
    public String getSenseServiceAddress();

    public SenseService getSenseService() throws javax.xml.rpc.ServiceException;

    public SenseService getSenseService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
