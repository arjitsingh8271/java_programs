import java.util.*;

class array_1d_QN_second_largest_element
{
	public static int s_elmt(int a[])
	{
		int s_lrg, lrg;
		s_lrg = lrg = a[0];

		for (int i=0; i<a.length; i++) {

			if (a[i] > lrg) {
				s_lrg = lrg;
				lrg = a[i];
			}
			// else if (a[i] > s_lrg) {
			// 	s_lrg = a[i];
			// }			
		}

		return s_lrg;
	}

	public static void main(String[] args)
	{
		int arr[] = {11, 2, 13, 4, 5};
		System.out.println(s_elmt(arr));
	}
}