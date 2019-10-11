//
package com.k2js.oops.practice;

class Aprog1{
	static int i=20;
		   int j=10;
	
	static void m(){
		System.out.println(Aprog1.i+new Aprog1().j);
	}
	
}
class Aprog1Test{
	public static void main(String...abc){
		Aprog1.m();
	}
}