class MissingElement {
  // Java Solution MATH
  int findMissingEl(int nums[]) {
    int sum=0;
    for(int i=0; i<nums.length; i++){
        sum+=nums[i];
    }

    int n=nums.length;
    return n*(n+1)/2-sum;
  }

  // Bit Manipulation The concept behind this function is that all the numbers
  // would cancel out each other except the one that is missing, which would be XORed with Zero.
  // Thus returning the same number.
  int findMissingElByBitMan(int nums[]) {
    int miss = 0;
    for (int i = 0; i < nums.length; i++) {

      miss^= i+1^nums[i];
      //System.out.print(i+1^nums[i]);
      //System.out.print(" -- ");
      //System.out.print(miss);
      //System.out.print("--  --");
    }
    return miss;
  }

  public static void main(String[] args) {
    MissingElement el = new MissingElement();
    //System.out.println(el.findMissingEl(new int [] {0,1,2,3,4,5,6,8}));
    System.out.println(el.findMissingElByBitMan(new int [] {0,1,2,3,4,5,6,8}));
  }
}
