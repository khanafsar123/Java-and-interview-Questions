package zzRepls;

public class Repl84 {
    public static void main(String[] args) {
/*
Write a program that prints the total number of elements that are negative AND odd

**Output:**
for example -3 is both negative and odd

3
 */

            int[][] arr = {
                    {-5,-2,-3,7},
                    {1,-5,-2,2},
                    {1,-2,3,-4}
            };

        int count=0;

        for(int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {

                if(arr[i][j] <0 && arr[i][j]%2!=0) {
                    count++;
                                                    }
            }
        }
        System.out.println(count);

}}
