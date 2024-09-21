import java.util.*;

class array_1d_QN_second_largest_element
{
	public static int sL_elmt(int a[])
	{
		int l = Integer.MIN_VALUE;
        int sL = Integer.MIN_VALUE;

		for (int i=0; i<a.length; i++) {

			if (a[i] > l) {
				sL = l;
				l = a[i];
			}
			else if (a[i] > sL && a[i] != l) {
				sL = a[i];
			}			
		}

		return sL;
	}

	public static void main(String[] args)
	{
		int arr[] = {11, 2, 13, 4, 5};
		System.out.println(sL_elmt(arr));
	}
}