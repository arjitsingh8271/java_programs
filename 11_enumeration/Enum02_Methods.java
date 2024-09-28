enum Laptop {
	Thinkpad(60_000), 
	Macbook(1_00_000), 
	XPS(90_000),
	VivoBook, 
	Surface(95_000);

	private int price;

	private Laptop() {
		price = 40_000;
	}

	private Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

class Enum02_Methods {
	public static void main(String[] args) {
		
		Laptop lap = Laptop.Macbook;
		System.out.println(lap +" Price: " + lap.getPrice());
		
		Laptop asus = Laptop.VivoBook;
		System.out.println(asus +" Price: " + asus.getPrice());

		for (Laptop laps : Laptop.values()) {
			System.out.println(laps +" Price: " + laps.getPrice());
		}

	}
}


/*
OUTPUT:	Macbook Price: 100000
		VivoBook Price: 40000
		
		Thinkpad Price: 60000
		Macbook Price: 100000
		XPS Price: 90000
		VivoBook Price: 40000
		Surface Price: 95000
*/