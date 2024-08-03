// Creating a File and Write some content

import java.io.*;

class io_02_FileInputStream
{
	public static void main(String[] args) throws Exception
	{
		
		FileInputStream f1 = new FileInputStream("Text1.txt");
		
		System.out.println(f1.available());		// Before Reading 22
		byte b[] = new byte[f1.available()];	// f1.available gives file content size.

		f1.read(b);

		String str1 = new String(b);
		System.out.println(f1.available());		// After Reading 0
		System.out.println(str1);
	}
}