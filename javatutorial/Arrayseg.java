public class Arrayseg {
    public static void main(String[] args) {
        // calculating the average of different ages

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // get the length of the array
        int length = ages.length;

        // loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // calculate the average
        avg = sum / length;

        // print the average
        System.out.println("The average age is: " + avg);

        // finding the lowest age
        int ages2[] = {1, 2, 3, 17, 99, 45};

        //int len = ages2.length;

        int lowestAge = ages2[0];

        // loop through the array
        for (int age2 : ages2) {
            // check if the current age is smaller than the lowest age
            if (lowestAge > age2) {
                // if the smaller age is found, update the lowest age w/ that element
                lowestAge = age2;
            }
        } 

        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
