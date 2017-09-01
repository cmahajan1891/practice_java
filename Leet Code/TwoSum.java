import java.util.*;

class TwoSum {
  int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    if (nums.length < 2) {
      return new int[]{0,0};
    }
    else {

      for (int i = 0;i<nums.length ;i++ ) {

          if (!map.containsKey(nums[i])) {
            map.put(target - nums[i], i);
          }else {
            return new int[]{map.get(nums[i]), i};
          }

      }
    }
    return new int[]{0,0};
  }
  public static void main(String[] args) {
    TwoSum t = new TwoSum();
    int [] result = t.twoSum(new int []{2,7,11,15}, 9);
    System.out.println(result[0] + " " + result[1] );
  }
}
