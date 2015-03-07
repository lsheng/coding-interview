import java.io.*;
import java.util.*;

class FindDups {
  public static Boolean findDups(int... numbers) {
    Set<Integer> ints = new HashSet<Integer>();
    for(int n : numbers) {
      if(ints.contains(n)) {
        return true;
      }
      ints.add(n);
    }
    return false;
  }

  public static Boolean findDupsWithDistance(int k, int... numbers) {
    Set<Integer> ints = new HashSet<Integer>();
    Deque buffer = new LinkedList<Integer>();
    for(int n : numbers) {
      if(ints.contains(n)) {
        return true;
      }
      ints.add(n);

      // Update the buffer, removing from the set if we go over capacity
      buffer.addFirst(n);
      if(buffer.size() > k) {
        Integer toDel = (Integer)buffer.removeLast();
        ints.remove(toDel);
      }
    }
    return false;
  }

  public static Boolean findDupsWithTolerance(int k, int l, int... numbers) {
    if(l==0) {
      return findDupsWithDistance(k, numbers);
    }
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Deque buffer = new LinkedList<Integer>();
    for(int n : numbers) {
      // We'll hash to n/l
      int hn = n/l;
      if(map.containsKey(hn)) {
        // If two things are in the same bucket, they must be within the tolerance
        return true;
      }
      if(map.containsKey(hn+1) && within(map.get(hn+1), n, l)) {
        return true;
      }
      if(map.containsKey(hn-1) && within(map.get(hn-1), n, l)) {
        return true;
      }
      map.put(hn, n);

      // Update the buffer, removing from the map if we go over capacity
      buffer.addFirst(n);
      if(buffer.size() > k) {
        Integer toDel = (Integer)buffer.removeLast();
        map.remove(hn);
      }
    }
    return false;
  }

  public static Boolean within(int x, int y, int l) {
    return Math.abs(x-y) <= l;
  }

  public static void main(String[] args) {
    System.out.println("findDups(1,2,1) = " + findDups(1,2,1));
  }
}

