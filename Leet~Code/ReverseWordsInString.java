class ReverseWordsInString {
  public static String reverseWords(String s) {
    s = s.trim();
    if(s == null || s.length() == 0) return s;

    s = s.replaceAll("\\s+"," ");
    String [] ar = s.split("\\s+");
    StringBuilder str = new StringBuilder();
    ar = reverseString(ar, 0, ar.length-1);
    int cnt = 0;
    for (String st: ar) {
      str.append(st);
      if (cnt < ar.length-1)
      str.append(" ");
      cnt++;
    }
    return str.toString();
  }
  public static String [] reverseString(String[] arr, int start, int end){
    for (int i = start, j = end; i <= start + (end - start)/2 && j >= start; i++, j--) {
      String tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
    }
    return arr;
  }

  public static void main(String[] args) {
    ReverseWordsInString.reverseWords("the sky is blue");
  }
}
