package edu.logic.solutions;

class ThreadExampleDemo extends Thread{
    public ThreadExampleDemo(String name){
        super(name);
    }
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class TestThreadMain {
    public static void main(String[] args) throws Exception {
        ThreadExampleDemo th = new ThreadExampleDemo("My Thread 1");
        th.start();
        th.interrupt();
    }
}
