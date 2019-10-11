//
package com.k2js.oops.practice;

class Aprog3{
	static int i=20;
		   int j=10;
	
	 void m(){
		System.out.println(Aprog3.i+this.j);
	}
	
}
class Aprog3Test{
	public static void main(String...abc){
		new Aprog3().m();
	}
}
//output is 30
