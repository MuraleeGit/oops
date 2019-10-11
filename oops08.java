//
package com.k2js.oops.practice;

class Aprog4{
	static int i=20;
		   int j=10;
	
	}

class Aprog4Test{
	void m(){
		System.out.println(Aprog4.i+new Aprog4().j);
	}	
	public static void main(String...abc){
		new Aprog4Test().m();
	}
}
//output is 30
