package edu.logic.solutions;

import java.util.Scanner;

public class RotatingAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        //int temp = arr[0];-> eta ekhane declare krle arr[0]=0 show krbe krn amra ekhono array er vetore input neini so it's wrong
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element : "+(i+1));
            arr[i] = scanner.nextInt();
        }

        int temp = arr[0];
        for(int i =1;i<arr.length;i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
