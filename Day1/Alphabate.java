package Day1;

import java.util.Scanner;

public class Alphabate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.println("Enter a character.");
        ch = scanner.next().charAt(0);

        if (Character.isAlphabetic(ch)){
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

    }
}
