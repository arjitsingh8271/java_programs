import myPack.A;
import myPack.B;
import myPack.arithOptr;

class d_19_4_24_Package_1
{
	public static void main(String args[])
	{
		A a = new A();
		a.fun_a_1();

		B b = new B();
		b.fun_b_1();

		arithOptr ab = new arithOptr();
		ab.fun_add(2,5);
		ab.fun_sub(2,5);
		ab.fun_multi(2,5);
		ab.fun_div(2,5);
	}
}