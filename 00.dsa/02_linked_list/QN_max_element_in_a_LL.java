class QN_max_element_in_a_LL extends SinglyLL_1  {
	
	void maxElement() {
		Node ptr = head;
		int ele = ptr.data;

		while (ptr != null) {

			if (ele < ptr.data)
				ele = ptr.data;
			ptr = ptr.next;
		}
		System.out.println("Max Element: " +ele);
	}

	void minElement() {
		Node ptr = head;
		int ele = ptr.data;

		while (ptr != null) {

			if (ele > ptr.data)
				ele = ptr.data;
			ptr = ptr.next;
		}
		System.out.println("Min Element: " +ele);
	}


	public static void main(String[] args) {

		QN_max_element_in_a_LL ll = new QN_max_element_in_a_LL();

		ll.insertAtBegin(10);
		ll.insertAtEnd(20);
		ll.insertAtPosition(2, 40);
		ll.insertAtBegin(30);

		ll.display();
		ll. maxElement();
		ll. minElement();

	}
}