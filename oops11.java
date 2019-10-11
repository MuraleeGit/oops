//
package com.k2js.oops.practice;

class Aprog8{
	static int i=30;
	Object o="20";
	static void m(Object i, int a){
		int b =10;
		Comparable o=50;
		System.out.println(a+b+(Integer)i+Aprog8.i+Integer.valueOf((String)new Aprog8().o));
	}
}

class Aprog8Test{
	public static void main(String...abc){
		Aprog8.m(25,15);
	}
}