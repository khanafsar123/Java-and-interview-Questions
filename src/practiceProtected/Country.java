package practiceProtected;

public class Country {
    public String name;
    protected String capital;
    int Population;
    private String president;

    public static String bigCity;


    public Country(String name, String capital){
        this.name=name;
        this.capital=capital;
    }


    public  Country(String name) {
        this.name=name;

    }
    public void display(){
        System.out.println("I am super");
    }
}
class Pakistan extends Country{

    // in child class we add more features
    boolean isSafe; // is not available to parent class

    Pakistan(String name, String capital) {
        super(name, capital);
    }


    public static void main(String[] args) {
        Pakistan pakistan=new Pakistan("Pakistan", "Islamapad");

        pakistan.isSafe=true;

        // President is not available because its private



    }    }
