package edu.logic.solutions;

import java.util.Scanner;

public class ArmstrongORNot{
    public static void main(String[] args) {

        //armstrong number means count each digits of a number & r jotogulo digits thakbe sei hisebe protita digit er power e thakbe total kotogulo digit number ta te ache r tarpor ech digit er power kore otake plus krle jodi input number tai abr ase setai armstrong no.
        //if we cube of each digit and add those,we'll get the prevoius number, (3)^3+(5)^3+(1)^3 = 153

         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();//we take 153 as input

        int m = n;//here we store the given input in m bcz lastly n becomes zero
        int sum = 0;
        int r;
        while(n>0){//153>0;//15>0;//1>0//0>0=false that's why it ends here
            r = n%10;//153%10 = 3;//15%10 = 5;//1%10=1
            n = n/10;//153/10 = 015;15/10 = 01;//1/10=0
            int cube = r*r*r;//(3)^3=27;//(5)^3=125//(1)^3=1
            sum = sum+cube;//sum = 0+27;//sum = 27+125;//sum=152+1;now sum is 153
        }
        if(sum==m){//153=153
            System.out.println("Its a ARMSTRONG Number");
        }else{
            System.out.println("Its not a ARMSTRONG Number");
        }
    }

}
