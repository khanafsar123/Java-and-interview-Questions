package abstractio;

public abstract class Anima {
    abstract void eat ();
    abstract void sleep();
    void run(){
        System.out.println("animal can run as well");
    }
}
class Cat extends Anima{
    @Override
    void eat() {
        System.out.println("cats eat");
    }

    @Override
    void sleep() {
        System.out.println("cat sleep 10 hours");
    }

    @Override
    void run() {
        super.run();

    }
}
