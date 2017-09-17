import java.util.*;

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

  public static void main(String[] args) {
    ContainsDuplicateII c = new ContainsDuplicateII();
    System.out.println(c.hasDuplicate(new int []{8, 94, 3, 5 ,24, 8}, 4));
  }
}
