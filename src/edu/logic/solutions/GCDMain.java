package edu.logic.solutions;

import java.util.Scanner;

class Calculate {
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        calculate(num1,num2);

    }

    public void calculate(int num1,int num2) {
        int gcd = 1;
        int max = Math.max(num1, num2);
        for (int i = 1; i <= max; i++) {
            if(num1%i==0 && num2%i==0){
                gcd = i;;
            }

        }
        System.out.println("The GCD of two numbers is: " + gcd);
    }
}

public class GCDMain {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.input();
    }
}


