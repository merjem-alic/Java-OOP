public class Methodsaccess {
    // create a car object named myCar
    // call the fullThrotle() and
    // speed() methods on myCar object
    // run the program

    public void fullThrotle() {
        System.out.println("This car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Methodsaccess myCar = new Methodsaccess();
        myCar.fullThrotle();
        myCar.speed(200);
    }
}
