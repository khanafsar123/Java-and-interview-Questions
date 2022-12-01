package abstractio;

public interface InterFacePractice {

    void print1231321();
    default void print165465465(){
        System.out.println("I am parent implemented");

    }
}
class abced implements InterFacePractice{


    @Override
    public void print1231321() {

    }
    @Override
    public void print165465465(){
        System.out.println("I am child implemented");

    }



    }

    class xpsxps{
        public static void main(String[] args) {
            abced obj=new abced();
            obj.print1231321();
            obj.print165465465();

        InterFacePractice[] methods={new abced()};

        }
    }

