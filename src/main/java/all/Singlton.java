public class Singlton {

    //To create a singleton class, we must follow the steps, given below:
    //1. Ensure that only one instance of the class exists.
    //2. Provide global access to that instance by
    //Declaring all constructors of the class to be private.
    //Providing a static method that returns a reference to the instance.
    // The lazy initialization concept is used to write the static methods.
    //The instance is stored as a private static variable.
    public static Singlton singlton= null;

    public String s;


    private Singlton(){
        s= "HELOO";
    }
    public static synchronized Singlton getSingltonObj(){
        if(singlton == null)
            singlton = new Singlton();
        return singlton;
    }


}
