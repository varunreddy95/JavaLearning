package MethodOverriding;

class TV {
    public void switchOn()
    {
        System.out.println("Tv switch on!");
    }
    public void changeChannel()
    {
        System.out.println("TV channel change!");
    }
}

class SmartTV extends TV{
    @Override
    public void switchOn() 
    {
        System.out.println("Smart TV switch on!");
    }

    @Override
    public void changeChannel()
    {
        System.out.println("Smart TV change channel");
    }

    public void browse()
    {
        System.out.println("Smart TV browse");
    }
}

public class TVSmartTV {
    public static void main(String[] args) {
        TV t=new SmartTV();
        
        t.switchOn();
        t.changeChannel();
    }
}
