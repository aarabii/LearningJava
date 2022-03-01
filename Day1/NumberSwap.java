package Day1;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float firstNumber;
        float secondNumber;
        float tempNum;

        System.out.println("Enter your 1st number: ");
        firstNumber = scanner.nextFloat();
        System.out.println("Enter your 2nd number: ");
        secondNumber = scanner.nextFloat();

        System.out.println("--Before Swap--");
        System.out.println("Your 1st number is: " + firstNumber);
        System.out.println("Your 2nd number is: " + secondNumber);

        tempNum = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tempNum;

        System.out.println("--After Swap--");
        System.out.println("Your 1st number is: " + firstNumber);
        System.out.println("Your 2nd number is: " + secondNumber);
    }
}
