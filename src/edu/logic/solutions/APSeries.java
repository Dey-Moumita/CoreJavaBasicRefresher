package edu.logic.solutions;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the difference between two numbers : ");
        int d =scanner.nextInt();
        System.out.println("Enter the total no. of the series : ");
        int n = scanner.nextInt();
        System.out.println("Print the  AP series : ");

        int term = a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term = term+d;
            //System.out.println(term);//if we write here the print statement that time starting term will not be printed
        }


    }
}
