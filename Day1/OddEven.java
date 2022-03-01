package Day1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an number to check whether this number is an odd number or even number.");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println( num + " is an even number.");
        } else {
            System.out.println( num + " is an odd number.");
        }
    }
}
