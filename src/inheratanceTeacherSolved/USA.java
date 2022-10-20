package inheratanceTeacherSolved;

import practiceProtected.Country;

// we have to import the country because we are in different package
public class USA extends Country {

    USA(String name){
        super(name);
    }



    public static void main(String[] args){
    USA usa=new USA("Pakistan");
    usa.name="USA"; // Public
        usa.capital="DC"; // protected
        // usa.population is not available because of the default visibility
        usa.bigCity="karachi";
        Country.bigCity="Mansehra";


}}
