import java.util.*;

class TwoSumII{
  int[] twoSum(int[] nums, int target) {
    if (nums.length<2) {
      return new int[]{0,0};
    }
    int i = 0, j = nums.length-1;
    while (i<=j) {
      if (nums[i]+nums[j]>target) {
        j--;
      }else if(nums[i]+nums[j]<target) {
        i++;
      }else {
        return new int []{i,j};
      }
    }
    return new int []{0,0};
  }

  public static void main(String[] args) {
    TwoSumII t = new TwoSumII();
    int [] re = t.twoSum(new int[]{2,7,11,15}, 9);
    System.out.println("first " + re[0] + " second " + re[1]);
  }
}
