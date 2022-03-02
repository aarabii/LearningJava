package Day2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Whats your 2nd number: ");
        int num2 = scanner.nextInt();

        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if(lcm % num1 == 0 && lcm % num2 == 0){
                System.out.printf("The LCM of %d and %d is %d", num1, num2, lcm);
                break;
            }
            ++lcm;
        }
    }
}
