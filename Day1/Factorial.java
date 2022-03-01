package Day1;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial.");
        int num = scanner.nextInt();

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
