class Node {
	
	int data;
	Node next;

	Node (int data) {
		this.data = data;
		this.next = null;
	}
} 


class CreatingNode {
	
	public static void main(String[] args) {

		Node a = new Node(10);		// [a] -> [10|&b]
		
		Node b = new Node(20);		// [b] -> [20|&c]
		a.next = b;

		Node c = new Node(30);		// [c] -> [30|null]
		b.next = c;	 

		System.out.println(a.data);			// 10
		System.out.println(a.next);			// Node@7ad041f3 address of b
		System.out.println(a.next.data);	// 20
		System.out.println(b.next);			// Node@251a69d7 address of c
		System.out.println(b.next.data);	// 30
		System.out.println(c.next);			// null

	}
}