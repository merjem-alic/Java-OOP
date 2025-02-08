public class Methodsoop {
    // static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects.");
    }

    // public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects.");
    }

    // main method
    public static void main(String[] args) {
        myStaticMethod(); // calling the static method
        // myPublicMethod(); this would throw an error

        // the correct way of calling a public method
        Methodsoop myObj = new Methodsoop(); // creating an object of main
        myObj.myPublicMethod(); // calling the public method on the object
    }
}
