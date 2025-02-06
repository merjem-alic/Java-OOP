public class Methodsreturn3 {
    static int myMethod(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int z = myMethod(5, 4);
        System.out.println(z);
    }
}

// this is a smarter thing to do - easier to read and maintain