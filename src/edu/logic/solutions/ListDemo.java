package edu.logic.solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,80,60,70));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,10);
        al1.set(6,54);//it behaves like replace method

        System.out.println(al1.contains(25));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(10));
        System.out.println(al1.lastIndexOf(10));
        System.out.println(al1);

//        for(int i  = 0;i<al1.size();i++){
//            System.out.println(al1.get(i));
//        }

        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Using lambda");
        al1.forEach(n->show(n));
    }
    static void show(int n){
        if(n>60) System.out.println(n);
    }
}
