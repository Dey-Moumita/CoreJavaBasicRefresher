package edu.logic.solutions;

import java.util.Scanner;

public class Checkpalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check it's palindrome or not : ");
        int num = scanner.nextInt();
        int copy = num;
        int r;
        int rev = 0;

        while(num>0){
            r = num%10;
            num = num/10;
            rev = rev*10+r;
        }
        //if we give a number & then it's equal to the given number then it's palindrome like 125521= 125521
        //that's why we have to do reverse of the number
        if(rev==copy){
            System.out.println("It's a PALINDROME number");
        }else{
            System.out.println("It's not a PALINDROME number");
        }
    }
}
