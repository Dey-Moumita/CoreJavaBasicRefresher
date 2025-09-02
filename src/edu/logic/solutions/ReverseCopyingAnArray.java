package edu.logic.solutions;

import java.util.Scanner;

public class ReverseCopyingAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        for(int i = 0;i<arr1.length;i++){
            System.out.println("Enter the element " +(i+1) +":");
            arr1[i] = scanner.nextInt();
        }
//        for(int i = arr1.length-1;i>0;i--){
//            arr2[i] = arr1[i];
//        }

        for(int i = 0;i<arr1.length;i++){
            arr2[i] = arr1[(arr1.length-1)-i];
        }
        System.out.println("Copied array is : ");
        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
