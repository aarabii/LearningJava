package Day1;

import java.util.Locale;
import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter an character.");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is an vowel");
        } else {
            System.out.println(ch + " is a constant");
        }
    }
}
