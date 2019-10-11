//
package com.k2js.oops.practice;

class Cprog1{
	static int i=10;
	Object o(Object o){
		if(o instanceof Integer)
			return "20";
		else
			return new Cprog2();
	}
}

class Cprog2{
	int j=30;
	static Cprog1 cp1=new Cprog1();
	static void m(){
		Cprog1 cp_1=Cprog2.cp1;
		Cprog2 cp2=(Cprog2)CP_1.o(null);
		System.out.println(Cp2.j+Cprog2.i+Integer.valueOf((String)cp_1.o(o)));
	}
}
class Cprog2Test{
	public static void main(String...abc){
		Cprog2.m();
	}
}