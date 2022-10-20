package HWOct04and05;

public class Oct4Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public String reverse (String name) {
        String str="";
        for (int i=name.length()-1; i>0; i--) {
            str=str+name.charAt(i);
        }
        return str;
    }
    public static String reverse1(String name2) {
        String newName2;
        StringBuilder stringBuilder = new StringBuilder(name2);
        stringBuilder.reverse();
        newName2=stringBuilder.toString();

    return newName2;
    }

    public static void main(String[] args) {
    Oct4Task2 rev= new Oct4Task2();
    String str1 = rev.reverse("syntax");
        System.out.println(str1);

//        Oct4Task1 stringbuil=new Oct4Task1();
//
//        System.out.println(stringbuil.toString());

        // using class
        System.out.println(Oct4Task2.reverse1("sunday"));


    }
}
