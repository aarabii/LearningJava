package Day1;

import java.util.Scanner;

public class MultiplicationOfTwoNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 1st number: ");
        float num1 = scanner.nextFloat();

        System.out.println("Enter your 2nd number: ");
        float num2 = scanner.nextFloat();

        float multi = num1*num2;

        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + multi);
    }
}
