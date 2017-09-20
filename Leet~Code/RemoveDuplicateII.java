class RemoveDuplicateII {

  int removeDup(int [] nums) {
    int i = 0, j = 1, count = 0;
    boolean allow = true;

    while (j < nums.length) {
      if (nums[i] == nums[j]) {
        if (allow) {
          i++;
          nums[i] = nums[j];
          j++;
          allow = !allow;
        }else {
            j++;
            count++;
        }
      }else {
        i++;
        nums[i] = nums[j];
        j++;
        allow = true;
      }
    }
    return nums.length - count;
  }



  public static void main(String[] args) {
    RemoveDuplicateII rm = new RemoveDuplicateII();
    //System.out.println(rm.remove(new int[]{1,2,2,3,4,4,4,5}));
    //System.out.println(rm.removeDup(new int[]{1,2,2,3,4,4,4,5}));
    System.out.println(rm.removeDup(new int[]{1,2,2,3,4,4,4,5}));
  }
}
