public class Breakcontinue {
    public static void main(String[] agrs) {
        // example of a break to jump out of a loop

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // continue

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // break and continue in a while loop
        // break example
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        // continue
        int i2 = 0;
        while (i2 < 10) {
            if (i2 == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
