package clsActvtyOct050607;

public class Oct06TaskTeacher {
    String name, lastname;
    int experiecne;
    String subjectExperties;
    double salary;
    static String school;

    // constructor basically initilize/create object
    /*          constructor rules
            1. constructor name is same as className
            2. no return type
          constructors syntax
               Oct06TaskTeacher () {
              }

            when no constructors > compiler creates default constructors
     */
// when we will be calling below constructors two variable will be called
    Oct06TaskTeacher (String fName, String lName) {
            name=fName; // fname is locala variable and the name value is assiged to fname first
            lastname=lName;
            }

            // below code is used to print the constructors we can have multiple
            void print(){
                System.out.println(name + " "+ lastname);
            }





}
