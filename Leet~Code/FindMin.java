class FindMin {
  int findMin(int p[], int target) {
    if (p == null || p.length == 0) {
      return Integer.MAX_VALUE;
    }

    int start = 0;
    int end = p.length - 1;
    return findMin(p, start, end, target);
  }

  int findMin(int nums[], int st, int en, int target) {
    int mid = st + (en - st)/2;
    int min = Integer.MAX_VALUE;
    if (st > en) {
      return min;
    }
    if (nums[mid] == target) {
      return mid;
    }
    if (nums[mid] > target && nums[mid] > nums[mid - 1] ||
    nums[mid] < target && nums[mid] < nums[mid - 1]) {
      return findMin(nums, st, mid - 1, target);
    }else if (nums[mid] > target && nums[mid] < nums[mid - 1] ||
    nums[mid] < target && nums[mid] > nums[mid - 1]) {
      return findMin(nums, mid + 1, en, target);
    }
    return min;
  }
  public static void main(String[] args) {
    FindMin f = new FindMin();
    System.out.print(f.findMin(new int []{5,3,2,1,4,5,6,7,8,9}, 3));
  }

}
