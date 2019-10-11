//
package com.k2js.oops.practice;

abstract class A{
	int i=10;
	static int j=20;
	
}
class B{
	static int i=30;
	Object j=40;
	
	void m(){
		CharSequence i="50";
		java.io.serializable j=60;
		int locali=Integer.valueOf((String)i);
		int localj=(Integer)j;
		int BGlobali=B.i;
		int BGlobalj=B.this.j;
		int Alocali=new A(){};
		int AlocalJ=A.j;
		System.out.println(locali+localj+BGlobali+BGlobalj+Alocali+AlocalJ);
	}
	
}

class TestAB{
	public static void main(String...abc){
		b B=new b();
		b.m();
	}
}