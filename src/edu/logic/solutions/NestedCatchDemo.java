package edu.logic.solutions;

public class NestedCatchDemo {
    public static void main(String[] args) {
        int A[] = {30,20,10,40,0};

        try{
            int c =A[0]/A[4];
            System.out.println("Division is "+c);
            try {
                System.out.println(A[6]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index is invalid");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }

        System.out.println("Bye");
    }
}
//here one catch block is executed another catch block should not be executed
//The first exception (ArithmeticException) occurred in the outer try.
//
//When an exception occurs, Java jumps immediately to the first matching catch.
//
//The rest of the code inside the same try block (including inner try) is skipped.
//
//Therefore, only the matching catch block for that specific exception executes.


//    try{
//        int c =A[0]/A[4];
//            System.out.println("Division is "+c);
//            System.out.println(A[6]);
//        }
//                catch(ArrayIndexOutOfBoundsException e){
//        System.out.println("Index is invalid");
//            }
//                    catch(ArithmeticException e){
//        System.out.println("Denominator should not be 0");
//        }