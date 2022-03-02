package Day2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci Series till N terms (provide N): ");
        int num = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i<=num; i++){
            System.out.println(firstTerm);

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
