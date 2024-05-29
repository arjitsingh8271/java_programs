/*
A class created within the method of the enclosing 
class is known as Method Local Inner Class. Since the 
local inner class is not associated with Object, we 
can’t use private, public, or protected access 
modifiers with it. The only allowed modifiers are 
abstract or final.
*/

class outer
{

	void outerMethod()
	{
		System.out.println("Outer Class 'A'");

		class inner
		{
			void innerMethod(){
				System.out.println("Inner Class 'B'");
			}
		}

		inner in = new inner();
		in.innerMethod();	
	}
}


class oops_1_11_2_method_local_inner_class
{
	public static void main (String[] args)
	{
		outer a = new outer();
		a.outerMethod();		// Outer Class 'A'
								// Inner Class 'B'
	}
}