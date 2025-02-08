public class Classatributes {
    int x = 5;

    // if we don't want something to be overwritten, we add final
    final int y = 3;

    public static void main(String[] args) {
        // accessing attributes
        Classatributes myObj = new Classatributes();

        // modifying/overwriting attributes
        myObj.x = 40;
        System.out.println(myObj.x);
    }
}
