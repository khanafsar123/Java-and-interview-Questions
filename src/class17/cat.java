package class17;

public class cat {
    private String name;
    // if we make is private fields will not be accessable in next class
    // for that we will create a constructor
    private String breed;
    int age;
    double weight;

    public cat(String catName1, String catBreed1) {
        name=catName1;
        breed=catBreed1;
    }
    public void printInfo2(){
        System.out.println("Name "+name+ "Breed "+breed);
    }
    public cat(String catName, String catBreed, int catAge, double catWeight) {
            name=catName;
            breed=catBreed;
            age=catAge;
            weight=catWeight;
    }
    public void printInfo(){
        System.out.println("Name "+name+ "Breed "+breed+
                "age "+ "Weight " +weight);
        // if we want to print few or desired attributes we have to create new
        // constructor and new method


}}

