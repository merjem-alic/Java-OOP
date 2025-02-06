public class Methodoverloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble (double x, double y) {
        return x + y;
    }

    public static void main(String[] agrs) {
        int myNum = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum);
        System.out.println("double: " + myNum2);
    }
}
