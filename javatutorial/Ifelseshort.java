public class Ifelseshort {
    public static void main(String[] args) {
        // we can do this
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // or to shorten it we can do this
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
