package edu.logic.solutions;

import java.util.Scanner;

public class CopyingAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int [size];
        int arr1[] = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element : "+(i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        System.out.println("Copied array elements : ");
        for(int i = 0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
