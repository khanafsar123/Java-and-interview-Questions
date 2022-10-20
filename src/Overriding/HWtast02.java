package Overriding;

public class HWtast02 {
    double balance;
    double interest;

    double getInterest(double balance){
        interest=balance*interest;
        System.out.println(interest);
            return interest;
    }
}
class Visa extends HWtast02{


}
class AX extends HWtast02{
    double getInterest(double balance) {
        interest=balance*1.15;
        System.out.println(interest);
        return interest;
    }

}

