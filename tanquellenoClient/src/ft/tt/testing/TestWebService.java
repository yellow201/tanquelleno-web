/**
 * TestWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ft.tt.testing;

public interface TestWebService extends javax.xml.rpc.Service {
    public java.lang.String getTestWebAddress();

    public ft.tt.testing.TestWeb getTestWeb() throws javax.xml.rpc.ServiceException;

    public ft.tt.testing.TestWeb getTestWeb(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
