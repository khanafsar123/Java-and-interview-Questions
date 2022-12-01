package Class18Inherratance;

public class Car {
    // common class have many names like parent, super or base class
    String model;
    String make;
    int year;
    double engine;
    int topSpeed;
    double price;
    // if a field or method has private access modifier in parent class child classes cannot use it
    private String engineType;

    void printCarDetails(){
        System.out.println("Model "+ model+ " Make " +make+ " color "+year);
    }

}
// child classes are also called derived classas
// new class BMW





// Creating new class down
// use class and name do not use public because parent can have public

// if we do like below to much codiing so use inheratance instead which I did above
//class Tesla{
//    String model;
//    String make;
//    int year;
//    double engine;
//    int topSpeed;
//    double price;

//}
//
//// third class Toyota
//class Toyota{
//    String model;
//    String make;
//    int year;
//    double engine;
//    int topSpeed;
//    double price;
//}
//class Honda{
//    String model;
//    String make;
//    int year;
//    double engine;
//    int topSpeed;
//    double price;
//
//}

