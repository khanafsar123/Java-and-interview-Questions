package zzRepls;

public class Repl81 {
    public static void main(String[] args) {
        /*
       Write a program that prints the highest value in the array.
                **Expected Output:**
                    input [5,4,8]
                        8
         */
        int [][] arr= {
                {5,4,8},
                {8,9,10}};

        int highest = arr[0][0];

        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[1].length; j++) {
                if(arr[i][j] > highest) {
                   highest = arr[i][j];

                }

            }
        }
        System.out.println(highest);






    }
}
