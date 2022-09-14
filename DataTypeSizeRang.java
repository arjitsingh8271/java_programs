import java.lang.*;

class DataTypeSizeRang
{
	public static void main(String args[])                        // Default
	{
		System.out.println("Int Min: " + Integer.MIN_VALUE);      // 0
		System.out.println("Int Max: " + Integer.MAX_VALUE);
		System.out.println("Int Bytes: " + Integer.BYTES);
		System.out.println(" ");

		System.out.println("Float Min: " + Float.MIN_VALUE);      // 0.0f
		System.out.println("Float Max: " + Float.MAX_VALUE);
		System.out.println("Float Bytes: " + Float.BYTES);
		System.out.println(" ");

		System.out.println("Double Min: " + Double.MIN_VALUE);     // 0.0d
		System.out.println("Double Max: " + Double.MAX_VALUE);
		System.out.println("Double Bytes: " + Double.BYTES);
		System.out.println(" ");

		System.out.println("Char Min: " + Character.MIN_VALUE);    // \u0000
		System.out.println("Char Max: " + Character.MAX_VALUE);
		System.out.println("Char Bytes: " + Character.BYTES);
		System.out.println(" ");

		System.out.println("Byte Min: " + Byte.MIN_VALUE);         //0
		System.out.println("Byte Max: " + Byte.MAX_VALUE);
		System.out.println("ByteBytes: " + Byte.BYTES);
		System.out.println(" ");

		System.out.println("Short Min: " + Short.MIN_VALUE);       // 0
		System.out.println("Short Max: " + Short.MAX_VALUE);
		System.out.println("Short Bytes: " + Short.BYTES);
		System.out.println(" ");

		System.out.println("Long Min: " + Long.MIN_VALUE);         //0
		System.out.println("Long Max: " + Long.MAX_VALUE);
		System.out.println("Long Bytes: " + Long.BYTES);
		System.out.println(" ");
	}
}