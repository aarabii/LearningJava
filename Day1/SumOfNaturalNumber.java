package Day1;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("upto which number you want to add a natural number.");
        int num = scanner.nextInt();

        int i = 1, sum = 0;

        while (i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
