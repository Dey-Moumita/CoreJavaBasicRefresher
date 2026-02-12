package edu.logic.solutions;

class StackOverFlow extends Exception{
    public String toString(){
        return  "Stack is Full";
    }
}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}
class Stack{
    private int size;
    private int top=-1;
    private int s[];
    public Stack(int sz){
        size=sz;
        s=new int[sz];
    }
    public void push(int x) throws StackOverFlow{
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        s[top]=x;
    }
    public int pop() throws StackUnderFlow{
        int x=-1;
        if(top==-1)
            throw new StackUnderFlow();
        x=s[top];
        top--;
        return x;
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        try{
            stack.push(10);
            stack.push(11);
            stack.push(12);
            stack.push(13);
            stack.push(14);
        }catch (StackOverFlow s){
            System.out.println(s);
        }
    }
}
