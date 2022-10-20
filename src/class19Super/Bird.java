package class19Super;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
    // samaghny ky liye hm ny har class may constructor banay thy ab hm  idher common bana lain gy phir super sy use karian gy

    Bird (String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }

    void printInfo(){
        System.out.println("Name "+name+ " Color "+color+ " Age "+age+ " weight "+weight);
    }

}

class Parrot extends Bird{
 /*   Parrot(String name, String color, int age, double weight){
        // ham is ko bird class may bi initilize kr sakty hain
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;}*/
 // agr hamy koi or element add karna hy to variable declare karo or os ko use kr lo
    boolean isCleever;
 Parrot (String name, String color, int age, double weight, boolean isCleever){


     super(name, color, age, weight);
     // new element ko initilize karain gy
     this.isCleever=isCleever;
 }

}

class Crow extends Bird {
    // agr hm kisi cheez ko bar bar repeat kr rahay hain to "Super ko use karian gy"
    // pichla this hm is liye use nhe kr sakty hain kyun ky hm "This" ko same class may sirf use kr sakty hian
    // ab hm different class may hain
    // agr same class sy inherat kr rahy hain to 1 common constructor create karin or os ko use karain super class sy
   /* Crow(String name, String color, int age, double weight){
        this.color=color;
        this.age=age;
        this.weight=weight;}*/
    Crow(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
}
class Test{
    // idher hm check kr rahy hain
    public static void main(String[] args) {
        Parrot parrot = new Parrot("A", "Green", 2, 1, true);
        parrot.printInfo();
    }}