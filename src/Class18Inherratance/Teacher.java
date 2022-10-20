package Class18Inherratance;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher,
    ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */
    String name;
    String qualification;
    int experience;
    Teacher(String name, String qualification, int age){
        this.name=name;
        this.experience =age;
        this.qualification=qualification;
    }
    public void print(){
        System.out.println("My name is "+name+ " and my qualificatin is "+qualification+" and I have "+ experience+" years of experience.");
    }
}
class MathTeacher extends Teacher{
    MathTeacher(String name, String qualification, int age){
        super(name, qualification, age);
    }

}
class ChemistryTeacher extends Teacher{
    ChemistryTeacher(String name, String qualification, int age){
        super(name, qualification, age);

}}
class PianoTeacher extends Teacher{
        PianoTeacher(String name, String qualification, int age){
            super(name, qualification, age);
}

}
class Test{
    public static void main(String[] args) {
        PianoTeacher tec=new PianoTeacher("John", "Bsc",10);
            tec.print();

        MathTeacher tec1=new MathTeacher("Smith", "MSc", 8);
            tec1.print();

        ChemistryTeacher tec3=new ChemistryTeacher("Josh", "Phd",3);
            tec3.print();

    }
}


