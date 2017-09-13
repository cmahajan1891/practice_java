class Atoi {
    int convertToInt(String s) {

      if (s == null || s.length() == 0) {
        return 0;
      }
      char flag = '-';
      s.trim();
      int i = 0;
      double result = 0;

      if (s.charAt(0) == '-') {
        i++;
      }
      else if (s.charAt(0) == '+') {
        flag = '+';
        i++;
      }
      while (s.length()>i && s.charAt(i)>='0' && s.charAt(i)<='9') {
        result = result*10 + (s.charAt(i)-'0');
        i++;
      }
      if (flag == '-') {
        result = -result;
      }
      if (result > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (result < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int) result;
    }

    public static void main(String[] args) {
      Atoi a = new Atoi();
      System.out.println(a.convertToInt("-2147483648"));
    }
}
