package Class18Inherratance;

public class Shape {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}

class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void area(){
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println(area);
    }}
class Test01{
    public static void main(String[] args) {
     Circle obj=new Circle(12.2);
             obj.area();


    }}