package edu.logic.solutions;

import java.util.Scanner;

public class InsertingAnElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element no. : "+(i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to insert : ");
        int element = scanner.nextInt();

        System.out.print("Enter the position (1 to " + (size+1) + "): ");
        int position = scanner.nextInt();

        int[] newArr = new int[size+1];

        for(int i =0,j=0;i<newArr.length;i++){
            if(i==position -1){
                newArr[i] = element;
            }else{
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println("Array after insertion:");
        for(int i = 0;i< newArr.length;i++){
            System.out.println(newArr[i] + "");
        }
    }
}
