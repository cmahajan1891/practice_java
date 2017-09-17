import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

class ContainsDuplicateII {

   boolean hasDuplicate(int nums[], int k) {

    int min = Integer.MAX_VALUE;

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        int preindex = map.get(nums[i]);
        int gap = i - preindex;
        min = Math.min(min, gap);
      }
      map.put(nums[i], i);
    }
    if (min <= k) {
      return true;
    }
    return false;
  }

  boolean calculateNearbyDuplicate(int []nums, int k){
    //HashMap<Integer, Integer> map = new HashMap<>();
    int j = 0;
    HashSet<Integer> set = new HashSet();
    for (int i = 0; i < nums.length ; i++) {
      if (!set.add(nums[i])) {
        return true;
      }
      if (set.size()>=k) {
        set.remove(nums[j++]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ContainsDuplicateII c = new ContainsDuplicateII();
    System.out.println(c.hasDuplicate(new int []{8, 94, 3, 5 ,24, 5}, 4));
    System.out.println(c.calculateNearbyDuplicate(new int []{8, 94, 3, 5 ,24, 5}, 4));
  }
}
