package MethodOverLoading;


public class Tak03 {
    static void display(){
        System.out.println("nothing to display");

    }
    static void display(int num){
        System.out.println(num);

    }
    static void display(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {
        //new Tak03().display();// its just to display not storing the values
        Tak03 obj=new Tak03();
        obj.display();

        Tak03 obj1=new Tak03();
        obj.display("khan");

        Tak03 obj2=new Tak03();
        obj.display(123);

    }
}
