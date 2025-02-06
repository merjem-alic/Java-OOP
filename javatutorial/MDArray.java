public class MDArray {
    public static void main(String[] args) {
        // creating a multi-dimensional array
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers);

        // accessing elements
        System.out.println(myNumbers[1][2]);
        // the first bracket is for the array
        // the second bracket is for the element inside the array

        // changing element values
        int[][] myNums = {{1, 2, 3}, {4, 5, 6}};
        myNums[1][2] = 9;
        System.out.println(myNums[1][2]);

        // looping through an MD array
        int[][] numbers = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; ++j) {
                System.out.println(numbers[i][j]);
            }
        }

        // or we could just use a for each loop
        int[][] nums = {{1, 2, 3}, {4, 6}, {7, 8}};
        for (int[] row : nums) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
