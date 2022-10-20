package oct04Variable;

public class Task02 {
    String name;
    String id;
     int numberOfStudent;

    public static void main(String[] args) {
        Task02 roman=new Task02();
        roman.id="1";
        roman.name="Roman";
        roman.numberOfStudent++;
//        Task02.numberOfStudent=1;
//        System.out.println(Task02.numberOfStudent); // static varialble can be acces by class name and is the best practice
    }

}
