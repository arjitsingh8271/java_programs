class A
{
	boolean isOn;

	void lightOn()
	{
		isOn = true;
		System.out.println("Light is on " + isOn);
	}

	void lightOff()
	{
		isOn = false;
		System.out.println("Light is on " + isOn);
	}
}

class oops_1_01_2_class_object_field_and_method
{
	public static void main (String args[])
	{
		A a = new A();
		a.lightOn();		// Light is on true

		A b = new A();
		b.lightOff();		// Light is on false
	}
}