package zzRepls;

public class Repl93 {
    public static void main(String[] args) {

/*
String “abracadabra alakazam”;
- Print out the position of the first occurrence of "c".
- Print out the position of the first occurrence of " ".
- Print out the position of the first occurrence of the variable target1.
- Print out the position of the first occurrence of the variable target2.
 */
        String name="abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        System.out.println(name.indexOf('a'));
        // Second C
        System.out.println(name.indexOf(4,'a'));
        System.out.println(name.indexOf(' '));
        System.out.println(name.indexOf(target1));
        System.out.println(name.indexOf(target2));

    }
}
