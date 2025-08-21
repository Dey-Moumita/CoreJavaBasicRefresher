package edu.logic.solutions;

import java.util.Scanner;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter " + size + " elements:");
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            //System.out.println(i);
            sum = sum + arr[i];

        }
        System.out.println("Sum of elements = " +sum);
    }
}
