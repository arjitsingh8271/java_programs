import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        if (Pattern.matches(regex, email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
