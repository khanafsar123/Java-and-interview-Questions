package abstractio;

public interface IPerson {
    void eat();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee, IPerson{
    void createRepls();

}
class Asghar implements SyntaxEmployee{

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }

    @Override
    public void createRepls() {

    }
}

