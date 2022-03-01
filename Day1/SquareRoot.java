package Day1;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--here is the standard form of quadratic equation--");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("--please provide value according to that--");

        System.out.println("----------------------------------------");
        System.out.println("Enter the value of a");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c");
        double c = scanner.nextDouble();
        System.out.println("----------------------------------------");

        double bSquare = Math.pow(b, 2);

        double d = bSquare-(4*a*c);

        double root1, root2;

        if (d > 0) {

            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("----------------------------------------");
            System.out.println("Roots are real and distinct");
            System.out.format("root1 = %.2f and root2 = %.2f \n", root1, root2);
            System.out.println("----------------------------------------");

        } else if (d == 0) {

            root1 = root2 = -b / (2 * a);
            System.out.println("----------------------------------------");
            System.out.println("Roots are real and equal");
            System.out.format("root1 = root2 = %.2f; \n", root1);
            System.out.println("----------------------------------------");

        } else {

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.println("----------------------------------------");
            System.out.println("Roots are complex and distinct");
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi \n", real, imaginary);
            System.out.println("----------------------------------------");

        }

    }

}
