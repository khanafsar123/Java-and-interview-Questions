package polyMorphis;

public class Task01 {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use brakes to stop me");

    }
    void park() {
        System.out.println("park me manually");
    }
}
class BMW extends Task01{
    void start(){
        System.out.println("Press START to start me");
    }
    void stop(){
        super.stop(); // calling parent method and add functionalities down
        System.out.println("Use brakes to stop me");

    }

}

