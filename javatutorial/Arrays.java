public class Arrays {
    public static void main(String[] args) {
        // declaring an array
        // String[] array;

        // storing values in an array
        String[] cars = {"Volvo", "BMW", "Ford", "Porsche"};
        System.out.println(cars);

        // to create an array of integers, we do this
        int[] myNum = {1, 2, 3, 4, 5};
        System.out.println(myNum);

        // here is how to access elements of an array
        String[] fruits = {"Banana", "Kiwi", "Watermelon"};
        System.out.println(fruits[0]); 

        // to change an array element we do this
        fruits[0] = "Blackberry";

        // to find how many elements an array has, we use .length
        String[] drinks = {"Tea", "Coffee", "Juice"};
        System.out.println(drinks.length);

        // looping through an array
        // printing all elements in the array
        String[] chores = {"Clean", "Study", "Work"};
        for (int i = 0; i < chores.length; i++) {
            System.out.println(chores[i]);
        }

        // looping through an array using for each
        String[] shoppinglist = {"Milk", "Eggs", "Bread"};

        for (String i : shoppinglist) {
            System.out.println(i);
        }
    }
}
