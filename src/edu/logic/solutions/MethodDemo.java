package edu.logic.solutions;

public class MethodDemo {
    static void change(int x[],int index,int value){
        x[index] = value;
    }
//    static void change(int A[],int index,int value){
//        A[index] = value;//here A[] is the reference ,it's not the actual array
        //that's why it can be named anything
        //for this name the actual array can not be changed

    static void change2(int x,int value) {//here x=20 are passed to this method & it's changing the value of x

        x = value;//it's changing this formal parameter
    }
//In case of array actual array is modified
    //i'sthe difference in java that when you pass primitives they are pass like value

    public static void main(String[] args) {
        int A[] = {2,4,6,8,10};
        change(A,2,20);
        //when you are passing an object as a parameter to a method this reference is being passed
        //in the above A is also holding the same array  bcz it's reference the same array that's why value will be changed
        //when passing primitives values it's totally the another method ,it's not referencing the same thing
        for(int x:A){
            System.out.println(x);
        }
        int x =10;
        change2(x,20);//but actual parameter is not modefied
        System.out.println("Value of primitive "+x);
    }
}

