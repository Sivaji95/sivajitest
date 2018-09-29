/**
 * ProductCatalogInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javasoap.demo;

public interface ProductCatalogInterface extends java.rmi.Remote {
    public java.lang.String[] getProductcategories() throws java.rmi.RemoteException;
    public java.lang.String[] getProducts(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.javasoap.demo.Product[] getProductsv2(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean addProduct(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
