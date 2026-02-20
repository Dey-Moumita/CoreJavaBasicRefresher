package edu.logic.solutions;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        //TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"c",3,"D"));

        HashMap<Integer,String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"c",3,"D"));

        tm.put(4,"E");
        tm.put(6,"G");

       // System.out.println(tm.ceilingEntry(5).getValue());//when we will use treemap use this method
        System.out.println(tm.entrySet());
        System.out.println(tm);
    }
}
