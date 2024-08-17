/*
The Generic is similar to Template in C++,
Template are for Primitive Data type, Where Generic 
is for Objects

In Data<T> Class it will store any type of data value.
*/

// A generic class with a type parameter T
class Data<T> {
	private T t;

	 // Set the value of T
	public void setData(T t) {
		this.t = t;
	}

	 // Get the value of T
	public T getData() {
		return t;
	}
}


class _01_Generic {

	public static void main(String[] args) {

		Data<Integer> d1 = new Data<>();	// it will take Integer value
		d1.setData(10);
		System.out.println(d1.getData());	// 10

		Data<String> d2 = new Data<>();		// it will take String value
		d2.setData("Hello Java");
		System.out.println(d2.getData());	// Hello Java

	}
}