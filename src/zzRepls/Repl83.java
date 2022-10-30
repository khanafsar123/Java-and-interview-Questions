package zzRepls;

public class Repl83 {
    public static void main(String[] args) {
        /*
Write a program that calculates the sum of elements from each row in a 2D array and
adds them into array of integers
For example, if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}
Then we should get the following array back:
4
6
11
3
 */
        int[][] arr = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;


        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[0]) {
                    sum1 += arr[i][j];
                } else if (arr[i] == arr[1]) {
                    sum2 += arr[i][j];
                } else if (arr[i] == arr[2]) {
                    sum3 += arr[i][j];
                } else if (arr[i] == arr[3]) {
                    sum4 += arr[i][j];

                }

            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);


    }
}
