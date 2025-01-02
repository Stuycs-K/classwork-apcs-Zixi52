public class fibonacci {
  // largest int n that can be calculated within 10 seconds is 46
  // largest int n without overflow = 46
  public static void main(String[] args) {
    System.out.println(fib(46));
  }

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n-2) + fib(n-1);
    }
  }
}
