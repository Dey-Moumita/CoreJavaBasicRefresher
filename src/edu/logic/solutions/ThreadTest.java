package edu.logic.solutions;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 th = new MyThread1("My Thread 1");
        System.out.println(th.getId());
        System.out.println(th.getName());
        System.out.println(th.getPriority());
        th.start();
        System.out.println(th.getState());//jehetu ager line e start method call korechi tai state RUNNING jodi start method use na kortam tahole thread er state hoto NEW
        System.out.println(th.isAlive());
    }
}
