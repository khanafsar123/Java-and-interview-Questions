package Class18Inherratance;

public class Computer {
    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */
    static String brand;
    static String processor;
    static double price;
    static int screenSize;

    Computer(String brand,String processor, double price,  int screenSize) {
        this.brand=brand;
        this.processor=processor;
        this.price=price;
        this.screenSize=screenSize;
    }



    public static void printF(){
        System.out.println("I need "+brand+ " with processor "+processor+" and the price should be "+price+ " and recommended screen size "+screenSize);
    }
}
class purchase extends Computer{
    purchase(String brand,String processor, double price,  int screenSize){
        super(brand, processor, price, screenSize);
    }

    public static void main(String[] args) {
        purchase dell=new purchase("Dell", "Corei7",1500, 15);
        dell.printF();
    }
}

