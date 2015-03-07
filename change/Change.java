import java.io.*;
import java.util.*;

class Change {
  public static List<Integer> makeChange(List<Integer> coins, Integer value) {
    List<Integer> result = new ArrayList<Integer>();
    /** write code here. */
    return result;
  }

  public static void main(String[] args) {
    List<Integer> UScoins = new ArrayList<Integer>();
    UScoins.add(1);
    UScoins.add(5);
    UScoins.add(10);
    UScoins.add(25);
    UScoins.add(50);
    System.out.println("makeChange(UScoins, 13) = " + makeChange(UScoins, 13));
  }
}

