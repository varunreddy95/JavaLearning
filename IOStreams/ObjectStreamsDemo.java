package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class MyStudent implements Serializable {
    private int rollNo;
    private String name;
    private String dept;
    public static int data=10;
    public transient int t;        //Transient fields will be part of serialization

    public MyStudent(){}         //Serializable classes should have a default constructor without parameters

    public MyStudent(int r, String n, String d) {
        rollNo = r;
        name = n;
        dept = d;
        data = 500;
        t = 500;
    }

    public String toString(){
        return "\nStudent Details\n" +
               "\nRoll " + rollNo +
               "\nName " + name + 
               "\nDepartment " + dept +
               "\nData " + data +
               "\nTransient " + t + "\n";
    }
}




class WriteFile {
    FileOutputStream fo;
    ObjectOutputStream os;
    MyStudent stu;

    public WriteFile(MyStudent s, FileOutputStream fos, ObjectOutputStream oos) {
        fo = fos;
        os = oos;
        stu = s;
    }

    public void writeObjectToFile(){
        try{
            os.writeObject(stu);
            os.close();
            fo.close();
        } catch(IOException e) {System.out.println(e);}
    }
}





class ReadFile {
    FileInputStream fi;
    ObjectInputStream os;
    MyStudent stu;

    public ReadFile(MyStudent s, FileInputStream fis, ObjectInputStream ois) {
        fi = fis;
        os = ois;
        stu = s;
    }

    public MyStudent readObjectFromFile() {
        try{
            MyStudent stu = (MyStudent) os.readObject();
            System.out.println(stu);
            fi.close();
            os.close();
        } catch(Exception e) {System.out.println(e);}

        return stu;
    }
}






public class ObjectStreamsDemo {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\varun\\Desktop\\JavaLearning\\Student2.txt";

        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyStudent s = new MyStudent(10, "John", "CSE");

        
            WriteFile wf = new WriteFile(s, fos, oos);
            wf.writeObjectToFile();

            ReadFile rf = new ReadFile(s, fis, ois);
            rf.readObjectFromFile();


        } catch(IOException e) {System.out.println(e);}
    }
}
