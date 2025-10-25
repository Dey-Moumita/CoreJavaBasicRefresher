package edu.logic.solutions;

class TV{
    public void switchOn(){
        System.out.println("TV is on");
    }
    public void changeChannel(){
        System.out.println("The TV channel is changed");
    }
}
class SmartTV extends TV{
    @Override
    public void switchOn(){
        System.out.println("SmartTV is on");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart TV channel is changed");
    }
    public void browse(){
        System.out.println("Smart TV is browsing");
    }

}
public class Overriding {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.switchOn();
        SmartTV smarttv = new SmartTV();
        smarttv.browse();
    }

}
