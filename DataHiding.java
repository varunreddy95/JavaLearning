class BankAccount {
    private String accountNo;
    private String name;
    private double balance = 0;

    //Getter methods for class variables
    public String getAccountNo() {
        return accountNo;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    //Setter methods for class variables
    public void setAccoutno(String account_number) {
        accountNo = account_number;
    }
    public void setName(String name_of_account_holder) {
        name = name_of_account_holder;
    }
    
    //Deposit and Withdraw methods alter the balance, intitialzed to zero for a new account
    public void deposit(double deposit_amount) {
        if(deposit_amount > 0) {
            balance = balance + deposit_amount;
        }
        else{
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double withdrawl_amount) {
        if(balance >= withdrawl_amount) {
            balance = balance - withdrawl_amount;
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class DataHiding {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.setAccoutno("987348348938748937");
        b1.setName("Varun Reddy");
        b1.deposit(498509485);
        
        System.out.println("********Account Details***********");
        System.out.println("Account Number: " + b1.getAccountNo());
        System.out.println("Account holder name: " + b1.getName());
        System.out.printf("Account Balance: %f\n", b1.getBalance());

        System.out.println("**********Withdrawl**************");

        b1.withdraw(10834400);

        System.out.println("********Account Details***********");
        System.out.println("Account Number: " + b1.getAccountNo());
        System.out.println("Account holder name: " + b1.getName());
        System.out.printf("Account Balance: %f\n", b1.getBalance());


    }
}
