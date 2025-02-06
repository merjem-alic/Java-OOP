public class Examples {
    public static void main(String[] args) {
        // counting to 100 by tens
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        // printing only even values from 1 to 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // printing the multiplication table for a specified number

        int number = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
