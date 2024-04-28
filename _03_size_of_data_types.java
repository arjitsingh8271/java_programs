import java.lang.*;

class _03_size_of_data_types
{
	public static void main(String args[])
	{
		System.out.println("byte: " + "\t" + Byte.SIZE + " bits");		// \t for tab
		System.out.println("short: " + "\t" + Short.SIZE + " bits");
		System.out.println("int: " + "\t" + Integer.SIZE + " bits");
		System.out.println("long: " + "\t" + Long.SIZE + " bits");
		System.out.println("float: " + "\t" + Float.SIZE + " bits");
		System.out.println("double: " + "\t" + Double.SIZE + " bits");
		System.out.println("char: " + "\t" + Character.SIZE + " bits");
		//System.out.println("string: " + "\t" + String.SIZE + " bits");
		//System.out.println("boolean: " + "\t" + boolean.SIZE + " bits");
	}
}



/*
OUTPUT: byte:   8 bits
		short:  16 bits
		int:     32 bits
		long:   64 bits
		float:  32 bits
		double:         64 bits
		char:   16 bits
*/