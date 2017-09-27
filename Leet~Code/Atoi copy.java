class Atoi {
    int convertToInt(String s) {
      if (s == null || s.length == 0) {
        return Integer.MAX_VALUE;
      }
      boolean neg = false;

      s = s.trim();
      if (s.indexOf('-') == 1) {
          neg = true;
      }
      int digits = 0;
      int number = 0;

      char[] c = s.toCharArray();
      for (int i = 0; i < c.length ; i++) {
        if (c[i]!=' ' && Character.isDigit(c[i])) {
          int tmp = Character.getNumericValue(c[i]);
          int mul = Math.pow(10, digits++);
          number += tmp * mul;
        }else {
          continue;
        }
      }
      if (neg) {
        return number * (-1);
      }
      return number;
    }

    public static void main(String[] args) {
      Atoi a = new Atoi();
      System.out.println(a.convertToInt("-242sds  83745"));
    }
}
