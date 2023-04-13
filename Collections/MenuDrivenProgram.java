package Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


class Account implements Serializable
{
    String accNo;
    String name;
    double balance;

    Account(){}  //There has to be a non parameterized constructor for serilization

    Account(String n, double b){
        name = n;
        balance = b;

        Random rand = new Random();
        int upperbound = 999999999;
        int accnt = rand.nextInt(upperbound);

        accNo = Integer.toString(accnt);
    }


    public String toString(){
        return "Account No: " + accNo + "\n" +
               "Name      : " + name  + "\n" +
               "Balance   : " + balance + "\n";
    }



}

public class MenuDrivenProgram {
    public static void main(String[] args) {

        Account acc = null;
        HashMap<String, Account> hm = new HashMap<>();

        try{
            FileInputStream fis = new FileInputStream("Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for(int i=0; i<count; i++){
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNo, acc);
            }
            fis.close();
            ois.close();
        } catch(Exception e) {System.out.println(e);}

        try(Scanner sc = new Scanner(System.in)){
            FileOutputStream fos = new FileOutputStream("Accounts.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            System.out.println("Menu");

            int choice;
            String account_no, name;
            double balance;

            do{
                System.out.println("1. Create Account");
                System.out.println("2. Delete Account");
                System.out.println("3. View Account");
                System.out.println("4. View All Accounts");
                System.out.println("5. Save Accounts");
                System.out.println("6. Exit");
                System.out.println("\n\nEnter your choice: ");
                choice = sc.nextInt();

                //sc.skip("(\r\n[\n\r\u2028\u2029\u0085])?");

                switch(choice)
                {
                    case 1: System.out.println("Enter Name and balance: ");
                            name = sc.next();
                            balance = sc.nextDouble();
                            acc = new Account(name, balance);
                            account_no = acc.accNo;
                            hm.put(account_no, acc);
                            System.out.println("Account Created for " + name);
                            break;

                    case 2: System.out.print("Enter Account No: ");
                            account_no = sc.nextLine();
                            hm.remove(account_no);
                            break;

                    case 3: System.out.print("Enter Account No: ");
                            account_no = sc.next();
                            acc = hm.get(account_no);
                            System.out.println(acc);
                            break;

                    case 4: for(Account a: hm.values()){
                                System.out.println(a);
                            }
                            break;
                    
                    case 5: // We have to save the accounts before exiting too, so same logic for 5 and 6
                    case 6: oos.writeInt(hm.size());
                            for(Account a: hm.values()){
                                oos.writeObject(a);
                            }
                }

            } while(choice!=6);
            oos.flush();
            oos.close();
            fos.close();
        } catch(Exception e) {System.out.println(e);}
    }
}
