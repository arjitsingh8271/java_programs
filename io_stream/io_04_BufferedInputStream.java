import java.io.*;

class io_04_BufferedInputStream
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("source1.txt");

		BufferedInputStream bis = new BufferedInputStream(fis);

		String line;
        // Read the file line by line
        while ((line = bis.readLine()) != null) 
        {
            System.out.println(line);
        }
	}
}