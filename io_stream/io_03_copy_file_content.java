// copy content of file1 into file2 in lowercase


import java.io.*;

/*
class io_03_copy_file_content
{
	public static void main(String[] args) throws Exception
	{
		// Reading
		FileInputStream fis = new FileInputStream("source1.txt");

		int size = fis.available();
		byte b[] = new byte[size];		
		fis.read(b);


		// Updating
		int i = 0;
		//byte c[] = new byte[size-1];
		while( i < size)
		{
			if (b[i]>65 && b[i]<=90)
				b[i] = b[i]+32;
			else
				b[i] = b[i];
		}


		// Writing
		FileOutputStream fos = new FileOutputStream("source2.txt");

		fos.write(b);

		fis.close();
		fos.close();
	}
}
*/


class io_03_copy_file_content
{
	public static void main(String[] args) throws Exception
	{

		FileInputStream fis = new FileInputStream("source1.txt");
		FileOutputStream fos = new FileOutputStream("source2.txt");


		int b;

		while((b=fis.read()) !=-1 )
		{
			if (b>=65 && b<=90)
				fos.write(b+32);
			else
				fos.write(b);
		}

		fis.close();
		fos.close();
	}
}