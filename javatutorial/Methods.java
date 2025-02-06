public class Methods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] agrs) {
        myMethod();

        // we can also call it multiple times
        myMethod();
        myMethod();
        myMethod();
    }
}
