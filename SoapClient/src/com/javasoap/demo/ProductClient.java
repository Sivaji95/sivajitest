package com.javasoap.demo;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

public class ProductClient {

	private static ProductCatalogInterface  portId;
	private static String[] products;

	public static void main(String[] args) throws RemoteException {
		
		ProductCatalogueServiceLocator productServ = new ProductCatalogueServiceLocator();
		try {
			 portId = productServ.getProductCataloguePort();
			 String[] productcategories = portId.getProductcategories();
			 List<String> asList = Arrays.asList(productcategories);
			 System.out.println(asList);
			 
			 boolean addProduct = portId.addProduct("books","Java4");
			 
			 products = portId.getProducts("books");
			 List<String> productsList = Arrays.asList(products);
			 System.out.println(productsList);
			 
			 
			 
			Product[] productsv2 = portId.getProductsv2("books");
			
			for(Product prod: productsv2){
				System.out.println(prod.getProductId()+" "+prod.getProductName()+" "+ prod.getPrice());
			}
			
			
			 
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
