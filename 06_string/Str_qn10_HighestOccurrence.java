/*

findHighestOccurrence(String str)
Find the count of the highest occurring character in the string passed to the method and return the count.

Input:
	success
Output:
	3

Input:
	associated
Output:
	2

*/



class Str_qn10_HighestOccurrence {

	public static int findHighestOccurrence(String str){
		int[] freq = new int[256]; // For all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxCount = 0;
        for (int count : freq) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}