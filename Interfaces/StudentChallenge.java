package Interfaces;

interface Member {
    void callBack();
}

class Store {

    Member mem[] = new Member[100];
    int count=0;

    void register(Member m) {
        mem[count++] = m;
    }

    void inviteSale() {
        for(int i=0; i<count; i++) {
            mem[i].callBack();
        }
    }
}

class Customer implements Member {

    String name;

    Customer(String name) {
        this.name = name;
    }

    public void callBack() {
        System.out.println(this.name + " will attend the sale!");
    }
}




public class StudentChallenge {
    public static void main(String[] args) {

        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");

        //Registering Customers
        s.register(c1);
        s.register(c2);

        //Inviting for sale
        s.inviteSale();
    }
}
