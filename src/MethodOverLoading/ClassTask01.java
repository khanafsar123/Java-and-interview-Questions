package MethodOverLoading;

public class ClassTask01 {
    void F1(String name, int number){
        System.out.println("string name, int number");
    }
    // by changing the parameter
    void F1(String name, int number, int number2){
        System.out.println("string name, int number, int number2");
    }
    // by changeing the data type
    void F1(int num1, int number){
        System.out.println("int num1, int number");
    }
    void F1(int number, String name){
        System.out.println("int number, String name");
    }

    public static void main(String[] args) {
        ClassTask01 obj=new ClassTask01();
        obj.F1("taras", 20);
    }

}
class taks01redone extends ClassTask01{
    void F1(String name, int number){
        System.out.println("string name, int number");

}}
