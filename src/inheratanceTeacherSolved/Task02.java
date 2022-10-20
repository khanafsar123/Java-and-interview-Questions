package inheratanceTeacherSolved;

public class Task02 {
    public static void main(String[] args) {
        Y.prinZF();
        Y.prinZF();
    }
}
class Y {
     static void prinZF(){
        System.out.println("Z");
    }

}
class Z extends Y{

}