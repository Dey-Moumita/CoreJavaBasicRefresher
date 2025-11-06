package edu.logic.solutions;
//
//public class StaticBlockDemo {
//    static{
//        System.out.println("Block 1");
//    }
//    public static void main(String[] args) {
//        System.out.println("Main");
//    }
//    static{
//        System.out.println("Block 2");
//    }
//}

class Test{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}
public class StaticBlockDemo{
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Main");

    }
}
