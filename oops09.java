//
package com.k2js.oops.practice;

class Aprog6{
	static Object o=10;
	Comparable c=20;
	void m(){
	   Aprog6 a6=this;	
	   System.out.println((Integer)Aprog6.o+Integer.valueOf((String)a6.c));
	}
}

class Aprog6Test{
	public static void main(String...abc){
		
	}
}

//output is 30
