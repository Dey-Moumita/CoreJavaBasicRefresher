package edu.logic.solutions;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable{
    String accno;
    String name;
    double balance;

    Account(){}
    Account(String a,String n,double b){
        this.accno = a;
        this.name = n;
        this.balance = b;
    }
    public String toString(){
        return  "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}
public class CollectionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account  acc = null;
        HashMap<String,Account> hm = new HashMap<>();



    }
}
