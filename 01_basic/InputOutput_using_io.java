import java.io.*;

class InputOutput_using_io
{
	public static void main(String[] args) throws IOException
	{
		int num;
		try
		{
			DataInputStream obj=new DataInputStream(System.in);
			String s=obj.readLine();   // reading string
			// int num=obj.readInt();    not allowed
			num = Integer.parseInt(obj.readLine());  // reading integer
			System.out.println("Input String is: " + s);
			System.out.println("Input Int is: " + num);

		}
		catch(IOException e){}
	}
}