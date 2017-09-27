class SearchRange {
  int[] findRange(int p[], int target) {
    int res[] = new int[2];
    int start = -1, end = -1;

    for (int i = 0, j = p.length - 1; i < p.length && j >= 0;) {
        if (p[i]==target) {
          start = i;
        }
        if (p[j]==target) {
          end = j;
        }
        if (start!=-1 && end!= -1 || i > j) {
          if (i>j) {
            return new int[]{-1,-1};
          }else {
            return new int[]{start, end};
          }
        }
        if (start == -1) i++;
        if (end == -1) j--;
    }
    return new int [] {-1,-1};
  }

  public static void main(String[] args) {
    SearchRange s = new SearchRange();
    int [] f = s.findRange(new int[]{1,5,3,6,2,2,2}, 2);
    System.out.print("start: "+ f[0] + " end: " + f[1]);
  }
}
