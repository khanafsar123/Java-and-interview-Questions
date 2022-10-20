package Class18Inherratance;

public class A {
    /*
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
     */
    String brand;
    String processor;
    double price;
    int screenSize;

    A(String brand,String processor, double price,  int screenSize) {
        this.brand=brand;
        this.processor=processor;
        this.price=price;
        this.screenSize=screenSize;
    }
    void display(){
        System.out.println("I need "+brand+ " with processor "+processor+" and the price should be "+price+ " and recommended screen size "+screenSize);
    }
}

class B extends A{
    B(String brand,String processor, double price,  int screenSize){
        super(brand, processor, price, screenSize);
    }

}
class C extends B{
    C(String brand,String processor, double price,  int screenSize) {
        super(brand, processor, price, screenSize);
    }

}
