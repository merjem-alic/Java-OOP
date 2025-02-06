public class Recursion2 {
    public static void main(String[] args) {
      int result = sum(5, 10);
      System.out.println(result);
    }
    public static int sum(int start, int end) {
      if (end > start) {
        return end + sum(start, end - 1);
      } else {
        return end;
      }
    }
  }

  // here we are adding all numbers between 5 and 10