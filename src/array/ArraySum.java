package array;

public class ArraySum {
    public static void main(String[] args) {
/*
 * Create an array on integers and calculate the sum of all elements in
an array
 */
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int sum = 0;
        // Using enhanced for loop
        for(int n1:numbers){
            sum=sum+n1;
        }
        System.out.println(sum);

        System.out.println("===using regular for loop");

        int sum1=0;
        for(int i=0; i< numbers.length; i++) {
            sum1=sum1+numbers[i];
            // sum1+=sum1+numbers[i];
        }
        System.out.println(sum1);
    }}
