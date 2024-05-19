import java.util.*;
import java.lang.*;

class _04_input_qn_area_of_a_triangle
{
	public static void main (String[] args)
	{
		/*   Using base & hight
		     Formula:  Area = 1/2 * base * height
		*/ 
		
		// System.out.println("  Using 1st Formula:");
		// float base,height,area;
		// System.out.println("Enter Base and Height of the Triangle:");

		// Scanner s=new Scanner(System.in);
		// base = s.nextFloat();
		// height = s.nextFloat();

		// area = (base*height)/2 ;

		// System.out.println("Area of the Triangle is: " + area);



		/*   Using Three Sides
		     Formula:  s=1/2(side1+side2+side3)
		              Area = under root s(s-side1)(s-side2)(s-side3)
		*/
		
		System.out.println("  Using 2nd Formula:");
		float a,b,c,s;
		double area;
		System.out.println("Enter all 3 sides of the Triangle:");

		Scanner obj=new Scanner(System.in);
		a=obj.nextFloat();
		b=obj.nextFloat();
		c=obj.nextFloat();

		s = (a+b+c)/2 ;

		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("Area of the Triangle is: " + area);


	}
}