class Outer {

	void outerDisplay() {

		class Inner {

			void innerDisplay() {
				System.out.println("innerDisplay()");
			}
		}

		Inner i = new Inner();
		i.innerDisplay();
	}
}


class InnerClass02_LocalInnerClass {
	
	public static void main(String[] args) {

		Outer o = new Outer();
		o.outerDisplay();
		
	}
}
