package MethodOverriding;


class Car {
    public void start(){
        System.out.println("Car start!");
    }
    public void changegear(){
        System.out.println("Car gear change");
    }
}

class LuxuryCar extends Car {
    @Override
    public void start(){
        System.out.println("Luxury Car start!");
    }

    @Override
    public void changegear(){
        System.out.println("Automatic Gear Change!");
    }

    public void sunroof(){
        System.out.println("Open sunroof!");
    }
}


public class CarOverriding {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.changegear();

        System.out.println("");

        LuxuryCar lc = new LuxuryCar();
        lc.start();
        lc.changegear();
        lc.sunroof();

        System.out.println("");
        
        Car c1 = new LuxuryCar(); //Dynamic Method Dispatch
        c1.start();
        c1.changegear();
    }
}
