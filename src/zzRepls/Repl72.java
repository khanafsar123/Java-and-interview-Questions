package zzRepls;

public class Repl72 {
    public static void main(String[] args) {
        /*
        Write a program that creates an array with the following values
        {s, a, y,  b, n, c, t,  d, a, e, x}
        Print the values so the output should look like below

        **Output:**
        syntax
         */


        char[] array={'s', 'a','y','b','n','c','t','d','e','x'};
        System.out.println(array[0]+""+array[2]+""+array[4]+""+array[6]+""+array[1]+""+array[9]);


        System.out.println();

        // Second Method use for loop
        //because all are at the same increment
        for (int i=0; i<array.length; i+=2)
        {
            System.out.print(array[i]);
        }
    }
}
