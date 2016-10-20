package practice.sapient;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		/*iface normalWay = new iface() {

			@Override
			public iface test() {
				return null;
			}

		};*/

		iface i = () -> null;
		System.out.println(i);
		System.out.println(i.test());

		iface1 i1 = () -> null;
		System.out.println(i1);

		
		// lamda expression chaining in normal way
		iface1 normalWay = new iface1() {

			@Override
			public iface1 test() {
				return new iface1() {

					@Override
					public iface1 test() {
						return null;
					}

				};
			}

		};
		
		// lamda expression chaining
		iface1 chaining = () -> null;
		iface1 chaining1 = () -> () -> null;
		iface1 chaining2 = () -> () -> () -> null;
		System.out.println("chaning" + chaining.test());
		System.out.println("chaning1" + chaining1.test());
		System.out.println("chaning2" + chaining2.test());
	}
}

@FunctionalInterface
interface iface {

	iface test();

	//String test();
	
	public static void main(String[] args){
		System.out.println("Main method inside functional interface");
	}

	static void test1() {
		System.out.println("static inside interface");
	}

	public default void testDefault() {
		System.out.println("Public default method");
	}
}

interface iface1 extends iface {

}

class AbstractClass {

	AbstractClass() {
		System.out.println("constructor inside Abstract class");
	}
}