import java.util.Scanner;

class array_2d_02_creation {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Row: ");
		int r = sc.nextInt();
		System.out.println("Column: ");
		int c = sc.nextInt();

		int ar[][] = new int[r][c];

		for(int i=0; i<r; i++) {

			for(int j=0; j<c; j++)	{
				ar[i][j] = sc.nextInt();		
			}
		}


		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ar[i][j] + " ");
            }

            System.out.println();
        }

	}
}