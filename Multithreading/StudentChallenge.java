package Multithreading;

class LearningPlatform {
    
    String text;
    int numOfStudents = 0;
    int flag = 0;

    synchronized public void attendence() {
        numOfStudents++;
    }


    synchronized public void write(String t) {
        System.out.println("Teacher is Writing " + t);
        while(flag != 0){
            try{
                wait();
            } catch(Exception e) {}
        }
        text = t;
        flag=numOfStudents;
        notifyAll();
    }

    synchronized public String read() {

        while(flag == 0){
            try{
                wait();
            }catch(Exception e){}
        }
        String x = text;
        flag--;
        if(flag==0){
            notify();
        }
        return x;
    }
}

class Teacher extends Thread {

    LearningPlatform platform;
    String[] notes;

    public Teacher(String[] n, LearningPlatform p) {
        platform = p;
        notes = n;
    }

    @Override
    public void run(){
        for(int i=0; i<notes.length; i++){
            platform.write(notes[i]);
        }
    }
}

class Student extends Thread{

    LearningPlatform pf;
    String name;

    public Student(String n, LearningPlatform p){
        name = n;
        pf = p;
        pf.attendence();
    }

    @Override
    public void run(){
        String text;
        
        do{
            text = pf.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}




public class StudentChallenge {
    public static void main(String[] args) {
        
        LearningPlatform p = new LearningPlatform();
        
        String[] notes = {"Java is a language", "It is OOPS", "It supports Multithreading", "end"};
        Teacher t = new Teacher(notes, p);
        Student s1 = new Student("Varun", p);
        Student s2 = new Student("Reddy", p);

        t.start();
        s1.start();
        s2.start();
    }
}
