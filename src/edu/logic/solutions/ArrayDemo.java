package edu.logic.solutions;

public class ArrayDemo {
    public static void main(String[] args) {


        int A[]={1,2,3,4,5};
        //working function: here all the elements are printed by indexwise
        //means incrementing the index value one by one then that index print the value of this index
        for(int i =0;i<A.length;i++){//0<A.length//1<A.length//2<A.length//3<A.length//4<A.length
            System.out.println(A[i]);//A[0]=1//A[1]=2//A[2]=3//A[3]=4//A[4]=5
        }
        System.out.println();

        System.out.println(A.length);
        System.out.println();

        //working function: it prints each value directly from the array .
        for(int x:A){//1//2//3//4//5
            System.out.println(x);//1//2//3//4//5
        }


    }
}
