import java.util.function.Predicate;

class PredicateQN_PasswordValidator {
    public static void main(String[] args) {
        Predicate<String> isStrongPassword = password -> 
            password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*\\d.*");

        System.out.println(isStrongPassword.test("Java1234"));  // true
        System.out.println(isStrongPassword.test("java1234"));  // false (no uppercase letter)
        System.out.println(isStrongPassword.test("Java"));      // false (too short, no digit)
    }
}
