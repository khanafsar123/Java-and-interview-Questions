package class19Super;

public class Animal {
    String name;
    String breed;
    String color;

    Animal(String name, String breed, String color){
        this.name=name;
        this.breed=breed;
        this.color=color;

    }
    public void printInfo1(){
        System.out.println("Name "+name+" Breed "+breed+ " color "+color);
    }
}

