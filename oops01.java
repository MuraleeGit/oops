//
package com.k2js.oops.practice;

class Marker{
	static String color,brand;
	static int price;
	public static void main(String...abc){
		Marker.color="Black";
		Marker.brand="Luxor";
		Marker.price=25;
		
		Marker.color="Black";
		Marker.brand="Sigma";
		Marker.price=35;
		
		Marker.color="Blue";
		Marker.brand="Camlin";
		Marker.price=25;
		
		Marker.color="Red";
		Marker.brand="Sigma";
		Marker.price=30;
		
		System.out.println("marker color=" +Marker.color + "brand=" +Marker.brand +"price="+Marker.price);
		System.out.println("marker color=" +Marker.color + "brand=" +Marker.brand +"price="+Marker.price);
		System.out.println("marker color=" +Marker.color + "brand=" +Marker.brand +"price="+Marker.price);
		System.out.println("marker color=" +Marker.color + "brand=" +Marker.brand +"price="+Marker.price);
	}
}
