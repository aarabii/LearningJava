package Day2;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Whats the 2nd number: ");
        int num2 = scanner.nextInt();

        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++){

            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is: "+ gcd);
    }
}
