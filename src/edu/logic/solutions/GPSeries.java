package edu.logic.solutions;

import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting term : ");
        int a = scanner.nextInt();
        System.out.println("Enter the ratio of two numbers : ");
        int r = scanner.nextInt();
        System.out.println("Enter the total terms in the series : ");
        int n = scanner.nextInt();
        System.out.println("Print the GP series : ");
        int term = a;
        for(int i =0;i<n;i++){
            System.out.print(term+",");
            term = term*r;
        }
    }
}
