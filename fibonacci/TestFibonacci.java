import java.io.*;
import java.util.*;

class TestFibonacci {
  public static void main(String[] args) {
    testFib(0, 0);
    testFib(1, 1);
    testFib(2, 1);
    testFib(3, 2);
    testFib(4, 3);
    testFib(5, 5);
    testFib(6, 8);
    testFib(7, 13);
    testFib(8, 21);
    testFib(9, 34);
    testFib(10, 55);
    System.out.println("Hooray! All tests pass!");
  }
  
  public static void testFib(int n, int expected) {
    int actual = Fibonacci.fib(n);
    if(expected != actual) {
      throw new AssertionError(String.format("fib(%d) != %d, Got %d!", n, expected, actual));
    }
  } 
}

