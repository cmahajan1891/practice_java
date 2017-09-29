class ReverseAnInt {
  //Not an optimized solution failing test cases.
  // int reverse(int n) {
  //   StringBuilder sb = new StringBuilder();
  //   while (n != 0) {
  //     int tmp = n%10;
  //     sb.append(tmp);
  //     n = n / 10;
  //   }
  //   return Integer.valueOf(sb.toString());
  // }

  int reverse(int n) {
    int number = 0;
    int rev = 0;
    if (n%10 == 0) {
      return n;
    }
    while (n!=0) {
      rev = n % 10;
      if (number > Integer.MAX_VALUE/10 || number < Integer.MIN_VALUE/10) {
        return 0;
      }
    number = number * 10 + rev;
    n = n/10;
    }
    return number;
  }

  public static void main(String[] args) {
    ReverseAnInt r = new ReverseAnInt();
    System.out.print(r.reverse(1091));
  }
}
