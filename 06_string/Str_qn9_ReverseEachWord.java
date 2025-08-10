/*
Input:
	all cows eat grass
Output:
	lla swoc tae ssarg

Input:
	I love programming
Output:
	l eovl gnimmargorp

*/

class Str_qn9_ReverseEachWord {
    public static String reverseEachWord(String str){
       String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" ");
        }

        return result.toString().trim();
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}