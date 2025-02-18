// Creating a File and Write some content

import java.io.*;

class io_01_FileOutputStream
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream f1 = new FileOutputStream("TestFile1.txt");
			//f1.write("Hello");	//Error

			String s1 = "Learn Java Programming";

			// convert String into Bytes & write in file
			f1.write(s1.getBytes());		// -> Learn Java Programming

			// convert String into Bytes
			byte b[] = s1.getBytes();

			// write 1 by 1 in file
			//for(byte x:b)
			//	f1.write(x);				// -> Learn Java Programming

			// offset or slice the array
			//f1.write(b, 6, s1.length()-6);	// -> Java Programming
	





			f1.close();					// close File
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}