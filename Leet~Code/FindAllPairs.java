import java.util.*;

class FindAllPairs {
  void findPairs(int p[], int target) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < p.length; i++) {
        if(set.contains(p[i])){
          int sec = target - p[i];
          System.out.println("First: "+ sec + " Second: " + p[i]);
        }else {
          set.add(target-p[i]);
        }
    }

  }

  public static void main(String[] args) {
    FindAllPairs f = new FindAllPairs();
    f.findPairs(new int[]{0,4,3,4,5,6,8},8);
  }
}
