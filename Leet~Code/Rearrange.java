import java.util.*;
import java.util.stream.Collectors;

class Rearrange {

  public static void main(String[] args) {
    String s = "mynameischetan";

    HashMap<Character, Integer> freq = new HashMap<>();
    for (char c: s.toCharArray()) {
      if (freq.containsKey(c)) {
        freq.put(c, freq.get(c)+1);
      }else {
        freq.put(c,1);
      }
    }
    List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

    Collections.sort(list, new Comparator<Character>(){
      @Override
      public int compare(Character a, Character b){
          if (freq.get(a) < freq.get(b)) {
            return 1;
          }else if (freq.get(a) > freq.get(b)) {
            return -1;
          }else {
            return a.compareTo(b);
          }
      }
    });

    for (char m : list) {
      System.out.print(m+ " ");
    }

  }
}
