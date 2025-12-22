package edu.logic.solutions;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=scanner.nextInt();
        b=scanner.nextInt();

        try{
            c=a/b;
            System.out.println("Division is "+c);
        }
        catch(ArithmeticException e){
            //System.out.println(e);//this line shows what exception occurs-> e holds
            System.out.println("Denominator should not be 0, try again");
        }
        System.out.println("Bye");
    }
}
//Code starts	->Stack (main method)
//Exception occurs ->	JVM creates object in Heap
//catch matches	-> e reference created in Stack
//Handle exception->	e → points to Heap object
//Program resumes->	e removed from Stack