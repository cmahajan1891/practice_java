class SearchInRotatedArray {
  boolean search(int nums[], int tar) {
    if (nums == null || nums.length == 0) {
      return false;
    }
    return search(nums, 0, nums.length - 1, tar);
  }
  boolean search(int []nums, int st, int en, int tar){
    if (st > en) {
      return false;
    }
    int mid = (st + en)/2;
    if (nums[mid] == tar) {
      return true;
    }

    if (nums[st] < nums[mid]) {
      if (nums[st] <= tar && nums[mid] > tar) {
        return search(nums, st, mid - 1, tar);
      }else {
        return search(nums, mid + 1, en, tar);
      }

    }
    else if(nums[st] > nums[mid]){
      if (nums[en] >= tar && nums[mid] < tar) {
        return search(nums, mid + 1, en, tar);
      }else{
        return search(nums, st, mid - 1, tar);
      }
    }else{
      return search(nums, ++st, en, tar);
    }
  }

  public static void main(String[] args) {
    SearchInRotatedArray sr = new SearchInRotatedArray();
    System.out.print(sr.search(new int[]{6,7,8,9,2,3,4,5}, 5));
  }
}
