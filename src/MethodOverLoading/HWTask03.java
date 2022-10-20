package MethodOverLoading;

public class HWTask03 {
    private void display(){
        System.out.println("nothing to dislplay");

    }
    private void display(String name){
        System.out.println(name);


    }
    private void display(int num){
        System.out.println(num);

    }
    public static void main(String[] args) {
        HWTask03 obj=new HWTask03();
        obj.display();
        obj.display("khan");
        obj.display(123);
    }
}
class Test{
    // we can not access the private from different class
}
