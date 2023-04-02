package StaticAndFinal;

class Car
{
    static long ex_showrrom_price = 1000000L;
    double accessories_price = 50000;

    static long onRoadPrice(String city)
    {
        long on_road_price = 0;
        switch(city)
        {
            case "Delhi" : 
                on_road_price = (long) (ex_showrrom_price * 1.09) ;
                break;

            case "Hyderabad" : 
                on_road_price = (long) (ex_showrrom_price * 1.05) ;
                break;

            case "Mumbai" :
                on_road_price = (long) (ex_showrrom_price * 1.12) ;
                break;
        }
        return on_road_price;
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        Car c1 = new Car();
        
        System.out.println("Ex-showroom price of the car: " + Car.ex_showrrom_price);
        System.out.println("On-road price of your car in Hyderabad: " + c1.onRoadPrice("Hyderabad"));
    }
}