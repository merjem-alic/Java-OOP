public class Score {
    public static void main(String[] args) {
        int maxScore = 500;

        int userScore = 423;

        /* Calculate the percentage of the users score
         * in relation to the maximum available score
         * convert userscore to float to make sure
         * that the division is accurate
         */

         float percentage = (float) userScore / maxScore * 100.0f;

         System.out.println("User's percentage is: " + percentage);
    }
}
