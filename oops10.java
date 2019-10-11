//
package com.k2js.oops.practice;

class Aprog7{
	static int i=30;
	Comparable c=20;
	void m(int a, int b){
		int i=10;
		int c=15;
		System.out.println(i+c+a+b+Aprog7.i+(Integer)this.c);
	}
}

class Aprog7Test{
	public static void main(String...abc){
		Aprog7.m();
	}
}
