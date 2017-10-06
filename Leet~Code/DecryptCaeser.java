class DecryptCaeser {
  void decrypt(String s) {
    for (int i = 0; i < 26; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < s.length(); j++) {
        char ch = (char)((int)s.charAt(j) - i);
        if ((int)s.charAt(j)-i < 97) {
          ch = (char)(s.charAt(j) + 26 - i);
        }
        if (s.charAt(j)!=' ') {
            sb.append(ch);
        }
      }
      System.out.print(sb.toString());
      System.out.println(" Key: "+ i);
    }
  }

  public static void main(String[] args) {
    DecryptCaeser dc = new DecryptCaeser();
    dc.decrypt("sodlqwhaw wr eh hqfubswhg");
  }
}
