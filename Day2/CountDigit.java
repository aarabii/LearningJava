package Day2;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;

        while (num != 0){
            num /= 10;
            ++count;
        }
        System.out.println("Number of digit in " + num + " is: " + count);

    }
}
