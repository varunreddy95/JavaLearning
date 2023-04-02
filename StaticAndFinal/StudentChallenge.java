package StaticAndFinal;


import java.util.*;


class Student
{
    private String rollNo;
    private static int count=1;

    private static String generateRollNo()
    {
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        String rn = "Univ" + "-" + year + "-" + count;
        count++;
        return rn;
    }

    public Student()
    {
        rollNo = generateRollNo();
    }

    public String getRollNo()
    {
        return rollNo;
    }
}

public class StudentChallenge {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        System.out.println("Student 1: " + s1.getRollNo());
        System.out.println("Student 2: " + s2.getRollNo());
        System.out.println("Student 3: " +  s3.getRollNo());
    }
}
