package Day2;

import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a base number: ");
        int base = scanner.nextInt();
        System.out.println("Please provide the exponent number: ");
        int num2;
        int exponent = num2 = scanner.nextInt();

        long result = 1;

        while (exponent != 0){
            result *= base;
            --exponent;
        }
        System.out.printf("%d to the power %d is %d", base, num2, result);
    }
}
