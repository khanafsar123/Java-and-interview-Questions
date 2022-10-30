package zzRepls;

public class Repl74 {
    public static void main(String[] args) {
        /*
        Write a program that creates an array of integers of size 11.
        Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.
         */

        int [] arr=new int[11];

        for (int i=0; i<arr.length; i++) {
            System.out.println(2010 + i);
        }
    }
}
