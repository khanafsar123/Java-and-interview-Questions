package abstractio;

public interface IBases {
    void openDatabase();
    void readData();
    void writeData();

}
class IBM implements IBases{

    @Override
    public void openDatabase() {
        System.out.println("opening");
    }

    @Override
    public void readData() {
        System.out.println("read");
    }

    @Override
    public void writeData() {
        System.out.println("writing");
    }
}
class Test{
    public static void main(String[] args) {
        IBases iBases=new IBM();
        iBases.openDatabase();
        iBases.readData();
        iBases.writeData();
    }
}
