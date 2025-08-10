package edu.logic.solutions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of the given number : "+factorial);
    }
}
