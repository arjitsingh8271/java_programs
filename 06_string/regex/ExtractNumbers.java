import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ExtractNumbers {
    public static void main(String[] args) {
        String text = "Price: 450 USD, Discount: 50 USD";
        String regex = "\\d+"; // Matches numbers

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}
