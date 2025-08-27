package edu.logic.solutions;

import java.util.Scanner;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];//4
        int largest= arr[0];//5
        int secondLargest = arr[0];//5

        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the element : "+(i+1));
            arr[i] = scanner.nextInt();//5//6//7//8-example1
            //5//6//8//7-example 2 -for this else if will be used
        }
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>largest){
//                largest = arr[i];
//            }
//        }
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>secondLargest && largest>secondLargest){
//                secondLargest = arr[i];
//            }
//        }
        for(int i =1;i<arr.length;i++){//1<4//2<4//3<4-example 1
            //1<4//2<4//3<4-example 2
            if(arr[i]>largest){//arr[1]=6>5-yes//arr[2]=7>6-yes//arr[3]=8>7-yes-example 1
                //arr[1]=6>5//arr[2]=8>6//arr[3]=7>8-no-exit from if statement-example 2
                secondLargest = largest;//5//6//7-example 1
                //5//6-example 2
                largest = arr[i];//6//7//8-example 1
                //6//8-example 2
            }
            else if(arr[i]>secondLargest){//arr[3]=7>6-yes-example 2
                secondLargest = arr[i];//7-example 2
            }
        }
        System.out.println("The second largest element is : "+secondLargest);
    }
}
