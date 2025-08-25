package edu.logic.solutions;

import java.util.Scanner;

public class SearchingAnElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        boolean flag =false;
        int pos =0;
        for(int i =0;i<arr.length;i++){
               System.out.println("Enter element : "+(i+1));
                  arr[i]=scanner.nextInt();
        }
          System.out.println("Enter a target element : ");
           int target = scanner.nextInt();
           for(int i =0;i<arr.length;i++){

               if(arr[i]==target){
                   flag = true;
                   pos = i+1;
               }
           }
           if(flag==true){
               System.out.println("Element is found at position : "+(pos));
           }else{
               System.out.println("Element does not found");
           }
    }
}

