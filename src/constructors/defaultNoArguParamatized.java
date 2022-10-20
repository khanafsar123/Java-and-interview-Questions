package constructors;


public class defaultNoArguParamatized {
    // Default: if we create the objects and initilize objects and dont create constructor and compilier creats for us

    // NoArugment
    defaultNoArguParamatized(){
        System.out.println("i am No argument constructor");

    }

    // paramatized constructor
    defaultNoArguParamatized(int i){
        System.out.println("Interger of Paramatized constructor is " +i);
    }

    public static void main(String[] args) {
        // calling non argument
        defaultNoArguParamatized nonArg=new defaultNoArguParamatized();

        // calling paramatized constructor
        defaultNoArguParamatized paraMatized=new defaultNoArguParamatized(5);

    }

    }
