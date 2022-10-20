package HWOct04and05;

public class Oct5Constructors2 {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    String studentName;
    int math;
    int computer;
    int science;
   public Oct5Constructors2(String studentName, int math, int computer, int science) {
        this.studentName = studentName;
        this.math = math;
        this.computer = computer;
        this.science = science;


    }
    Oct5Constructors2 (){
    }
    double averageGrade() {
        return
       (computer+math+science)/3;
    }
    public static void main(String[] args) {

    }
}
