import java.io.*;
import java.util.*;

class Fibonacci {

  /** Recursive Solution */
  public static int fib_recursive(int n) {
    if(n<2) return n;
    return fib(n-2) + fib(n-1);
  }

  /** Iterative solution */
  public static int fib_iterative(int n) {
    int cur = 0;
    int next = 1;
    for (int c=0; c<n; c++) {
      int tmp = cur + next;
      cur = next;
      next = tmp;
    }
    return cur;
  }

  /** Constant time solution */
  public static int fib_constant(int n) {
    double a = Math.pow((1 + Math.sqrt(5)), n); 
    double b = Math.pow((1 - Math.sqrt(5)), n);
    double d = Math.pow(2, n) * Math.sqrt(5);
    double f = (a-b) / d;
    return (int)Math.round(f);
  }

  /** Solution Selector */
  public static int fib(int n) {
    return fib_recursive(n);
  }

  public static void main(String[] args) {
    System.out.println("fib(0) = " + fib(0));
    System.out.println("fib(1) = " + fib(1));
    System.out.println("fib(2) = " + fib(2));
  }
}

