package mypac2;

public class MultiplicationTable {
	
	private int num, upto;

	public MultiplicationTable(int num, int upto) {
		this.num = num;
		this.upto = upto;
		System.out.println("Table of " +num +" upto " +upto);
	}

	public int getNum() {return num;}
	public int getUpto() {return upto;}

	public void printTable() {

		for (int i=1; i<=upto; i++) {
			//System.out.println(num +" x " +i +" = " +num*i);
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
}