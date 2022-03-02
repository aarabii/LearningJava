package Day2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int reversed = 0;

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Your original number is: " + num);

        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Your reversed number is: " + reversed);
    }
}
