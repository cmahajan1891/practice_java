class RemoveDuplicate {

  //Works but have two while loops which makes the worst case complexity to be n2
  int remove(int [] nums) {
    if (nums.length < 2) {
      return nums.length;
    }

    int i = 1, k = 0, t = 0;
    while ((i + t) < nums.length) {
      if (nums[i]!=nums[i-1]) {
        i++;
      }else {
        k = i;
        while (k + 1 < nums.length - t) {
          int tmp = nums[k + 1];
          nums[k+1] = nums[k];
          nums[k] = tmp;
          k++;
        }
        t++;
      }
    }
    return i;
  }
  // More effecient solution by updating the array position with the new element and moving the second pointer forward if it is same as the previous number.
  int removeDup(int nums[]) {
    if (nums.length<2) {
      return nums.length;
    }
    int i = 0, j = 1;
    while (j<nums.length) {
      if (nums[i] == nums[j]) {
        j++;
      }else {
        i++;
        nums[i] = nums[j];
        j++;
      }
    }
    return i + 1;
  }


  public static void main(String[] args) {
    RemoveDuplicate rm = new RemoveDuplicate();
    System.out.println(rm.remove(new int[]{1,2,2,3,4,4,4,5}));
    System.out.println(rm.removeDup(new int[]{1,2,2,3,4,4,4,5}));
  }
}
