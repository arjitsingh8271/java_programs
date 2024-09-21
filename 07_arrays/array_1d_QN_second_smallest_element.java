import java.util.*;

class array_1d_QN_second_smallest_element
{
	public static int sS_elmt(int a[])
	{
		int s = Integer.MAX_VALUE;
        int sS = Integer.MAX_VALUE;

		for (int i=0; i<a.length; i++) {

			if (a[i] < s) {
				sS = s;
				s = a[i];
			}
			else if (a[i] < sS && a[i] != s) {
				sS = a[i];
			}			
		}

		return sS;
	}

	public static void main(String[] args)
	{
		int arr[] = {11, 2, 13, 4, 5};
		System.out.println(sS_elmt(arr));
	}
}