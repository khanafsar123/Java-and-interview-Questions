package loopsClasswork;

import java.util.Scanner;

public class DoWhileJobExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Did you get a job?");
            answer = sc.nextLine();

        } while (!answer.equals("yes"));

        System.out.println("Congrats");
        System.out.println("================================");


//        String answer1="a";
//        do{
//            System.out.println("Did you got job?");
//
//        }
//        while(!answer1.equals("yes"));
//        System.out.println("congrats");
//
//

    }
}
