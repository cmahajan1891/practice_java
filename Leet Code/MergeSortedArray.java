class MergeSortedArray {
  int[] mergeArray(int []a, int m, int []b, int n) {

    while (m > 0 && n > 0 ) {
      if (a[m-1]>b[n-1]) {
        a[m+n-1] = a[m-1];
        m--;
      }else {
        a[m+n-1] = b[n-1];
        n--;
      }
    }
    while (n>0) {
      a[m+n-1] = b[n-1];
      n--;
    }
    return a;
  }

  public static void main(String[] args) {
    MergeSortedArray m = new MergeSortedArray();
    int []result = m.mergeArray(new int[]{1,2,3,5,6,0,0,0,0}, 5, new int []{8,9,22,55}, 4);
    for (int a : result) {
      System.out.print(a+" ");
    }
  }
}
