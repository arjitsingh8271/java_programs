class variables
{
	public static void main(String[] args) //(String[] args)
	{
		/*
		In Java:
		String, int, float, char, boolean
		*/

		String name = "Arjit";
		int a = 45;         // Allowed int a = 123_456_789;
		float b = 45.02f;  // Allowed float b = 123_456.02f; but Not Allowed float b = 123456_._02f
		char yes = 'y';
		boolean isAdult = false;

		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(yes);
		System.out.println(isAdult);

		/* Rules for constructing name of variables in java

		   1.Case Sensitive like 'Apple' != 'apple'
		   2.Start with Alphabet, '_' or '$'
		   3.Contain Alphabets, Numbers, Underscores '_' , or Doller '$'
		   4.Skould not be a Keyword
		   5.Should not contain whitespaces
		   6.Shoulde not be class name, if class is also in use
		   7.No limit on length of name
		   8.Follow Camel Care like 'ArjitKumarSingh'

		*/


	}
}