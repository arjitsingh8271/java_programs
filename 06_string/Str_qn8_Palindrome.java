class Str_qn8_Palindrome {
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
	    StringBuilder revStr = new StringBuilder(str);
	    
	    if(str.equals(revStr.reverse().toString())) {
	        return true;
	    }
        return false;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}