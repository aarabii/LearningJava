package Day3;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reveseNum = 0, remain;



        while (num != 0){
            remain = num % 10;
            reveseNum = reveseNum * 10 + remain;
            num /= 10;
        }

        if (originalNum == reveseNum){
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
