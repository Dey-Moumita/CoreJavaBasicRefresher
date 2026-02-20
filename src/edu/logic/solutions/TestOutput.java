package edu.logic.solutions;

import java.util.Scanner;

public class TestOutput {
    public void printNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        System.out.println("The number is : "+num);
    }
}
class main{
    public static void main(String[] args) {
        TestOutput t = new TestOutput();
        t.printNumber();
    }
}
