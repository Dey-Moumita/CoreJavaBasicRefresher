package edu.logic.solutions;

import java.util.Scanner;

public class DisplayNumberInWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int rev = 0;
        int r;
        while(num>0){
            r=num%10;
            num=num/10;
            rev = rev*10+r;

        }
        while (rev>0){
            r = rev%10;
            rev /= 10;

            switch (r) {
                case 1:
                    System.out.println("one");
                    break;

                case 2:
                    System.out.println("two");
                    break;

                case 3:
                    System.out.println("three");
                    break;

                case 4:
                    System.out.println("four");
                    break;

                case 5:
                    System.out.println("five");
                    break;

                case 6:
                    System.out.println("six");
                    break;

                case 7:
                    System.out.println("seven");
                    break;

                case 8:
                    System.out.println("eight");
                    break;


                case 9:
                    System.out.println("nine");
                    break;


                case 0:
                    System.out.println("zero");
                    break;
            }
        }
        //System.out.println(str);
    }
}
