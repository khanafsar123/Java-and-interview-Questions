package Class18Inherratance;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
        Instance variables are being initialized
        Both Constructors are being executed
     */
    String bookName;
    int price;

    Book(String bookName, int price){
        this.bookName=bookName;
        this.price=price;
        System.out.println("Book Name "+bookName+ " Price $"+ price);
    }
    Book(String bookName){
        this.bookName=bookName;
        System.out.println("Book Name "+bookName);
    }

    public static void main(String[] args) {
        Book task02=new Book("Marketing", 60);
        Book task=new Book("Accounting");

            }

}
