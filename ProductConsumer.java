class Product {
    private String itemNo;
    private String name;
    private double price;
    private int quantity;


    //property methods
    //Getter methods
    public String getItemNo() {
        return itemNo;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    } 

    //Setter Methods
    public double setPrice(double product_price) {
        if(product_price >= 0) {
            return price = product_price;
        }
        else {
            return price = 0;
        }
    }
    public int setQuantity(int product_quantity) {
        if(product_quantity >= 0) {
            return quantity = product_quantity;
        }
        else {
            return quantity = 0;
        }
    }

    public String toString() {
        System.out.println("Product details: ");
        return itemNo + "\n" + name + "\n" + price + "\n" + quantity;
    }

    //Constructor
    public Product(String item_number, String product_name) {
        itemNo = item_number; 
        name = product_name;
    }

}



class Consumer {
    private String custId;
    private String name;
    private String address;
    private String phNo;

    //Property Methods
    //Setter methods
    public void setAddress(String addr) {
        address = addr;
    }
    public void setPhno(String phone_number) {
        phNo = phone_number;
    }

    //Getter methods
    public String getCustId() {
        return custId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhno() {
        return phNo;
    }

    public String toString() {
        System.out.println("Customer Details:");
        return custId + "\n" + name + "\n" + address + "\n" + phNo + "\n";
    }

    //Constructor
    public Consumer(String customer_id, String customer_name) {
        custId = customer_id;
        name = customer_name;
    }
}

public class ProductConsumer {
    public static void main(String[] args) {
        Product p1 = new Product("1", "Pepsi Can");
        p1.setPrice(20);
        p1.setQuantity(10);

        System.out.println(p1);
        System.out.println("*********************************");
        Consumer c1 = new Consumer("1", "Varun Reddy");
        c1.setAddress("Earth");
        c1.setPhno("+1938938478");

        System.out.println(c1);
    }
}
