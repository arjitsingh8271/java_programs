class QN_EndingCheck {
	public static void main(String[] args) {
		System.out.println(checkEnding("abc", "bc"));
		System.out.println(checkEnding("abc", "d"));
		System.out.println(checkEnding("samurai", "zi"));
		System.out.println(checkEnding("feminine", "nine"));
		System.out.println(checkEnding("convention", "tio"));
		System.out.println(checkEnding("cooperative", "ooper"));
		System.out.println(checkEnding("extraterrestrial", "xtraterrestrial"));
		System.out.println(checkEnding("access", "ss"));
		System.out.println(checkEnding("motorist", "is"));
	}

	public static boolean checkEnding(String str1, String str2) {
  		for(int i=0; i<str2.length(); i++) {
			if(str1.charAt(str1.length()-str2.length()+i) != str2.charAt(i))
				return false;
		}
		return true;
  	}

  	// public static boolean checkEnding(String str1, String str2) {
  	// 	return str1.endsWith(str2);
  	// }

  	// public static boolean checkEnding(String str1, String str2) {
    // 	String substr = str1.substring(str1.length() - str2.length());
    // 	return substr.equals(str2);  
  	// }

}