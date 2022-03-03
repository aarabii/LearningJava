package Day3;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word.");
        String wrd = scanner.next();

        String reverseWrd = "";

        int wrdLength = wrd.length();

        for (int i = (wrdLength - 1); 1 >= 0; --i){
            reverseWrd = reverseWrd + wrd.charAt(i);
        }

        if (wrd.toLowerCase().equals(reverseWrd.toLowerCase())){
            System.out.println(wrd + " is a palindrome string");
        } else {
            System.out.println(wrd + " is not a palindrome string");
        }
    }
}
// error at line 21 unreachable statement
