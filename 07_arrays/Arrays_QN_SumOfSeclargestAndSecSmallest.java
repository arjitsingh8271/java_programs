/*
Input: 	1 2 3 4 5
Output:	6		(2nd Samllest = 2 + 2nd Largest 4)
*/


import java.util.Arrays;

class Arrays_QN_SumOfSeclargestAndSecSmallest {
	
	static int sum1(int[] arr) {
		int s = Integer.MAX_VALUE;
		int sS = s;
		int l = Integer.MIN_VALUE;
		int sL = l;

		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > l) {
				sL = l;
				l = arr[i];
			}
			else if (arr[i] > sL && arr[i] != l) {
				sL = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < s) {
				sS = s;
				s = arr[i];
			}
			else if (arr[i] < sS && arr[i] != s) {
				sS = arr[i];
			}	
		}

		return sS+sL;
	}

	static int sum2(int[] arr) {
		Arrays.sort(arr);
		int sl = arr[arr.length - 2];
		int ss = arr[1];

		return sl+ss;
	}


	public static void main(String[] args) {
		
		int[] a = {4,6,1,2,5};
		System.out.println(sum1(a));
		System.out.println(sum2(a));
	}
}