class Str_qn4_removeWhiteSpace {

    public static String removeWhiteSpaces(String str){
		String res = str.replaceAll("\\s", "");
        return res;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}