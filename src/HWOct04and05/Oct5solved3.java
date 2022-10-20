package HWOct04and05;

public class Oct5solved3 {
    private Oct5solved3(){
        System.out.println("Private");
    }
     Oct5solved3(String name){
        System.out.println("default");
    }
    protected Oct5solved3(int age){
        System.out.println("protected");
    }
    public Oct5solved3(boolean isTrue) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        // calling all methods inside class
        // calling everyconstructors even in different class just put argument of the same data type it will re call
        new Oct5solved3();
        new Oct5solved3("khan");
        new Oct5solved3(10);
        new Oct5solved3(true);
    }







}
