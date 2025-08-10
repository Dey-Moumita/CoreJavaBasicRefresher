package edu.logic.solutions;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "python";
        String str4 = "python";

//        System.out.println(str4.equals(str3));
//        System.out.println(str1.equals(str2));
//
//        System.out.println(str1.equalsIgnoreCase(str2));
//// when we are comparing strings it will take the string's of 1st letter's ascii valu & will take 2nd strings's 1st letter ascii value and compare
//        System.out.println(str2.compareTo(str3));
//        System.out.println(str1.compareTo(str2));
//       System.out.println(str3.compareTo(str1));
//        System.out.println(str3.compareTo(str2));

        System.out.println(str3.equals(str4));//return boolean type
        System.out.println(str3.compareTo(str4));//return int type
        //// if(str3.equals(str4) == 0)//it's wrong bcz here i try boolean value = int ,it's not possible
        if(str3.compareTo(str4) == 0){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
