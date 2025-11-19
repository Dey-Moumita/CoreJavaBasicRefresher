package edu.logic.solutions;

interface Member{
    void callback();
}
class Customer implements Member{
    String name;
    Customer(String n){
        this.name=n;
    }
    public void callback(){
        System.out.println("Ok, I will visit,"+name);
    }

}
class Store{
    Member members[] = new Member[10];
    int count = 0;
    public void register(Member m){
        members[count++]=m;
    }
    public void inviteSale() {
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Smith");

        store.register(customer1);
        store.register(customer2);

        store.inviteSale();
    }
}

