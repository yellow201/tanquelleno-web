/**
 * TestWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ft.tt.testing;

public class TestWebServiceLocator extends org.apache.axis.client.Service implements ft.tt.testing.TestWebService {

    public TestWebServiceLocator() {
    }


    public TestWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestWeb
    private java.lang.String TestWeb_address = "http://localhost:8080/tanquelleno/services/TestWeb";

    public java.lang.String getTestWebAddress() {
        return TestWeb_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestWebWSDDServiceName = "TestWeb";

    public java.lang.String getTestWebWSDDServiceName() {
        return TestWebWSDDServiceName;
    }

    public void setTestWebWSDDServiceName(java.lang.String name) {
        TestWebWSDDServiceName = name;
    }

    public ft.tt.testing.TestWeb getTestWeb() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestWeb_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestWeb(endpoint);
    }

    public ft.tt.testing.TestWeb getTestWeb(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ft.tt.testing.TestWebSoapBindingStub _stub = new ft.tt.testing.TestWebSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestWebWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestWebEndpointAddress(java.lang.String address) {
        TestWeb_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ft.tt.testing.TestWeb.class.isAssignableFrom(serviceEndpointInterface)) {
                ft.tt.testing.TestWebSoapBindingStub _stub = new ft.tt.testing.TestWebSoapBindingStub(new java.net.URL(TestWeb_address), this);
                _stub.setPortName(getTestWebWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TestWeb".equals(inputPortName)) {
            return getTestWeb();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://testing.tt.ft", "TestWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://testing.tt.ft", "TestWeb"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestWeb".equals(portName)) {
            setTestWebEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
