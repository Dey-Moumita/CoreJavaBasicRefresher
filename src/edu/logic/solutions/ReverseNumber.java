package edu.logic.solutions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();//123
        int r;
        int rev = 0;//we need to initialize this variable bcz it's a local variable we want to to store some value into the variable
        while(num>0){//123>0//12>0//1>0
             r = num%10;//123%10=3 // 12%10=2 //1%10=1
             num = num/10;//123/10 =012;// 12/10=01 //1/10=0
             rev = rev * 10 +r;//rev = 0 * 10 +3// rev = 3*10+2 //rev=32*10+1 =321
        }
        System.out.println("The reverse of the number :" +rev);

    }
}
