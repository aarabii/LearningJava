package Day1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num;

        System.out.println("Enter an number.");
        num = scanner.nextDouble();

        if (num > 0.0){
            System.out.println(num + " is a positive number.");
        } else {
            System.out.println(num + " is a negative number.");
        }
    }
}
