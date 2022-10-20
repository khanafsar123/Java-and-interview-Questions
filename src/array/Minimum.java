package array;

public class Minimum {
    public static void main(String[] args) {
        int[] arr={10,20,1,15,1000};
        int min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
