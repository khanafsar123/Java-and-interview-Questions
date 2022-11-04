package zzRepls;

public class Repl88 {
    /*
    In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().

Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
```
     */

    String breed;
    String name;
    String color;

    public void bark(){
        System.out.println(name+" can bark");
    }
    // creating one method to save time

    public static void main(String[] args) {
        Repl88 bullDog=new Repl88();

        bullDog.name="Bull Dog";
       // calling the bark method
        bullDog.bark();
    }




}
