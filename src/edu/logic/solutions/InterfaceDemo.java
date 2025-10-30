package edu.logic.solutions;

class Phone{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sending sms");
    }
}
interface  ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    public void videoCall(){
        System.out.println("Smart phone can video calling");
    }
    @Override
    public void click(){
        System.out.println("Smart Phone clicking photo");
    }
    @Override
    public void record(){
        System.out.println("Smart Phone recording video");
    }
    @Override
    public void play(){
        System.out.println("Smart Phone playing music");
    }

    @Override
    public void stop() {
        System.out.println("Smart Phone stopped");
    }

}
public class InterfaceDemo {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.click();
        smartphone.videoCall();
        smartphone.record();
        smartphone.play();
        smartphone.stop();

        Phone phone = new SmartPhone();
        phone.call();
        phone.sms();

        ICamera icamera = new SmartPhone();
        icamera.click();
        icamera.record();

        IMusicPlayer imusicplayer = new SmartPhone();
        imusicplayer.play();
        imusicplayer.stop();

    }
}
