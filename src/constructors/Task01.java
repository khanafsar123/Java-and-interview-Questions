package constructors;

public class Task01 {
    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("abc", "5192011112", "123-east street");
        userInfo.printUserDetail();
    }

}
class UserClass{
    String name;
    String mobileNumber;
    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}

class UserInfo extends UserClass{
    String address;
UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address=address;
}
void printUserDetail(){
    System.out.println("Name "+ name+ " Moblie Number "+mobileNumber+ " address "+address);
}
}