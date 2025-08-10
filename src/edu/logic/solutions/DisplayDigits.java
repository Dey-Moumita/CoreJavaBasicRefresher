package edu.logic.solutions;

import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = scanner.nextInt();

        int r;

        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
