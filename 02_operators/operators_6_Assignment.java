// Assignment Operators (=, +=, -=, =, /=, %=)

class operators_6_Assignment {
    public static void main(String[] args) {
        int a = 5;
        a += 3;      // a = a + 3
        System.out.println("a after += 3: " + a);
        
        a = 5;
        a -= 2;      // a = a - 2
        System.out.println("a after -= 2: " + a);
        
        a = 5;
        a *= 4;      // a = a * 4
        System.out.println("a after *= 4: " + a);
        
        a = 5;
        a /= 2;      // a = a / 2
        System.out.println("a after /= 2: " + a);

        a = 5;
        a %= 3;      // a = a % 3
        System.out.println("a after %= 3: " + a);
    }
}
