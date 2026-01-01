package edu.logic.solutions;

public class tryCatchDemo {
    public static void main(String[] args) {
        int A[] = {2,3,4,0,7};
        int a,b,c;
        try{
            c=A[0]/A[3];
            System.out.println("Division is "+c);
        }catch(ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
        try{
            System.out.println(A[8]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is invalid");
        }
    }
}
