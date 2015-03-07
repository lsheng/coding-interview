import java.io.*;
import java.util.*;

class TestFindDups {
  public static void main(String[] args) {
    testFindDups(false);
    testFindDups(true, 1, 1);
    testFindDups(false, 1, 2, 3);
    
    testFindDupsWithDistance(false, 1);
    testFindDupsWithDistance(true, 1, 1, 1);
    testFindDupsWithDistance(false, 1, 1, 2, 1);
    testFindDupsWithDistance(true, 2, 1, 2, 1);

    testFindDupsWithTolerance(false, 1, 0);
    testFindDupsWithTolerance(true, 1, 0, 1, 1);
    testFindDupsWithTolerance(false, 1, 0, 1, 2, 1);
    testFindDupsWithTolerance(true, 2, 0, 1, 2, 1);
    testFindDupsWithTolerance(true, 1, 1, 1, 2, 1);

    testFindDupsWithTolerance(true, 1, 3, 3, 4);
    testFindDupsWithTolerance(true, 1, 3, 3, 5);
    testFindDupsWithTolerance(true, 1, 3, 3, 6);
    testFindDupsWithTolerance(false, 1, 3, 3, 7);

    System.out.println("Hooray! All tests pass!");
  }
  
  public static void testFindDups(boolean expected, int... numbers) {
    boolean actual = FindDups.findDups(numbers);
    if(expected != actual) {
     throw new AssertionError("findDups(" + pp(numbers) + ") != " + expected + ", Got " + actual);
    }
  } 

  public static void testFindDupsWithDistance(boolean expected, int k, int... numbers) {
    boolean actual = FindDups.findDupsWithDistance(k, numbers);
    if(expected != actual) {
     throw new AssertionError("findDupsWithDistance(" + k + ", " + pp(numbers) + ") != " + expected + ", Got " + actual);
    }
  } 
 
  public static void testFindDupsWithTolerance(boolean expected, int k, int l, int... numbers) {
    boolean actual = FindDups.findDupsWithTolerance(k, l, numbers);
    if(expected != actual) {
     throw new AssertionError("findDupsWithTolerance(" + k + ", " + l + ", " + pp(numbers) + ") != " + expected + ", Got " + actual);
    }
  } 

  public static String pp(int... numbers) {
    String numbersString = "";
    for(int n : numbers) {
      if(numbersString != "") {
        numbersString += ", ";
      }
      numbersString += n;
    }
    return numbersString;
  }
}

