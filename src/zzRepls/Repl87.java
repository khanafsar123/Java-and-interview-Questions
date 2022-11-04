package zzRepls;

public class Repl87 {
    /*
    Create a class named 'Main' with specific attributes.

Create two objects of that class in which you will be assigning the following values and then print them.

carColor='Black'

carYear=2019

carMake='BMW'

carColor='White'

carYear=2018

carMake='Toyota'

**Expected Output:**

```
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
```
     */
    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args){

        Repl87 car = new Repl87();
        car.carColor= "Black";
        car.carYear=2019;
        car.carMake="BMW";

        Repl87 car1 = new Repl87();
        car1.carColor= "White";
        car1.carYear=2018;
        car1.carMake="Toyota";

        System.out.println("Car color is "+car.carColor + " and car year is " +car.carYear + " and car model is " +car.carMake);
        System.out.println("Car color is "+car1.carColor + " and car year is " +car1.carYear + " and car model is " +car1.carMake);


    }
}
