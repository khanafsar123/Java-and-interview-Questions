package class19Super;

public class Dog extends Animal{


    public Dog(String name, String breed, String color){
       super(name, breed, color);

    }
    public void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+ " color "+color);
    }
}

class Cat extends Animal{
Cat (String name, String breed, String color){
super(name, breed, color);

        }}
class TestAnimal{
    public static void main(String[] args) {


    Dog dog=new Dog("jacky", "German" , "Green");
    dog.printInfo1();

}}