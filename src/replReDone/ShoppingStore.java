package replReDone;

public class ShoppingStore {

    String item;
    double price;
    int quantity;


    ShoppingStore(String item, double price, int quantity) {
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    public double itemTotalPrice(){
     double totalPrice=price*quantity;
        System.out.println(item +"Total Value "+totalPrice);
        return totalPrice;
    }
    void print(){
        System.out.println("");
    }
}
