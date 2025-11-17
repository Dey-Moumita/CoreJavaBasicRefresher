package edu.logic.solutions;

//primitives are passed by value and objects are passed by reference
public class ParameterPassingDemo {
    int  add(int x,int y){//here the value of a & b is copied here not the actual value of a & b
        int z;
        z=x+y;
        return z;
    }
    void welcome(String n){
        System.out.println("Welcome "+n);//here n is conatained the address of this object means it's copied the address from the reference
        //it's not creted a new object ..it's actually referred the same object only the address is copied from actual parameter
    }

    public static void main(String[] args) {
        ParameterPassingDemo obj = new ParameterPassingDemo();
        int a=10,b=5,c;
        c=obj.add(a,b);//call by value
        System.out.println(c);

        String name="Moumita";//here name is the variable and it's refer to the object means the address of this object is contained in this variable
        obj.welcome(name);//call by refernce
    }
}
