class LengthOfLastWord {

  int findLength(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }

    int length = s.length();
    int start = 0;
    boolean flag = false;

    for (int i = length - 1; i >= 0 ; i--) {
      if (Character.isLetter(s.charAt(i))) {
        flag = true;
        start ++;
      }
      if (flag) {
        return start;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    LengthOfLastWord l = new LengthOfLastWord();
    System.out.println(l.findLength("Hey its Me  "));
  }
}
