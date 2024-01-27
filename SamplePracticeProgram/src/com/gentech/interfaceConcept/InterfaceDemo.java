package com.gentech.interfaceConcept;
//java standard to prefix I for interface name
interface IProduct {
	void showProductName(String name);
}
interface IOrder {
	void showOrderTypes(String type);
}
class Laptop implements IOrder, IProduct {

	@Override
	//Here public access specifier is mandatory 
	//when implementing interface
	public void showProductName(String name) {
		System.out.println("Product Name: "+name);		
	}
	
	void displayPrice(double price) {
		System.out.println("Price of Laptop: "+price);
	}

	@Override
	public void showOrderTypes(String type) {
		System.out.println("Order Type: "+type);
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOrder lap1 = new Laptop();
		IProduct lap2 = (IProduct) lap1;
		// the below methods cannot be accessed if we provide 
		//interface with reference
	//	lap1.displayPrice(120000);
		lap2.showProductName("HCL");
		lap1.showOrderTypes("online");
	}

}
