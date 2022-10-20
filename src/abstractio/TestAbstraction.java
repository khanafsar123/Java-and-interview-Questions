package abstractio;

public class TestAbstraction {
    public static void main(String[] args) {


    DataBases dataBase=new Oracle();
    dataBase.openDatabase();
    dataBase.readData();
    dataBase.writeData();
    dataBase.closeDatabase();
}}
