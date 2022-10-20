package class17;

public class Horse {
    String name;
    String breed;
    int age;
    double weight;

    public Horse(String name, String breed, int age, double weight) {
        //name=name;  if we use same name we use this key word
        // by this java knows we are accsing the instance variables not the local variables as we will be givig values to in object initilization
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;

        // if I want to call the element of above constrctor in new construcotr use
        // this(name, breed etc); instead of writing all this.name=name and so on.
    }

    void printInfo(){
        // java was not confused because we didn't assign local varialbe we are only printing the instance values
        // use this key word when there is confusion
        System.out.println("name "+name+ " breed "+ breed+ " age "+age+ " weight "+weight );

    }

    public static void main(String[] args) {
        Horse horseObj=new Horse("fast", "stallion", 20, 200);
        horseObj.printInfo();
    }
}
