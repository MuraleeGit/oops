//
package com.k2js.oops.practice;

class Biscuitpack{
	
		String brand;
		String color;
		int price;
		int no_of_biscuits;
		String type_of_biscuits;
	
}
class BisuitCustomer{
	public static void main(String...abc){
		Biscuitpack Mariegold=new Biscuitpack();
		Mariegold.brand="britania";
		Mariegold.color="Brown";
		Mariegold.price=10;
		Mariegold.no_of_biscuits=20;
		Mariegold.type_of_biscuits= "regaular";
		
		Biscuitpack Nutrichoice=new Biscuitpack();
		Nutrichoice.brand="ITC";
		Nutrichoice.color="Chocolate";
		Nutrichoice.price=15;
		Nutrichoice.no_of_biscuits=30;
		Nutrichoice.type_of_biscuits= "chocolate";
		
		System.out.println("Mariegold brand is " + Mariegold.brand+ " color is " + Mariegold.color+" Price is" + Mariegold.price+
		" no of buscuits is "+Mariegold.no_of_biscuits+" Type of biscuit is" + Mariegold.type_of_biscuits);
		System.out.println(Mariegold);
	}
}