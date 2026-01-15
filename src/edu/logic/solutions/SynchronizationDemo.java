package edu.logic.solutions;

class ATM {
    public void checkBalance(String name) {
        System.out.println(name + " Checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Balance");
    }

    public void withdraw(String name, int amount) {
        System.out.println(name + " withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(amount);
    }
}

class Customers extends Thread{
    String name;
    int amount;
    ATM atm;
    Customers(String name,ATM atm,int amount){
        this.name=name;
        this.atm=atm;
        this.amount= amount;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }
    public void run(){
        useATM();
    }

}

public class SynchronizationDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customers customer1 = new Customers("Smith",atm,100);
        Customers customer2 = new Customers("John",atm,200);
        customer1.start();
        customer2.start();
    }
}
