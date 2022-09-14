/* Roots of Quadratic Equation
   Formula: ax^2 + bx + c = 0
            (x + r1) (x + r2) = 0
            r1 = (-b + under root (b^2 - 4ac)) / 2a
			r1 = (-b - under root (b^2 - 4ac)) / 2a

			Ex: a=1 b=5 c=6           a=1 b=1 c=1      
			    then r1=-2  r2=-3     then r1=NaN  r2=NaN
*/



import java.lang.*;
import java.util.*;

class Roots_of_Quadratic_Equation
{
	public static void main (String args[])
	{
		int a,b,c;
		double r1, r2;

		System.out.println("Enter the value of a, b and c:");

		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();

		r1= (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
		r2= (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);

		System.out.println("Root are: " + r1 +" " + r2);
	}
}