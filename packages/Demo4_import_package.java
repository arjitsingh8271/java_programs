import mypac.Demo1_create;
import mypac.Demo2_create;
import mypac.inner_mypac.Demo3_create;


class Demo4_import_package {
	
	public static void main(String[] args) {

		Demo1_create d1 = new Demo1_create();
		d1.display();
		
		Demo2_create d2 = new Demo2_create();
		d2.display();
		
		Demo3_create d3 = new Demo3_create();
		d3.display();
	}
}