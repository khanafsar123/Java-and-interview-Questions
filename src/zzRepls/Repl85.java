package zzRepls;

public class Repl85 {
    public static void main(String[] args) {
        /*
        Write a program that sums all numbers that are on even index and on even row.

**Expected Output:**

```
-4
         */

        int[][] arr = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int sum=0;

        for(int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                if(j%2==0 && arr[i][j]%2==0)
                {
                    sum+=arr[i][j];
                }

            }
        }
        System.out.println(sum);







    }
}
