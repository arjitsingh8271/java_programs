
@SuppressWarnings("unchecked")	// for ignore warning

class MyArray<T> {
	
	T arr[] = (T[]) new Object[10];		// We can't create an Array of type Generic
										// We should create an Array of type Object 
										// Then TypeCast it as Generic

	int len = 0;

	void append(T v) {
		arr[len++] = v;
	}

	void display() {
		for(int i=0; i<len; i++) {
			System.out.println(arr[i]);
		}
	}
}

class _02_Generic_Array {
	
	public static void main(String[] args) {

		MyArray<Integer> a1 = new MyArray<>();
		a1.append(10);
		a1.append(20);
		a1.append(30);

		a1.display();
	}
}