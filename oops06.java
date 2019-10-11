//
package com.k2js.oops.practice;

class Aprog2{
	static int i=20;
		   int j=10;
	
	static void m(){
		Aprog2 ap2=new Aprog2();
		System.out.println(Aprog2.i+ ap2.j);
	}
	
}
class Aprog2Test{
	public static void main(String...abc){
		Aprog2.m();
	}
}