import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Ex1 {
	public static void main(String[] args) {
		
		//String regex = "a*b";
		//Pattern p = Pattern.compile(regex);

		Pattern p = Pattern.compile("a*b");		// means: String start with Zero or more "a" & end with "b".

		// String to be match to pattern
		Matcher m = p.matcher("bb");		// return matcher object.
		System.out.println("Result: " +m.matches());
	}
}