package HWOct04and05;

public class Oct5Constructr2 {
    public static void main(String[] args) {


    Oct5Constructors2 student1 = new Oct5Constructors2("john", 75, 85, 95);
    Oct5Constructors2 student2 = new Oct5Constructors2("khan", 55, 50, 60);
    Oct5Constructors2 student3 = new Oct5Constructors2("smith", 95, 85, 95);
    Oct5Constructors2 student4 = new Oct5Constructors2("Ashley", 5, 55, 75);
    Oct5Constructors2 student5 = new Oct5Constructors2("paul", 75, 90, 65);
        System.out.println("John " +student1.averageGrade());
        System.out.println("khan " +student2.averageGrade());
        System.out.println("smith " +student3.averageGrade());
        System.out.println("Ashley " +student4.averageGrade());
        System.out.println("Paul " +student5.averageGrade());
} }