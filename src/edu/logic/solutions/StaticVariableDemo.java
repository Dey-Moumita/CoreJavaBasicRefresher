package edu.logic.solutions;

class TestDemo{
    static int x =10;
    int y = 20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println(x);
    }
}
public class StaticVariableDemo {
    public static void main(String[] args) {
        TestDemo testdemo1 = new TestDemo();

        testdemo1.show();
        testdemo1.x=30;
        testdemo1.y=50;
        testdemo1.display();

        TestDemo testdemo2 = new TestDemo();
        testdemo2.show();
    }
}
