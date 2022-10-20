package HWOct04and05;

public class Oct4Task3 {
    /*
    Create a method that will accept a String as a parameter and return a new String
    that consist only of vowels. Method should be available inside the class only
    where it was declared and executed by calling it is name.
     */
//    private String vowels(String letters) {
//        letters=letters.replaceAll("[^aeiouAEIOU]","");
//        return letters;
//    }
//
//    public static void main(String[] args) {
//        Oct4Task3 obj = new Oct4Task3();
//        String str=obj.vowels("abcdeforh1234AEIJHGNIORESTJGN");
//        System.out.println(str);
//    }
        private String vowels(String letters) {
          String newLetters=letters.replaceAll("[^aAeEiIoOuU]", "");
        return newLetters;
        }

    public static void main(String[] args) {
        Oct4Task3 obj = new Oct4Task3();
        String newletter=obj.vowels("afscAsFGDEAETYalsd;jf12345");
        System.out.println(newletter);
    }

}
