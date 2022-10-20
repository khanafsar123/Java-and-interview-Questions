package HWOct04and05;

public class Oct5Constructore {
    /*
   write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    private String brandName;
    private String brandType;
    private int model;
    private int memorySize;

    public Oct5Constructore() {

    }
    public Oct5Constructore (String brandName1, int model1, int memorysiz) {
        this.brandName=brandName1;
        this.model=  model1;
        this.memorySize=memorysiz;
    }
    void print(){
        System.out.println("barndName "+brandName + " model "+ model + " memorySize "+ memorySize);
    }


}
