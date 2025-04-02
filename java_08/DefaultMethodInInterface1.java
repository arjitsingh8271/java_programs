/*
● Default methods in Interface are those methods, which are define in the interface with the keyword "default".
● Default method contain the complete defination of the function.
● Can be overriden or changed in the implementation class.
*/


interface Parent {
	default void hello() {
		System.out.println("Hello World");
	}
}

class Child implements Parent {

}

class Child2 implements Parent {
	@Override
	public void hello() {
		System.out.println("Hello");
	}
}

class DefaultMethodInInterface1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.hello();	//	-> Hello World

		Parent c2 = new Child();
		c2.hello();	//	-> Hello World

		Child2 c3 = new Child2();
		c3.hello();	//	-> Hello
	}
}
