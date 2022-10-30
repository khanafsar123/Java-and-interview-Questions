package zzRepls;

import java.util.Scanner;

public class Repl78 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr= new int[5];

        for (int i=0; i<arr.length; i++) {
            arr[i]=input.nextInt();
            int numbers =arr[i]*10;
            System.out.println(numbers);
        }
    }
}
