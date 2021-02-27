package similarity;

public class SimilarityServiceProxy implements   SimilarityService {
  private String _endpoint = null;
  private SimilarityService similarityService = null;
  
  public SimilarityServiceProxy() {
    _initSimilarityServiceProxy();
  }
  
  public SimilarityServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSimilarityServiceProxy();
  }
  
  private void _initSimilarityServiceProxy() {
    try {
      similarityService = (new   SimilarityServiceServiceLocator()).getSimilarityService();
      if (similarityService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)similarityService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)similarityService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (similarityService != null)
      ((javax.xml.rpc.Stub)similarityService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public   SimilarityService getSimilarityService() {
    if (similarityService == null)
      _initSimilarityServiceProxy();
    return similarityService;
  }
  
  public double similarityBySynset(int synsetId1, int synsetId2, String type) throws java.rmi.RemoteException{
    if (similarityService == null)
      _initSimilarityServiceProxy();
    return similarityService.similarityBySynset(synsetId1, synsetId2, type);
  }
  
  
}