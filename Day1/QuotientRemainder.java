package Day1;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){
        //int dividend = 25, divisor = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your dividend: ");
        int dividend = scanner.nextInt();

        System.out.println("Enter your divisor: ");
        int divisor = scanner.nextInt();

        int quotient = dividend/divisor;
        int reminder = dividend%divisor;

        System.out.println("Quotient after dividing " + dividend + " by " + divisor + " is: " + quotient);
        System.out.println("Remainder after dividing " + dividend + " by " + divisor + " is: " + reminder);
    }
}
