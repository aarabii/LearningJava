package Day1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to finds its multiplication table.");
        int num = scanner.nextInt();

        System.out.println("upto which number you want to see multiplication.");
        int multi = scanner.nextInt();

        for (int i = 1; i <= multi; ++i){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
