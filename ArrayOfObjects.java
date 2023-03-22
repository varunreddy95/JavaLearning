class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    //Property Methods
    //Setter methods
    public void setMarksObtained(int marks_obtained) {
        marksObtained = marks_obtained;
    }

    //Getter methods
    public String getSubId() {
        return subID;
    }
    public String getName() {
        return name;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public int getMarksObtained() {
        return marksObtained;
    }
    public boolean isQualified() {
        return marksObtained >= maxMarks/10 * 4;
    }
    public String toString() {
        return "Subject Id: " + subID + "\n" + "Subject Name: " + name + "\n" +
               "Max Marks: " + maxMarks + "\n" + "Marks Obtained: " + marksObtained + "\n";
    }

    //Constructor
    public Subject(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

}


class Student {
    private String rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    //Setter Methods
    public void setSubjects(Subject... subs){
        subjects = subs;
    }
    public void setDept(String dept){
        this.dept = dept; 
    }

    //Getter methods
    public String getRollno(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public Subject[] getSubjects(){
        return subjects;
    }
    public String toString(){
        return "Roll No: " + rollNo + "\n" + "Student Name: " + name + "\n" +
               "Department: " + dept + "\n";
    }

    //Constructor
    public Student(String rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}




public class ArrayOfObjects {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algoriothms", 100);
        subs[2] = new Subject("s103", "Operating Systems", 100);

        subs[0].setMarksObtained(84);
        subs[1].setMarksObtained(72);
        subs[2].setMarksObtained(95);


        Student s = new Student("174837", "Varun Reddy");
        s.setDept("Computer Science");
        s.setSubjects(subs);
        
        //Printing out student details
        System.out.println(s);

        //Printing out all the subjects selected by the student
        for (Subject x: s.getSubjects()) {
            System.out.println(x);
        }
    }
}
