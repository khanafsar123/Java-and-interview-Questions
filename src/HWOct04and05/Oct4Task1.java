package HWOct04and05;

public class Oct4Task1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
        int arraySum(int[] arr) {

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }


    public static void main(String[] args) {
        Oct4Task1 obj=new Oct4Task1();
        int[] arr= {10,35,45,55,2,56};
        System.out.println(obj.arraySum(arr));


    }
}
