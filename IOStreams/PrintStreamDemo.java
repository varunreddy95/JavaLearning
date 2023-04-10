package IOStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student {
    int rollNo;
    String name;
    String dept;

    public Student(int roll_number, String n, String d) {
        rollNo = roll_number;
        name = n;
        dept = d;
    }
}

class MyWrite {
    FileOutputStream fos;
    PrintStream ps;
    Student stu;

    public MyWrite(Student st, FileOutputStream fo, PrintStream p) {
        stu = st;
        fos = fo;
        ps = p;
    }

    public void writeToFile() {
        try{
            //FileOutputStream fos = new FileOutputStream(filePath);
            //PrintStream ps = new PrintStream(fos);

            ps.println(stu.rollNo);
            ps.println(stu.name);
            ps.println(stu.dept);

            ps.close();
            fos.close();

        } catch(IOException e) {System.out.println(e);}
    }
}

class MyRead {
    Student stu;
    FileInputStream fis;
    BufferedReader bs;

    public MyRead(Student s, FileInputStream f, BufferedReader b) {
        stu = s;
        fis = f;
        bs = b;
    }

    public void readFromFile() {
        try{
            //FileInputStream fis = new FileInputStream(filePath);
            //BufferedReader bs = new BufferedReader(new InputStreamReader(fis));

            stu.rollNo = Integer.parseInt(bs.readLine());
            stu.name = bs.readLine();
            stu.dept = bs.readLine();

            System.out.println(stu.rollNo + "   " + stu.name + "    " + stu.dept);
        } catch(IOException e) {System.out.println(e);}
    }
}

public class PrintStreamDemo {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\varun\\Desktop\\JavaLearning\\Student1.txt";

        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            PrintStream ps = new PrintStream(fos);
            FileInputStream fis = new FileInputStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            Student s = new Student(10, "John", "CSE");
        
            MyWrite mw = new MyWrite(s, fos, ps);
            mw.writeToFile();
    
            MyRead mr = new MyRead(s, fis, br);
            mr.readFromFile();
        } catch(IOException e) {System.out.println(e);}
    }
}
