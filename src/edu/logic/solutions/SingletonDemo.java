package edu.logic.solutions;

class Coffeemachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private Coffeemachine coffeemachine = null;

    private  Coffeemachine(){
        coffeeQty =1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }
    public void fillSugar(float qty){
        sugarQty = qty;
    }
    public float getCoffee(){
        return 0.23f;
    }
    static Coffeemachine getInstance(){
        if(coffeemachine==null)
            coffeemachine = new Coffeemachine();
        return  coffeemachine;
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        Coffeemachine obj1 = Coffeemachine.getInstance();
        Coffeemachine obj2 = Coffeemachine.getInstance();
        Coffeemachine obj3 = Coffeemachine.getInstance();

        System.out.println(obj1+" "+obj2+" "+obj3);
        if(obj1==obj2 && obj1==obj3)
            System.out.println("Same");
    }
}
