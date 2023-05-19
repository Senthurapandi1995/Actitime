package com.actitime.pom;

public class B {

	public static void main(String[] args) {
		A a=new A(10);
		int v = a.getvalue();             //utilization
		System.out.println(v);             
		a.setVakue(30);                   //utilization
		System.out.println(a.getvalue());  
	}

}
