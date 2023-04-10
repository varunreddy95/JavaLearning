package IOStreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable {
    String cusID;
    String name;
    String phno;

    static int count = 1;

    Customer(){}

    public Customer(String n, String ph){
        cusID = "C" + count;
        name = n;
        phno = ph;
    }

    public String toString(){
        return "\nCustomer Details\n" +
               "\nCustomer Id " + cusID +
               "\nCustomer Name " + name + 
               "\nPhone Number " + phno + "\n";
    }
}

public class StudentChallenge {
    public static void main(String[] args) {

        try{
            Scanner sc = new  Scanner(System.in);

            FileInputStream fis = new FileInputStream("Customer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int length = ois.readInt();
            Customer list[] = new Customer[length];

            for(int i=0; i<length; i++) {
                list[i] = (Customer) ois.readObject();
            }

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            for(int i=0; i<length; i++) {
                if(name.equalsIgnoreCase(list[i].name)){
                    System.out.println(list[i]);
                }
            }

            fis.close();
            ois.close();
            sc.close();
        } catch(Exception e) {System.out.println(e);}

    }
}
