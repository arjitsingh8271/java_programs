import java.util.ArrayList;

class QN_LLintoArrayList {
	
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static Node head;

	void insertAtBegin(int data) {
		Node new_node = new Node(data);

		if(head == null)
			head = new_node;
		else {
			new_node.next = head;
			head = new_node;
		}
	}

	static void llIntoArrayList(ArrayList<Integer> arr) {
		Node ptr = head;
		while(ptr != null) {
			arr.add(ptr.data);
			ptr = ptr.next;
		}
	}

	void display() {
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data +" ");
			ptr = ptr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QN_LLintoArrayList ll = new QN_LLintoArrayList();

		ll.insertAtBegin(12);
		ll.insertAtBegin(22);
		ll.insertAtBegin(32);
		ll.insertAtBegin(21);
		ll.insertAtBegin(14);
		ll.display();

		ArrayList<Integer> arr = new ArrayList<>();
		llIntoArrayList(arr);
		System.out.println(arr);
	}
}


/*
14 21 32 22 12                                                                     
[14, 21, 32, 22, 12]
*/