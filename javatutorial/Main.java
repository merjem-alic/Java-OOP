public class Main {
    public static void main(String[] agrs) {
        System.out.println("Hello World");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");

        // print is same as println
        // it prints stuff on the same line
        System.out.print("Hello world vol2! ");
        System.out.print("I will print on the same line.");

        // we can also print numbers
        System.out.println(11);
        System.out.println(04);
        System.out.println(2005);

        // we can also do math
        System.out.println(2+2);
        System.out.println(2*3);

        // single line comment
        /* multi-line
         * comment
         */

         // types of variables
         String name = "John";
         System.out.println(name);

         int myNum = 15;
         System.out.println(myNum);

         // use final for no overwriting

         float myFloat = 5.99f;
         System.out.println(myFloat);

         char myChar = 'M';
         System.out.println(myChar);

         boolean myBool = true;
         System.out.println(myBool);

         // we can also combine variables
         String name2 = "John";
         System.out.println("Hello " + name);

         // or we could do this as well
         String firstname = "John";
         String lastname = "Doe";
         String fullname = firstname + lastname;
         System.out.println(fullname);

         // short way of declaring vars
         int x=5, y=6, z=7;
         System.out.println(x+y+z);

         // you can also do this
         int a, b, c;
         a = b = c = 50;
         System.out.println(a + b + c);
    }
}
