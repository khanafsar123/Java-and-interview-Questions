package zzRepls;

public class Repl89 {
    public static void main(String[] args) {
        /*

- Create a String "name" and assign the value "Timmy" to it.
- Find out how many characters are there in the given String.
         */
        String name="Timmy";
        System.out.println(name.length());
        for (int i=0; i<name.length(); i++) {
            char characters = name.charAt(i);
            System.out.print(characters + " ");
        }
        System.out.println();
        System.out.println("With while loop");
        int i=0;
        while(i!=name.length()) {
           char chars=name.charAt(i);
            System.out.print(chars+" ");
            i++;
        }
    }
}
