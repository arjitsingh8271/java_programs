/*
Input:
	He@#$llo!*&
Output:
	Hello@#$!*&

Input:
	%$Well*&come!
Output:
	Welcome%$*&!

*/


class Str_qn7_moveSpacleCharacter {
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		StringBuilder letters = new StringBuilder();
        StringBuilder specials = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                letters.append(ch);
            } else {
                specials.append(ch);
            }
        }

        return letters.toString() + specials.toString();
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}