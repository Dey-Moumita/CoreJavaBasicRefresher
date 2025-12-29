package edu.logic.solutions;

 class MyRunnable implements Runnable {
     @Override
     public void run() {
         int i=1;
         while(true){
             System.out.println(i+"Hello");
             i++;
         }
     }
 }
 public class ThreadUsingRunnable{
     public static void main(String[] args) {
         MyRunnable obj = new MyRunnable();
         Thread th = new Thread(obj);
         th.start();
     }
 }
