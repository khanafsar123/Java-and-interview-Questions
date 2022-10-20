package MethodOverLoading;

public class HWTask02 {
    public static void main(String[] args) {
    Programming obj=new Programming();
    Programming obj1=new Programming("Java");

    }
}
class Programming{
    Programming (){
        System.out.println("I love programming languages");
    }
    Programming (String str){
        System.out.println("I love "+str);
    }
}
