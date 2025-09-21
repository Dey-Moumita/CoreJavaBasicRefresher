package edu.logic.solutions;

public class PatternDemo {
    public static void main(String[] args) {

//i means rows and j means column
        System.out.println("Pattern 1");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Pattern 2");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Pattern 3");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((j+i)+" ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Pattern 4");
        int count =0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                count++;
                System.out.format("%02d ",count);//here %02d means space filled with zero where gap occured that time we fill the gap using 2d
            }
            System.out.println("");
        }
    }
}
