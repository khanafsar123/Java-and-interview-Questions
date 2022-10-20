package class19Super;

public class Furniture {
    String color="green";
}
class Chair extends Furniture{
    String color="red";
    void printColor(){
        String color="Black";
        System.out.println(color);// agr hamy red karna hy to this.color agr hamy green print karna hy to super.color
        // java prefer local variable to print
        System.out.println(this.color);
        System.out.println(super.color);

    }}
    class TestChair{
        public static void main(String[] args) {
            Chair chair=new Chair();
            chair.printColor();
        }
    }

