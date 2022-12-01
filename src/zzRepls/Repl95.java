package zzRepls;

import java.util.Scanner;

public class Repl95 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

 /*   Using Scanner class input string value.

    Print out the following: "The first 3 letters of \_\_\_ is ___"

            ```
    For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".*/
        String name=input.nextLine();
        String name1=name.substring(0,3);
        System.out.println(name1);
    }
}
