package array;

public class Array01 {
    public static void main(String[] args) {
        String[] iceCream={"Vanilla", "Choclate", "Pastatashio", "kulfi", "Mango"};
        // Printing values using for loop
        for (int i=0; i<iceCream.length; i++){
            System.out.println(iceCream[i]);
        }
        System.out.println("+++++++++++++++++++++++++using enhanced for loop+++++++++++++++++++++++");
        // printing values using enhanced for loop
        for(String a1:iceCream){
            System.out.println(a1);
        }
        System.out.println("+++++++++++++++++++++++++using index+++++++++++++++++++++++");
            System.out.println(iceCream[0]);
            System.out.println(iceCream[1]);
    }
}
