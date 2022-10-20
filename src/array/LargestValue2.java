package array;

public class LargestValue2 {
    public static void main(String[] args) {

        int[] arr={10,2,15,300,45,1000};
        // to find max first declare largeNum to zero index and then compare with other indexes
        int largeNum=arr[0];
        // apply for loop
        for(int i=0; i<arr.length; i++){

            if(largeNum<arr[i]) //or if (arr[i]>largeNum){
            {
                largeNum=arr[i];
                // or if(max<a[i]
                // if arr number is greater then our criteria it will strore as max number

            }

        }
        System.out.println(largeNum);
    }
}
