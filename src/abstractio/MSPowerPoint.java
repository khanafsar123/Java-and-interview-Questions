//package abstractio;
//
//public abstract class MSPowerPoint {
//    /*
//    Create a class File that will have the following behaviors: open, edit, close.
//     Edit and close are implemented method while open is an abstract.
//     Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
//    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
//     */
//    abstract void open();
//    abstract void edit();
//    abstract void close();
//}
//class JavaFile extends MSPowerPoint{
//    @Override
//    void open() {
//
//    }
//    @Override
//    void edit() {
//        System.out.println("Open the file and make necessary changes");
//    }
//    @Override
//    void close() {
//        System.out.println("1) write click on the program in task bar and select close");
//    }
//}
//class WordFile extends MSPowerPoint{
//
//    @Override
//    void open() {
//        System.out.println(".doc");
//    }
//
//    @Override
//    void edit() {
//        System.out.println("Open the file and make necessary changes");
//    }
//
//    @Override
//    void close() {
//        System.out.println("two way to close the program. 1) click X 2) write click on the program in task bar and select close");
//    }
//}
//class PdfFiles extends MSPowerPoint{
//
//    @Override
//    void open() {
//        System.out.println(".pdf");
//    }
//
//    @Override
//    void edit() {
//        System.out.println("You need licence version to make the changes");
//    }
//
//    @Override
//    void close() {
//        System.out.println("two way to close the program. 1) click X ");
//    }
//}
//class TestHW{
//    public static void main(String[] args) {
//        MSPowerPoint obj=new JavaFile();
//        obj.open();
//        obj.edit();
//        obj.close();
//
//        MSPowerPoint obj1=new WordFile();
//
//        obj1.open();
//        obj1.edit();
//        obj1.close();
//
//        MSPowerPoint obj2=new PdfFiles();
//        obj2.open();
//        obj2.edit();
//        obj2.close();
//    }
//}
