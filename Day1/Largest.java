package Day1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter your 2nd number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter your 3rd number: ");
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1>= num3){
            System.out.println(num1 + " is largest among all the number \n" + num1+","+num2+","+num3);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is largest among all the number \n" + num1+","+num2+","+num3);
        } else {
            System.out.println(num3 + " is largest among all the number \n" + num1+","+num2+","+num3);
        }
    }
}
