package edu.logic.solutions;

public class SortingArraysOfStrings {
    public static void main(String[] args) {
        String arr[] = {"java","python","javascript","react"};
        java.util.Arrays.sort(arr);
        for(String x:arr){
            System.out.println(x);
        }

    }
}
