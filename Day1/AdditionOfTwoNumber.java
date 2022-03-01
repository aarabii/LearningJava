package Day1;

import java.util.Scanner;

public class AdditionOfTwoNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 1st number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter your 2nd number: ");
        int num2 = scanner.nextInt();

        int add = num1 + num2;

        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + add);
    }
}
