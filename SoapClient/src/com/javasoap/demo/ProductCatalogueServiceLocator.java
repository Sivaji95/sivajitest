/**
 * ProductCatalogueServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javasoap.demo;

public class ProductCatalogueServiceLocator extends org.apache.axis.client.Service implements com.javasoap.demo.ProductCatalogueService {

    public ProductCatalogueServiceLocator() {
    }


    public ProductCatalogueServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductCatalogueServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductCataloguePort
    private java.lang.String ProductCataloguePort_address = "http://sivaji:8080/SoapDemo/ProductCatalogueService";

    public java.lang.String getProductCataloguePortAddress() {
        return ProductCataloguePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductCataloguePortWSDDServiceName = "ProductCataloguePort";

    public java.lang.String getProductCataloguePortWSDDServiceName() {
        return ProductCataloguePortWSDDServiceName;
    }

    public void setProductCataloguePortWSDDServiceName(java.lang.String name) {
        ProductCataloguePortWSDDServiceName = name;
    }

    public com.javasoap.demo.ProductCatalogInterface getProductCataloguePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductCataloguePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductCataloguePort(endpoint);
    }

    public com.javasoap.demo.ProductCatalogInterface getProductCataloguePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.javasoap.demo.ProductCataloguePortBindingStub _stub = new com.javasoap.demo.ProductCataloguePortBindingStub(portAddress, this);
            _stub.setPortName(getProductCataloguePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductCataloguePortEndpointAddress(java.lang.String address) {
        ProductCataloguePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.javasoap.demo.ProductCatalogInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.javasoap.demo.ProductCataloguePortBindingStub _stub = new com.javasoap.demo.ProductCataloguePortBindingStub(new java.net.URL(ProductCataloguePort_address), this);
                _stub.setPortName(getProductCataloguePortWSDDServiceName());
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
        if ("ProductCataloguePort".equals(inputPortName)) {
            return getProductCataloguePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://demo.javasoap.com/", "ProductCatalogueService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://demo.javasoap.com/", "ProductCataloguePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductCataloguePort".equals(portName)) {
            setProductCataloguePortEndpointAddress(address);
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
