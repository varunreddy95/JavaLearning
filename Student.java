class Student1 {
    public int rollno;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total() {
        return m1 + m2 + m3;
    }
    public double average() {
        return total()/3;
    }
    public char grade() {
        if(average() >= 60) {
            return 'A';
        }
        else {
            return 'B';
        }
    }
    public String toString() {
        return "Roll No: " + rollno + "\n" +
               "Name: " + name + "\n" +
               "Course: " + course + "\n";
    }
}
public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

        s1.rollno = 82378;
        s1.name = "Varun Reddy";
        s1.course = "M.Sc. Computer Science";
        s1.m1 = 100;
        s1.m2 = 78;
        s1.m3 = 54;

        //System.out.println("Roll No: " + s1.rollno);
        //System.out.print("Name: " + s1.name);
        //System.out.println("Course: " + s1.course);
        System.out.print("*************Details**************\n" + s1);
        System.out.println("Total Marks: " + s1.total());
        System.out.printf("Average: %.3f\n", s1.average());
        System.out.println("Grade: " + s1.grade());
    }    
}
