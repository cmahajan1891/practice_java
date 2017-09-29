class BinarySearch {
   int search(int [] p, int start, int end, int target) {
    int mid = start + (end - start)/2;
    if (start > end) {
      return Integer.MAX_VALUE;
    }
    if (p[mid] == target) {
      return mid;
    }
    if (p[mid]>target) {
      return search(p, start, mid - 1, target);
    }else{
      return search(p, mid + 1, end, target);
    }
  }

  public static void main(String[] args) {
    BinarySearch bn = new BinarySearch();
    System.out.print(bn.search(new int[]{1,2,3,4,5,6}, 0, 5, 190));
  }
}
