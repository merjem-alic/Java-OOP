public class Casting {
    public static void main(String[] args) {
        // widening casting
        int myint = 9;
        double mydouble = myint;

        System.out.println(myint); // outputs 9
        System.out.println(mydouble); // outputs 9.0

        // narrowing casting
        double myDouble = 9.87d;
        int myInt = (int) myDouble; // manual casting, we must use ()

        System.out.println(myDouble); // outputs 9.87
        System.out.println(myInt); // outputs 9
    }
}
