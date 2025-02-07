public class Classesobjects {
    int x = 5;

    public static void main(String[] args) {
        Classesobjects myObj = new Classesobjects();
        System.out.println(myObj.x);

        // we can have multiple objects of one class
        Classesobjects myObj2 = new Classesobjects();
        System.out.println(myObj2.x);
    }
}
