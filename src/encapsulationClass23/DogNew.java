//package encapsulationClass23;
//
//public class DogNew {
//    public class DogNew {
//        private String name1;
//        private String breed1;
//        private int age1;
//        private double weight1;
//
//        public DogNew(String name, String breed, int age, double weight) {
//            setName1(name);
//            setBreed1(breed);
//            setAge1(age);
//            setWeight1(weight);
//        }
//
//        void setName1(String name1) {
//            if (name1.length() > 30) {
//                System.out.println("Name can't be more than 30 letters. Please try again");
//            } else if (name1.isEmpty()) {
//                System.out.println("Name can't be empty Please try again");
//            } else {
//                this.name1 = name1;
//            }
//        }
//
//        void setWeight1(double weight1) {
//            if (weight1 < 0) {
//                System.out.println("Negative weight is not allowed. Please try again");
//            } else if (weight1 > 300) {
//                System.out.println("Please try less than 300 it looks more of a elephant");
//            } else {
//                this.weight1 = weight1;
//            }
//        }
//
//        void setAge1(int age1) {
//            if (age1 > 20) {
//                System.out.println("Please use less age something seems wrong here are you sure its a dog?");
//            } else if (age1 < 0) {
//                System.out.println("age can't be negative");
//            } else {
//                this.age1 = age1;
//            }
//        }
//
//        void setBreed1(String breed1) {
//            if (breed1.length() > 20) {
//                System.out.println("Breed can't be more than 20 letters. Please try again");
//            } else if (breed1.isEmpty()) {
//                System.out.println("Breed can't be empty Please try again");
//            } else {
//                this.breed1 = breed1;
//            }
//        }
//
//        String getName1(){
//            return name1;
//        }
//        String getBreed1(){
//            return breed1;
//        }
//        int getAge1(){
//            return age1;
//        }
//        double getWeight1(){
//            return weight1;
//        }
//        void printInfo() {
//            System.out.println("Name " + name1 + " Breed " + breed1 + " Age " + age1 + " Weight " + weight1);
//        }
//    }
//
//    class Test {
//        public static void main(String[] args) {
//           // DogNew tommy = new DogNew("Tommy", "German", 10, 20);
//
//       /* tommy.name="Tommy";
//        tommy.breed="German";
//        tommy.age=15;
//        tommy.weight=20;*/
//            // System.out.println(tommy.name);
//            //System.out.println(tommy.getName1());
//            //tommy.printInfo();
//        }
//    }
//}
