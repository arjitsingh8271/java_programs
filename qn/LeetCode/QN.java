/*
Check if Array Is Sorted


*/

class QN {

	public static boolean check(int[] nums) {
   		int sum=0;
   		for (int i=0; i<nums.length; i++) {
   			sum += nums[i];    	
   		}

   		int n = nums.length;
   		int x = n * (n+1) / 2;

   		if ((sum - x) == 0)
   			return true;
 
   		return false;    
    }

	public static void main(String[] args) {
		
		System.out.println(check(new int[]{3,4,5,1,2}));
		System.out.println(check(new int[] {2,2,3,4}));
		System.out.println(check(new int[] {1,2,3}));

	}
}