package practice.sapient.practice.java8.iface.impl;

import practice.sapient.practice.java8.iface.SimpleInterface;

public class SimpleImplementation implements SimpleInterface{

	public void firstAbstractMethdod(){
		System.out.println("first abstract method");
	}

}


class SecondSimpleImplementation implements SimpleInterface{
	
	public void firstAbstractMethdod(){
		System.out.println("first abstract method");
	}
}