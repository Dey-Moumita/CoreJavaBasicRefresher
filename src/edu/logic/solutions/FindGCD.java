package edu.logic.solutions;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();
        int max = Math.max(num1, num2);
        int gcd = 1;
        for (int i = 1; i <= max; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The gcd of those two numbers is : " + gcd);
    }
}
