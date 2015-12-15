package ft.tt.testing;

public class TestWebProxy implements ft.tt.testing.TestWeb {
  private String _endpoint = null;
  private ft.tt.testing.TestWeb testWeb = null;
  
  public TestWebProxy() {
    _initTestWebProxy();
  }
  
  public TestWebProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestWebProxy();
  }
  
  private void _initTestWebProxy() {
    try {
      testWeb = (new ft.tt.testing.TestWebServiceLocator()).getTestWeb();
      if (testWeb != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testWeb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testWeb)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testWeb != null)
      ((javax.xml.rpc.Stub)testWeb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ft.tt.testing.TestWeb getTestWeb() {
    if (testWeb == null)
      _initTestWebProxy();
    return testWeb;
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (testWeb == null)
      _initTestWebProxy();
    return testWeb.sayHello(name);
  }
  
  
}