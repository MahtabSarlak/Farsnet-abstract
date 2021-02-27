package webservice;

public class SenseServiceProxy implements SenseService {
  private String _endpoint = null;
  private SenseService senseService = null;
  
  public SenseServiceProxy() {
    _initSenseServiceProxy();
  }
  
  public SenseServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSenseServiceProxy();
  }
  
  private void _initSenseServiceProxy() {
    try {
      senseService = (new SenseServiceServiceLocator()).getSenseService();
      if (senseService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)senseService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)senseService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (senseService != null)
      ((javax.xml.rpc.Stub)senseService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SenseService getSenseService() {
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService;
  }
  
  public Sense[] getSensesBySynset(String userKey, int synsetId) throws java.rmi.RemoteException{
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService.getSensesBySynset(userKey, synsetId);
  }
  
  public SenseRelation[] getSenseRelationsById(String userKey, int senseId) throws java.rmi.RemoteException{
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService.getSenseRelationsById(userKey, senseId);
  }
  
  public PhoneticForm[] getPhoneticFormsByWord(String userKey, int wordId) throws java.rmi.RemoteException{
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService.getPhoneticFormsByWord(userKey, wordId);
  }
  
  public WrittenForm[] getWrittenFormsByWord(String userKey, int wordId) throws java.rmi.RemoteException{
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService.getWrittenFormsByWord(userKey, wordId);
  }
  
  public SenseRelation[] getSenseRelationsByType(String userKey, int senseId, String[] types) throws java.rmi.RemoteException{
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService.getSenseRelationsByType(userKey, senseId, types);
  }
  
  public Sense[] getSensesByWord(String userKey, String searchStyle, String searchKeyword) throws java.rmi.RemoteException{
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService.getSensesByWord(userKey, searchStyle, searchKeyword);
  }
  
  public Sense getSenseById(String userKey, int senseId) throws java.rmi.RemoteException{
    if (senseService == null)
      _initSenseServiceProxy();
    return senseService.getSenseById(userKey, senseId);
  }
  
  
}