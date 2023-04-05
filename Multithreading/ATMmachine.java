package Multithreading;

class Machine {
    
    synchronized public void checkBalance(String name){
        System.out.println(name + ", here is your balance!");
        try{
            Thread.sleep(1000);
        } catch(Exception e){ }
    }

    synchronized public void withdraw(String name, double amount){
        System.out.println(name + ". here is the amount you withdrew: " + amount);
        try{
            Thread.sleep(1000);
        } catch(Exception e){ }
    }
}

class Customer extends Thread{

    Machine m;
    String name;
    double amount;

    Customer(String name, double amount, Machine m){
        this.name = name;
        this.amount = amount;
        this.m = m;
    }

    public void useATM(){
        m.checkBalance(this.name);
        m.withdraw(this.name, this.amount);
    }

    public void run(){
        useATM();
    }
}



public class ATMmachine {
    public static void main(String[] args) {

        Machine machine = new Machine();
        Customer c1 = new Customer("Varun", 5000, machine);
        Customer c2 = new Customer("Preethi", 10000, machine);

        c1.start();
        c2.start();
    }
}
