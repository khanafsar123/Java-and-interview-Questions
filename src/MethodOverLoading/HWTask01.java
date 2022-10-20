package MethodOverLoading;

public class HWTask01 {
    public static void main(String[] args) {
        area obj=new area();
        obj.Area(5);
        obj.Area(5,10,5);
        obj.Area(5,10);

    }
}
class area{
    void Area(int length, int height) {
        System.out.println(length*height);
    }
    void Area(int length){
        System.out.println(length*length);
    }
    void Area(int length, int width, int height) {
        System.out.println(length*width*height);
    }
}

