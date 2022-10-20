package clsActvtyOct050607;

public class staticPractice {
   int empId;
   String name;
    static String organization="syntax";
  staticPractice(int empId1,String name1){
      empId=empId1;
      name=name1;
  }
  void disply(){

      System.out.println(name+ " "+ empId + " "+ organization);
  }
    public static void main(String[] args) {
      staticPractice emp1=new staticPractice(123,"khan");
      emp1.disply();
      staticPractice emp2=new staticPractice(134, "afsar");


    }
}

