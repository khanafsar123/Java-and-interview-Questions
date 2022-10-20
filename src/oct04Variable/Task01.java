package oct04Variable;

public class Task01 {
    public static Object numberOfStudents;
    /*
        Create a class called SyntaxEmployee
        create three variables empID, Salary and set the CEO to "Sumair"
         */
    String empId;
    double salary;
    static String CEO="Sumair"; // sumair is declared because of one ceo, so it will use less memory
 /*
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
    */
 public static void main(String[] args) {
     Task01 asgharemployee = new Task01();
     asgharemployee.empId="123";
     asgharemployee.salary=100000;

     Task01 khanEmployee = new Task01();
     khanEmployee.empId="123";
     khanEmployee.salary=100000;                                               
 }


}
