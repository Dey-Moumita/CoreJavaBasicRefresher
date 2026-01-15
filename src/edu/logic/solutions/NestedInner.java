package edu.logic.solutions;

class Outer{
    int x = 10;
    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }
    public void outerDisplay(){
        Inner inner = new Inner();
        inner.innerDisplay();
        System.out.println(inner.y);
        //System.out.println(y);//i can not acces the innersr class variable without calling it's object
    }
}
public class NestedInner {
    public static void main(String[] args) {
        //Outer outer = new Outer();
        //outer.outerDisplay();
        Outer.Inner outer = new Outer().new Inner();//when we want to direct access the inner class that time we will create outer class object then create inner class pbject
        outer.innerDisplay();
    }
}
