class QN_length_of_a_LL extends SinglyLL_1 {
	
	void len() {
		Node ptr = head;
		int count = 0;

		while(ptr != null) {
			ptr = ptr.next;
			count++;
		}
		System.out.println("Length: " +count);
	}

	public static void main(String[] args) {

		QN_length_of_a_LL ll = new QN_length_of_a_LL();

		ll.insertAtBegin(10);
		ll.insertAtEnd(20);
		ll.insertAtPosition(2, 30);
		ll.insertAtBegin(40);

		ll.display();
		ll.len();
	}
}