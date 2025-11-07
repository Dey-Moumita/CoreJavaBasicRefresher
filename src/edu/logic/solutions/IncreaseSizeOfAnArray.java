package edu.logic.solutions;

import java.util.Scanner;

public class IncreaseSizeOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int arr1[] = new int[2*size];
        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the element "+(i+1)+":");
            arr[i] = scanner.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        System.out.println(arr1.length);
    }
}
