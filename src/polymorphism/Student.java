//package polymorphism;
//
//public class Student {
//    /*
//    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
//     */
//    void courses(){
//        System.out.println("Each student should take courses to complete degree");
//    }
//
//    void compulsary(){
//        System.out.println("compulsary courses");
//    }
//
//    void inPersonOnline(){
//        System.out.println("Study medium can be either online or inPerson");
//    }
//}
//class SyntaxStudent extends  Student{
//    void courses(){
//        System.out.println("Student should take 4 courses");
//    }
//
//    void compulsary(){
//        System.out.println("compulsary courses: All four courses are comopulsary");
//    }
//
//    void inPersonOnline(){
//        System.out.println("Means of course should be online only");
//    }
//
//
//}
//class CollegeStudent extends Student{
//
//    void courses(){
//        System.out.println("Student should take 5 courses");
//    }
//
//    void compulsary(){
//        System.out.println("compulsary courses: Biology, Chemistry, Physics");
//    }
//
//    void inPersonOnline(){
//        System.out.println("Study medium is hybrid: Online and inPerson");
//    }
//
//}
//class SchoolStudent extends Student {
//
//    void courses(){
//        System.out.println("Student should take 7 courses");
//    }
//
//    void compulsary(){
//        System.out.println("compulsary courses: General Science, Math, English");
//    }
//
//    void inPersonOnline(){
//        System.out.println("Means of course should be online or inPerson");
//    }
//
//}
//
//class Test{
//    public static void main(String[] args) {
//        Student [] student={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
//        for (Student test:student){
//            test.courses();
//            test.inPersonOnline();
//            test.compulsary();
//            System.out.println("=================");
//        }
//        System.out.println("Using for loop");
//        for (int i=0; i< student.length; i++){
//            student[i].courses();
//            student[i].compulsary();
//            student[i].inPersonOnline();
//        }
//    }
//}
