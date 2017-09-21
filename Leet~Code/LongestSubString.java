import java.util.*;

class LongestSubString {
  int longest(String s, int k) {
    // if (s == null || s.length() == 0) {
    //   return 0;
    // }
    HashMap<Character, Integer> map = new HashMap<>();
    int i = 0, res = 0, start = 0;

    char[] ch = s.toCharArray();
    while (i < s.length()) {

      if (!map.containsKey(ch[i])) {
        map.put(ch[i],1);
      }else {
        map.put(ch[i], map.get(ch[i])+1);
      }


      if (map.size()>k) {
        res = Math.max(res, i - start);
        while (map.size()>k) {
          char t = ch[start];
          int count = map.get(ch[i]);
          if (count > 1) {
            map.put(t, count-1);
          }else {
            map.remove(t);
          }
          start++;
        }
      }
      i++;
    }
    res = Math.max(res, s.length() - start);
    return res;
  }

  public static void main(String[] args) {
    LongestSubString l = new LongestSubString();
    System.out.println(l.longest("cdcdcdcdcdjgkfkfkfkfd",2));
  }
}
