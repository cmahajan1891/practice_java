class AddBinary {
  String addBinary(String fr, String se) {
    if (se == null || se.length()==0) {
      return fr;
    }
    if (fr == null || fr.length()==0) {
      return se;
    }

    int la = fr.length()-1, en = se.length()-1;

    StringBuilder sb = new StringBuilder();
    int carry = 0;

    while (la >= 0 || en >= 0 ) {

      int sum = 0;

      if (en >= 0) {
        sum += Character.getNumericValue(se.charAt(en));
      }
      if (la >= 0) {
        sum += Character.getNumericValue(fr.charAt(la));
      }
      sum = sum + carry;

      if (sum == 3 || sum == 1) {
        sb.append('1');
        carry = 0;
      }
      else if (sum == 2) {
        sb.append('0');
        carry = 1;
      }
  
      la--;
      en--;

    }
    if (carry == 1) {
      sb.append('1');
    }
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    AddBinary a = new AddBinary();
    System.out.println(a.addBinary("11","1"));
  }
}
