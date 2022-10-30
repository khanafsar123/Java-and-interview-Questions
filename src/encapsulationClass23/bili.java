package encapsulationClass23;

public class bili {
   private String name;
   private String breed;
   private int age;
   private double weight;

    public bili(String name, String breed, int age, double weight) {
   setName(name);
   setBreed(breed);
   setAge(age);
   setWeight(weight);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name can't be empty");
        } else
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (name.isEmpty()) {
            System.out.println("breed can't be empty");
        } else
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("it can't be 0");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
