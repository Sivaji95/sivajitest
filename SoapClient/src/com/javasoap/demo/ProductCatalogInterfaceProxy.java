package com.javasoap.demo;

public class ProductCatalogInterfaceProxy implements com.javasoap.demo.ProductCatalogInterface {
  private String _endpoint = null;
  private com.javasoap.demo.ProductCatalogInterface productCatalogInterface = null;
  
  public ProductCatalogInterfaceProxy() {
    _initProductCatalogInterfaceProxy();
  }
  
  public ProductCatalogInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductCatalogInterfaceProxy();
  }
  
  private void _initProductCatalogInterfaceProxy() {
    try {
      productCatalogInterface = (new com.javasoap.demo.ProductCatalogueServiceLocator()).getProductCataloguePort();
      if (productCatalogInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productCatalogInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productCatalogInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productCatalogInterface != null)
      ((javax.xml.rpc.Stub)productCatalogInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.javasoap.demo.ProductCatalogInterface getProductCatalogInterface() {
    if (productCatalogInterface == null)
      _initProductCatalogInterfaceProxy();
    return productCatalogInterface;
  }
  
  public java.lang.String[] getProductcategories() throws java.rmi.RemoteException{
    if (productCatalogInterface == null)
      _initProductCatalogInterfaceProxy();
    return productCatalogInterface.getProductcategories();
  }
  
  public java.lang.String[] getProducts(java.lang.String arg0) throws java.rmi.RemoteException{
    if (productCatalogInterface == null)
      _initProductCatalogInterfaceProxy();
    return productCatalogInterface.getProducts(arg0);
  }
  
  public com.javasoap.demo.Product[] getProductsv2(java.lang.String arg0) throws java.rmi.RemoteException{
    if (productCatalogInterface == null)
      _initProductCatalogInterfaceProxy();
    return productCatalogInterface.getProductsv2(arg0);
  }
  
  public boolean addProduct(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (productCatalogInterface == null)
      _initProductCatalogInterfaceProxy();
    return productCatalogInterface.addProduct(arg0, arg1);
  }
  
  
}