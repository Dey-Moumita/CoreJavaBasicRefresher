package edu.logic.solutions;

import java.util.Scanner;

public class FindMaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int max = 0 ;

        int arr[] = new int[size];
        //int max = arr[0];//it'll be worked but not always

        for(int i = 0;i<arr.length;i++){//0<4//1<4//2<4//3<4//4<4-no
            System.out.println("Enter the element "+(i+1));//(0+1)//(1+1)//(2+1)//(3+1)
            arr[i]= scanner.nextInt();//5//7//8//9
            //0++//1++//2++//3++
        }
        for(int i = 0;i<arr.length;i++){//0<4//1<4//2<4//3<4//4<4-no
            if(arr[i]>max){//arr[0]=5//arr[1]=7>5-yes;//arr[2]=8>7-yes//arr[3]=9>8-yes
                max=arr[i];//5//now 7//now 8//now 9
                //0++//1++//2++//3++
            }
        }
        System.out.println("The maximum element in the array is : "+max);//9
    }
}

