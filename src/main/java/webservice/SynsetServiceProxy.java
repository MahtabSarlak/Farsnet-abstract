package webservice;

public class SynsetServiceProxy implements SynsetService {
  private String _endpoint = null;
  private SynsetService synsetService = null;
  
  public SynsetServiceProxy() {
    _initSynsetServiceProxy();
  }
  
  public SynsetServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSynsetServiceProxy();
  }
  
  private void _initSynsetServiceProxy() {
    try {
      synsetService = (new  SynsetServiceServiceLocator()).getSynsetService();
      if (synsetService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)synsetService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)synsetService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (synsetService != null)
      ((javax.xml.rpc.Stub)synsetService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public  SynsetService getSynsetService() {
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService;
  }
  
  public  SynsetExample[] getSynsetExamples(String userKey, int synsetId) throws java.rmi.RemoteException{
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService.getSynsetExamples(userKey, synsetId);
  }
  
  public  WordNetSynset[] getWordNetSynsets(String userKey, int synsetId) throws java.rmi.RemoteException{
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService.getWordNetSynsets(userKey, synsetId);
  }
  
  public  SynsetRelation[] getSynsetRelationsById(String userKey, int synsetId) throws java.rmi.RemoteException{
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService.getSynsetRelationsById(userKey, synsetId);
  }
  
  public  SynsetRelation[] getSynsetRelationsByType(String userKey, int synsetId, String[] types) throws java.rmi.RemoteException{
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService.getSynsetRelationsByType(userKey, synsetId, types);
  }
  
  public  Synset[] getSynsetsByWord(String userKey, String searchStyle, String searchKeyword) throws java.rmi.RemoteException{
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService.getSynsetsByWord(userKey, searchStyle, searchKeyword);
  }
  
  public  Synset getSynsetById(String userKey, int synsetId) throws java.rmi.RemoteException{
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService.getSynsetById(userKey, synsetId);
  }
  
  public  SynsetGloss[] getSynsetGlosses(String userKey, int synsetId) throws java.rmi.RemoteException{
    if (synsetService == null)
      _initSynsetServiceProxy();
    return synsetService.getSynsetGlosses(userKey, synsetId);
  }
  
  
}