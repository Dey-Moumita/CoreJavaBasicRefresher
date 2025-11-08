package edu.logic.solutions;

import java.util.Scanner;

class CheckPrime {
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check it's prime or not : ");
        int n = scanner.nextInt();
        calculate(n);
    }

    public void calculate(int n) {
        boolean isPrime = true;
        //   for (int i = 2; i < n; i++) {
        //      if (n % i == 0) {
        //          isPrime = false;
        //             break;
        //    }
        //  }
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + "is a prime number");
        } else {
            System.out.println(n + "is not a prime number");
        }
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        CheckPrime obj = new CheckPrime();
        obj.input();
    }
}
