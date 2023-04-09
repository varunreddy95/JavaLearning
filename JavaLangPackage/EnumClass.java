package JavaLangPackage;

enum Dept {
    CS("John", "Block A"), IT("Smith", "Block B"), CIVIL("Srinivas", "Block C"), ECE("Dave", "Block D");
    
    String head;
    String location;

    private Dept(String head, String location){    //Constructor in enum should be private or default
        this.head = head;
        this.location = location;
    }

    public String getHeadName(){
        return head;
    }

    public String getLocation(){
        return location;
    } 
}

public class EnumClass {
    public static void main(String[] args) {

        Dept d = Dept.CS;
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());

        // switch(d){

        //     case CS: System.out.println("CS Department");
        //              break;
            
        //     case IT: System.out.println("IT Department");
        //              break;

        //     case CIVIL: System.out.println("CIVIL Department");
        //                 break;

        //     case ECE: System.out.println("ECE Department");
        //               break;
        // }
    }    
}
