package practice.sapient.practice.java8.iface.impl;

import practice.sapient.practice.java8.iface.SimpleJava8Interface;

public class SimpleJava8Implementation implements SimpleJava8Interface{

	public static void main(String[] args) {

		SimpleJava8Interface iface = new SimpleJava8Implementation();
		iface.firstAbstractMethod();
		iface.newInterfaceFunctionality();
	}

	public void firstAbstractMethod() {
		System.out.println("first abstract method implementation");
	}
	
	
	//overriding defender method of interface
	public void newInterfaceFunctionality() {
		System.out.println("Trying to override New functionality");
	}

}
