package array;

import jdk.jfr.Name;

public class ArrayDemo3 {
    public static void main(String[] args) {
        String[] week= {"Monday", "Sunday","Tuesday", "Thursday", "Friday"};
// if day is Sunday -> it is fun day
// otherwise - it is a boring day
        for(String day:week) {
            if(day.equals("Sunday")) {
                System.out.println(day+" is a fun day");
            }else if(day.equals("Friday")) {
                System.out.println(day+" is a relax day");
            }else {
                System.out.println(day+" is a boring day");
            }}
        System.out.println("===================rePerformed+++++++++++");

        String[] week1= {"Monday", "Sunday","Tuesday", "Thursday", "Friday"};
        for (int i=0; i< week1.length; i++) {
            if(week1.equals("Sunday")) {
                System.out.println(week1+ " Its a funday");
            } else {
                System.out.println(week1+" it boring day");
            }
        }
    }
}
