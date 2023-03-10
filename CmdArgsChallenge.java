public class CmdArgsChallenge {
    // In this challenge we are going to add the numbers given as command line arguments
    double sum_of(String ...args){
        double s = 0;
        for (int i=0; i<args.length; i++) {
            if(args[i].matches("[0-9\\.]+"))
            s = s + Double.parseDouble(args[i]);
        }
        return s;
    }
    public static void main(String args[]){
        CmdArgsChallenge m = new CmdArgsChallenge();
        System.out.println("The sum of student marks: " + m.sum_of(args));
    }

}
