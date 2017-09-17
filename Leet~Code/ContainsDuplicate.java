import java.util.*;

class ContainsDuplicate {
  boolean hasDuplicate(int []nums) {
    HashSet<Integer> hs = new HashSet<>();
    for (int i : nums ) {
      // A better way to implement hashset is to check the value returned by the function add
      // it would only return false if the element is already added in the set, and so there is
      // no need to call the contains method as set does not allow duplicates.
      if (!hs.add(i)) {
        return true;
      }
      // hs.add(i);
    }
    return false;
  }
  public static void main(String[] args) {
    ContainsDuplicate c = new ContainsDuplicate();
    System.out.println(c.hasDuplicate(new int[]{1,3,2,8,4,5,5,9}));
  }
}
