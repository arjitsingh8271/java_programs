/*
The Random class in Java is part of the java.util package and is used to generate pseudo-random numbers. 
It provides various methods to generate random values of different data types such as int, long, float, double, and boolean values.

Commonly Used Methods
---------------------
nextInt()			Returns a random integer.
nextInt(int bound)	Returns a random integer between 0 (inclusive) and bound (exclusive).
nextDouble()		Returns a random double between 0.0 (inclusive) and 1.0 (exclusive).
nextLong()			Returns a random long value.
nextFloat()			Returns a random float between 0.0f (inclusive) and 1.0f (exclusive).
nextBoolean()		Returns a random boolean value.
setSeed(long seed)	Sets the seed for the random number generator.

*/


import java.util.Random;

class RandomClass1 {
	
	static int Otp1(){
		Random random = new Random();
		return random.nextInt();		// random -ve to +ve digits
	}

	static int Otp2(){
		Random random = new Random();
		return random.nextInt(10000);	//up to 4 digits
	}

	static int Otp3(){
		Random random = new Random();
		// Generate a random number between 1000 and 9999 (inclusive)
        int fourDigitRandom = 1000 + random.nextInt(9000);	// only +ve 4 digits

        return fourDigitRandom;
	}

	static String Otp4(){
		Random random = new Random();
        int fourDigitRandom = 1000 + random.nextInt(9000);

        return Integer.toString(fourDigitRandom);			// only +ve 4 digits (String)
	}

	static int Otp5(){
		return (int)(Math.random() * 9000) + 1000;			// only +ve 4 digits
	}

	public static void main(String[] args) {
		System.out.println(Otp1());
		System.out.println(Otp2());
		System.out.println(Otp3());
		System.out.println(Otp4());
		System.out.println(Otp5());

	}
}