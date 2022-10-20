package abstractio;

public abstract class DataBases {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends DataBases{
    // now implement methods
    @Override
    void openDatabase() {
        System.out.println("Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data");
    }

    @Override
    void writeData() {
        System.out.println("writing the data to MSDatabase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the data MSDatabase");
    }

}
    class  Oracle extends DataBases{
        @Override
        void openDatabase() {
            System.out.println("Opening the Oracle Database");
        }

        @Override
        void readData() {
            System.out.println("Reading the data");
        }

        @Override
        void writeData() {
            System.out.println("writing the data to Oracle Database");
        }

        @Override
        void closeDatabase() {
            System.out.println("Closing the data Oracle Database");
        }
        // we are using two methods we have to create child class to use the methods



}
