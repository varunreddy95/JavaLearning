package Interfaces;

class Phone {
    
    public void call(){
        System.out.println("Phone call from Phone class");
    }
    
    public void sms(){
        System.out.println("Sms call from Phone class");
    }
}

interface ICamera {

    void record();
    void click();
}

interface IMusicPlayer{

    void play();
    void pause();
    void stop();
}

class Smartphone extends Phone implements ICamera, IMusicPlayer {

    public void record() {
        System.out.println("Record method from interface ICamera");
    }
    public void click() {
        System.out.println("Click method from interface ICamera");
    }
    public void play() {
        System.out.println("Play method from Interface IMusicPlayer");
    }
    public void pause() {
        System.out.println("Pause method from Interface IMusicPlayer");
    }
    public void stop() {
        System.out.println("Stop method from Interface IMusicPlayer");
    }
}


public class InterfaceExample {
    public static void main(String[] args){

        Smartphone s = new Smartphone();
        Phone p = s;
        ICamera c = s;
        IMusicPlayer m = s;

        System.out.println("************** Smartphone Method calls ***********************");
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
        System.out.println("");

        System.out.println("************** Phone Method calls ***********************");
        p.call();
        p.sms();
        System.out.println("");

        System.out.println("************** Camera Method calls ***********************");
        c.click();
        c.record();
        System.out.println("");

        System.out.println("************** MusicPlayer Method calls ***********************");
        m.play();
        m.pause();
        m.stop();
        System.out.println("");
    }
}
