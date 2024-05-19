/* front/back = length*breadth
   right/left = breadth*height
   bottom/top = length*breadth

   area = 2*length*height + 2*breadth*height + 2*length*breadth
   volume = length*breadth*height

*/

import java.util.*;

class _04_input_qn_area_and_volume_of_a_cuboid
{
	public static void main (String[] args)
	{
		float length,breadth,height;
		float area,volume;

		System.out.println("Enter length,breadth and height: ");

		Scanner s=new Scanner(System.in);
		length = s.nextFloat();
		breadth = s.nextFloat();
		height = s.nextFloat();

		area = 2*((length*height) + (breadth*height) + (length*breadth)) ;
		volume = length*breadth*height ;

		System.out.println("Total Area is: " +area +"  and  " +"Volume is: " +volume);

	}
}