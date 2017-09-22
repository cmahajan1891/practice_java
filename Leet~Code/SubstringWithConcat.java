import java.util.*;

class SubstringWithConcat {
  List<Integer> findSubstring(String s, String[] words) {

    List<Integer> list = new ArrayList<>();
    if (s == null || s.length() == 0 || words == null || words.length == 0) {
      return list;
    }

    HashMap<String, Integer> map = new HashMap<>();
    for (String str : words) {
      if (!map.containsKey(str)) {
        map.put(str,1);
      }else {
        map.put(s, map.get(str)+1);
      }
    }

    int ln = words[0].length();


    for (int i = 0; i < ln ; i++) {

        int start = i;
        int count = 0;

        HashMap<String, Integer> tmap = new HashMap<>();

        for (int j = i; j <= s.length()-ln ; j=j+ln) {
          String tmp = s.substring(j, j + ln);
          if (map.containsKey(tmp)) {
            if (tmap.containsKey(tmp)) {
              tmap.put(tmp, tmap.get(tmp) + 1);
            }else {
              tmap.put(tmp, 1);
            }
            count++;
            while (tmap.get(tmp) > map.get(tmp)) {
              String left = s.substring(start, start+ln);
              tmap.put(left, tmap.get(left)-1);
              count--;
              start = start + ln;
            }
            if (count == words.length) {
              list.add(start);
              String left = s.substring(start, start+ln);
              tmap.put(left, tmap.get(left)-1);
              count--;
              start = start + ln;
            }
          }else {
            tmap.clear();
            start = j + ln;
            count = 0;
          }
        }
    }
    return list;
  }

  public static void main(String[] args) {
    SubstringWithConcat sc = new SubstringWithConcat();
    System.out.println(sc.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"}));
  }
}
