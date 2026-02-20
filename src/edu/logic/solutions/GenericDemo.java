package edu.logic.solutions;

class MyArray<T>{
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v){
        A[length++] = v;
    }
    public void display(){
        for(int i = 0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public class GenericDemo {
    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.append(10);
        myArray.append(20);
        myArray.append(30);
        myArray.display();

        show(new String[]{"Hi","Hello","Bye"});

    }
}
