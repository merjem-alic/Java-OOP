public class Default {
    public static void main(String[] args) {
        int day = 4;
switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}

    }
}

// default is used when we need to run some code even when there is no case match
