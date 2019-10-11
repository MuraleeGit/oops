//
package com.k2js.oops.practice;

class E1{
	static Object o(Object o){
		if(o instanceof String)
			return 10;
		else if(o instanceof E1){
			return new E2();
			
		}
		return 20;
	}
}

class E2{
	Object o(Object o){
		if(o instanceof Float)
			return 30;
		else if(o instanceof Double)
			return 40f;
		else
			return new E1();
	}
	void m(){
		E2 e2=this;
		System.out.println(Integer.
	}
}

class E1E2Test{
	public static void main(String...abc){
		
	}
}

