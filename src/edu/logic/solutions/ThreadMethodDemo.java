package edu.logic.solutions;

class MyThread2 extends Thread{
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++ +"My Thread");
        }
    }
}
public class ThreadMethodDemo {
    public static void main(String[] args) {
        MyThread2 th = new MyThread2();
        th.setDaemon(true);
        th.start();

        int count = 1;
        while(true){
            System.out.println(count++ +"Main Thread");
            Thread.yield();
        }


    }
}
