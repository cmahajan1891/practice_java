import java.util.*;

class MinimumWindowSubstring {
  String minWindow(String s, String t) {
    if (t.length()>s.length()) {
      return "";
    }
    String res = "";
    Map<Character, Integer> map = new HashMap<>();
    char []ch = t.toCharArray();
    for (char c : ch) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c)+1);
      }else {
        map.put(c, 1);
      }
    }

    int left = 0;
    int minLen = s.length() + 1;
    int count = 0;

    HashMap<Character, Integer> tmap = new HashMap<>();

    for (int i = 0; i < s.length() ; i++) {
      char chr = s.charAt(i);
      if (map.containsKey(chr)) {
        if (tmap.containsKey(chr)) {
          if (tmap.get(chr) < map.get(chr)) {
            count++;
          }
          tmap.put(chr, tmap.get(chr)+1);
        }else {
          tmap.put(chr,1);
          count++;
        }
      }
      if(count == t.length()){
            char sc = s.charAt(left);
            while (!tmap.containsKey(sc) || tmap.get(sc) > map.get(sc)) {
                if (tmap.containsKey(sc) && tmap.get(sc) > map.get(sc))
                    tmap.put(sc, tmap.get(sc) - 1);
                left++;
                sc = s.charAt(left);
            }

            if (i - left + 1 < minLen) {
                res = s.substring(left, i + 1);
                minLen = i - left + 1;
            }
        }
    }
    return res;
  }

  public static void main(String[] args) {
    MinimumWindowSubstring m = new MinimumWindowSubstring();
    System.out.println(m.minWindow("ADOBECODEBANC", "ABC"));
  }
}
