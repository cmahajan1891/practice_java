class FindMinRotated {
  int findMin(int p[]) {
    int start = 0;
    int end = p.length - 1;
    return findMin(start,end,p);
  }

  int findMin(int start, int end, int[]arr){
    if (start>end) {
      return -1;
    }
    if (start == end) {
      return arr[start];
    }
    if (end - start == 1) {
      return Math.min(arr[start], arr[end]);
    }
    int mid = start + (end - start)/2;
    if (arr[start]<arr[end]) {
      return arr[start];
    }
    else if (arr[mid] < arr[start]) {
      return findMin(start, mid, arr);
    }else {
      return findMin(mid, end, arr);
    }
  }

  public static void main(String[] args) {
    FindMinRotated fm = new FindMinRotated();
    System.out.print(fm.findMin(new int[]{4,5,6,7,0,1,2,3}));
  }
}
