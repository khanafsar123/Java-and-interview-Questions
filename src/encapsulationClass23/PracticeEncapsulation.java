package encapsulationClass23;

public class PracticeEncapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PracticeEncapsulation(String name, int age) {
        setName(name);
        setAge(age);
    }
}
class test{
    public static void main(String[] args) {
        PracticeEncapsulation enc=new PracticeEncapsulation("khan", 33);
        System.out.println(enc.getName());
    }
}