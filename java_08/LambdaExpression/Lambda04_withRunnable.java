/*
class Myclass implements Runnable{
	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println("Hello " +i);
		}
	}
}

class Lambda04_withRunnable {
	public static void main(String[] args) {
		Myclass obj = new Myclass();
		Thread thread = new Thread(obj);
		thread.run();
	}
}
*/

class Lambda04_withRunnable {
	public static void main(String[] args) {
		Runnable obj = () -> {
			for (int i=1; i<=10; i++) {
				System.out.println("Hello " +i);
			}
		};

		Thread thread = new Thread(obj);
		thread.run();
	}
}