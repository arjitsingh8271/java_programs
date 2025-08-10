/*

removeDuplicatesandSpaces(String str)
Remove all the duplicate characters and white spaces from the string passed to the method and return the modified string.


Input:
    object oriented programming
Output:
    objectrindpgam

Input:
    hello world
Output:
    helowrd

*/


class Str_qn11_RemoveDuplicates {
    public static String removeDuplicatesandSpaces(String str){
       StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && !seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        return result.toString();
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}
}