package edu.logic.solutions;

public class LoopsConcepts {
    public static void main(String[] args) {

//while loop
//        int i = 100;
//        while (i < 100) {
//            System.out.println(i);//it does not print anything bcz here condition is false & it is out from loop
//            i = i * 2;
//        }

// do while loop
//        int i = 100;
//        do{
//            System.out.println(i);//it prints 100 bcz here we see it's printing first then check the condition
//            i = i*2;
//        }while(i<100);
//    }

 //infinite loop
//         byte i = 1;
//         while(true){
//             System.out.println(i);//it continues printing bcz it passes true
//             i++;
//         }

     // for loop
     for(int i =0,j=1 ;i<=10; i++,j=j*2){
         System.out.println(i+" "+j);//here when condition of i true that time it iterates i & also j iterates & it's value will be changed.
         //j depends on condition of i,if condition false that time j also will be not printed
     }

    }
}

