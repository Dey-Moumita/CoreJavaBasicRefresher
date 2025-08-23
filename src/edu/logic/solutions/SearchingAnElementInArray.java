package edu.logic.solutions;

import java.util.Scanner;

public class SearchingAnElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        boolean flag =false;
        int pos;
        for(int i =0;i<arr.length;i++){
               System.out.println("Enter element : "+(i+1));
                  arr[i]=scanner.nextInt();
        }
          System.out.println("Enter a target element : ");
           int target = scanner.nextInt();
           for(int i =0;i<arr.length;i++){

               if(arr[i]==target){
                   flag = true;
               }
           }
           if(flag){
               System.out.println("Element found");
           }else{
               System.out.println("Element not found");
           }
    }
}
