package zzRepls;

import java.util.Scanner;

public class Repl76 {
    public static void main(String[] args) {
     /*
     Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array
      */

        Scanner scan=new Scanner(System.in);
        String[] arr=new String[8];


        for(int i=1; i<arr.length; i++){
            System.out.println("Please enter day "+i +" of the week");
            arr[i]=scan.nextLine();
            System.out.println(arr[i]);
        }
        /*
         Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            array[i] = scan.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
         */






    }}
