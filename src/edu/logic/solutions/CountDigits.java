package edu.logic.solutions;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        int count = 0;

        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
