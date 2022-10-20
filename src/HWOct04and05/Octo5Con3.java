package HWOct04and05;

public class Octo5Con3 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */
    public String phoneName;
    private String password;
    protected int totalFundAvailable;
    String phoneType;

    public Octo5Con3(){

    }

   private Octo5Con3 (String newPassword) {
       password=newPassword;
   }

    void printprivate(){
        System.out.println("The phone password is: "+password);}

  protected Octo5Con3 (int totalFundAvailable1) {
        totalFundAvailable=totalFundAvailable1;

  }
    void printprotected(){
        System.out.println(totalFundAvailable);}

  Octo5Con3 (String phoneType2, int totalFundAvailable2) {
        phoneType=phoneType2;
        totalFundAvailable=totalFundAvailable2;
  }
    void printdefaule(){
        System.out.println(phoneType+ " " +totalFundAvailable);}

  public Octo5Con3 (String phoneName3, String phoneType3) {
        phoneName=phoneName3;
        phoneType=phoneType3;
  }
    public void printpublic(){
        System.out.println(phoneName+ " and the phone Type is "+phoneType);}

    public static void main(String[] args) {
        Octo5Con3 protected1=new Octo5Con3(10000);
        protected1.printprotected();



    }












}
