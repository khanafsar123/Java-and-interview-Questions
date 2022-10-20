package HWOct04and05;

public class Oct5solved2 {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.

     */
    String name;
    double math;
    double science;
    double computer;

    Oct5solved2 (String sName, double nMath, double nScience, double nComputer){
        name=sName;
        math=nMath;
        science=nScience;
        computer=nComputer;

    }
    // now to calculate average we need method

    void average(){
        System.out.println("Name "+name+ " "+ (math+science+computer)/3);

    }

    public static void main(String[] args) {
        Oct5solved2 obj=new Oct5solved2("Sab", 99,28,23);
        obj.average();
    }

}
