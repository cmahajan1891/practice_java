
class ZigZagConversion {
  String convert(String s, int n) {
    if (s == null || s.length() < n) {
      return s;
    }
    int sh = 2 * n - 2;

    StringBuilder sb = new StringBuilder();
    for (int k = 0; k < n ; k ++ ) {
      if ( k == 0 || k == n - 1) {
        for (int j = k; j < s.length() ; j = j + sh ) {
          sb.append(s.charAt(j));
        }
      }else {
        int j = k;
        boolean flag = true;

        int step1 = 2 * (n - 1 - k);
        int step2 = sh - step1;

        while (j < s.length()) {
          sb.append(s.charAt(j));
          if (flag)
            j = j + step1;
          else
            j = j + step2;
          flag = !flag;
        }
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    ZigZagConversion z = new ZigZagConversion();
    System.out.println(z.convert("PAYPALISHIRING", 3));
  }
}
