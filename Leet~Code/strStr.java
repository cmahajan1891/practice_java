class strStr {
  int funstrStr(String haystack, String needle) {
    if(needle.length() == 0) return 0;
    if(needle.length()>haystack.length()) return -1;

    for (int i = 0 ; i < haystack.length(); i++) {
      int pos = i;
      for (int j = 0 ; j < needle.length(); ) {
        if (needle.charAt(j) == haystack.charAt(i+j)) {
          j++;
          if (j == needle.length()) {
            return pos;
          }
         if(i+j >= haystack.length() && j<=needle.length()) return -1;
        }else {

        	break;
        }
      }
    }
    return -1;
  }

  int funcStrStr(String haystack, String needle) {
    if (needle == null || haystack == null) {
      return 0;
    }
    int h = haystack.length();
    int n = needle.length();

    if (n > h) {
      return -1;
    }
    if (n == 0) {
      return 0;
    }

    int next[] = getNext(needle);
    int i = 0;

    while (i <= h-n ) {
      int success = 1;
      for (int j = 0 ; j < n ; j++ ) {
        if (needle.charAt(0)!= haystack.charAt(i)) {
          success = 0;
          i++;
          break;
        }else if (needle.charAt(j) != haystack.charAt(i + j)) {
          success = 0;
          i = i + j - next[j - 1];
          break;
        }
      }
      if (success == 1) {
        return i;
      }
    }
    return -1;
  }
  //Calculate the KMP Array.
  int[] getNext(String needle) {
    int next [] = new int [needle.length()];
    next[0] = 0;
    for (int i = 1; i < needle.length(); i++) {
      int index = next[i - 1];
      while (index > 0 && needle.charAt(index) != needle.charAt(i)) {
        index = next[index - 1];
      }
      if (needle.charAt(index) == needle.charAt(i)) {
        next[i] = next[i-1] + 1;
      }else {
        next[i] = 0;
      }
    }
    return next;
  }



  public static void main(String[] args) {
    strStr s = new strStr();
    System.out.print(s.funstrStr("my", "coolmyroom"));
  }
}
