package ReviewClasses;

public class ConstructorAccessModi {
    protected String name;
    String shape;
    private String color;

    public static boolean fresh;

    public ConstructorAccessModi(String name) {
        this.name=name;
    }
    ConstructorAccessModi (String name, String shape, String color) {
        this(name); // we just need to import because already initilized
        this.shape=shape;
        this.color=color;
    }
    //method

    public void grow() {
        System.out.println("All fruits grow fresh"+fresh);
    }
    // method 2
    protected void haveBenefits(){
        System.out.println("All fruits good for your health");
    }

}
 class Apple extends ConstructorAccessModi{

    // new class have its own variable and we need to initilize
     String size;
     String taste;
     double price;

    Apple(String name, String shape, String color, String size) {
                     // calling parent
        super(name,shape, color);
        this.size=size;
                     // super(name) we cannot call first constructor because we cannot have tw0 super inside the constructor
    }


    Apple(String name, String shape, String color, String size, String taste, double price) {
            super(name, shape, color); //  this(name, shape, color, size); agr size use karna hy to super ki jagga this ho ga
                                    // pichly constructor ky through hm parent ko acces karian gy agr hm this use karain gy
            this.taste=taste;
            this.price=price;
    }

                      // we can modify the methods of parent class
    void makeJuice() {
        System.out.println("from "+name+ " we can make "+taste+" juice");
    }




     public static void main(String[] args) {
         // we can only inilitize the private but can not access it will give error
         // obj.color;  not visible since it is private
         Apple obj=new Apple("apple", "circle", "red", "medium", "nice", 19.99);
         System.out.println(obj.name);
         //System.out.println(obj,color); color is not available because its private we can only initilize

         obj.makeJuice();



     }
 }