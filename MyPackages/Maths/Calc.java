package MyPackages.Maths;

public class Calc {
	
	int num1, num2;

	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {return num1+num2;}
	public int sub() {return num1-num2;}
	public int mul() {return num1*num2;}
	public int div() {return num1/num2;}
	public int rem() {return num1%num2;}

}