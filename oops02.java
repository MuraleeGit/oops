//
package com.k2js.oops.practice;

class Marker{
	String color,brand;
	int price;
	public static void main(String...abc){
		Marker m1= new Marker();
		m1.color="Black";
		m1.brand="Luxor";
		m1.price=25;
		
		Marker m2= new Marker();
		m2.color="Black";
		m2.brand="Sigma";
		m2.price=35;
		
		Marker m3=new Marker();
		m3.color="Blue";
		m3.brand="Camlin";
		m3.price=25;
		
		Marker m4=new Marker();
		m4.color="Red";
		m4.brand="Sigma";
		m4.price=30;
		
		System.out.println("marker color=" +m1.color + "brand=" +m1.brand +"price="+m1.price);
		System.out.println("marker color=" +m2.color + "brand=" +m2.brand +"price="+m2.price);
		System.out.println("marker color=" +m3.color + "brand=" +m3.brand +"price="+m3.price);
		System.out.println("marker color=" +m4.color + "brand=" +m4.brand +"price="+m4.price);
	}
}
