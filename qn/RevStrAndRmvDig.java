/*
Your task is to implement following string processing functions.

Task :
    Reverse the String 
    Remove the Digits 

Constraints:
    input string may contain more than one words.
    input string will have only alphabets, digits and space.
    Input string will not have any  special characters.
    Input string will have only one line of data.
*/

import java.util.Scanner;

class RevStrAndRmvDig {

    public static void reverseString(String text) {
        StringBuilder str = new StringBuilder(text);
        System.out.println("Reverse the String: " + str.reverse());
    }

    public static void removeDigit(String text) {
        String str = text.replaceAll("[0-9]", "");
        System.out.println("Remove the Digits: " + str);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        reverseString(text);
        removeDigit(text);
        
    }
}


/*
12Abcde34
Reverse the String: 43edcbA21
Remove the Digits: Abcde
*/