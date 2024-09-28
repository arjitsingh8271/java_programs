/*
Synchronization is crucial in a multithreaded environment to prevent 
concurrent access to shared resources, which can lead to data inconsistency. 
Java provides the synchronized keyword to control access to critical sections.
*/

// Resources or Shared Data
class shareData {
	synchronized void display(String s1) {
		for(int i=0 ; i<s1.length() ; i++) {
			System.out.print(s1.charAt(i));
		}
	}
}


// Thread 1
class myThread_1 extends Thread {
	shareData d1;

	myThread_1(shareData data) {
		d1=data;
	}

	public void run() {
		d1.display("Hello_World_");
	}
}


// Thread 2
class myThread_2 extends Thread {
	shareData d2;

	myThread_2(shareData data) {
		d2=data;
	}

	public void run() {
		d2.display("Welcome_to_Java.");
	}

}


// Main class
class mt_08_Thread_with_Synchronization {
	public static void main(String[] args) {
		shareData d = new shareData();

		myThread_1 t1 = new myThread_1(d);
		myThread_2 t2 = new myThread_2(d);

		t1.start();
		t2.start();
	}
}


// OUTPUT: Hello_World_Welcome_to_Java.