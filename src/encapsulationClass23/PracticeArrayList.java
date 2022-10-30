package encapsulationClass23;


import java.util.ArrayList;

public class PracticeArrayList {

        public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();

        colors.add("red"); // its a class we use add method to add color red
        colors.add("Green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("black");

        // because its a class to print we don't need loop but we can sitll use loop

            System.out.println(colors);

            // specific index

            System.out.println(colors.get(0));

            // in array we use length but in array list we check how many elements by size
            System.out.println(colors.size());
        // in array we use lenght here we use size

            for (int i=0; i<colors.size(); i++){
                System.out.println(colors.get(i));
            }


            System.out.println("enhanced for loop");

            for(String color:colors){
                System.out.println(color);
            }


    }
}
