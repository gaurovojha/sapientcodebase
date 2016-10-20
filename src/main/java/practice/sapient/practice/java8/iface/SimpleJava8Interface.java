package practice.sapient.practice.java8.iface;

public interface SimpleJava8Interface {

	public void firstAbstractMethod();
	
	/*
	 * Need some new functionality just add some defender methods..WOW sounds easy
	 * But is it a good design ????
	 */
	
	public default void newInterfaceFunctionality(){
		System.out.println("This is my new functionality");
	}
}
