import java.util.*;

class Triangle {
  int minPathSum(List<List<Integer>> l) {
    if (l == null || l.size() == 0) {
      return 0;
    }
    int sum = 0, pos = 0, pos2 = 0;
    for (int i = 0; i < l.size() ; i++) {
      if (i > 0) {
        if (pos - 1 < 0) {
          pos2 = pos + 1;
        }else if (pos + 1 > l.size()) {
          pos2 = pos - 1;
        }//else {
          int tmp = Math.min(l.get(i).get(pos), l.get(i).get(pos2));
          if (tmp == l.get(i).get(pos)) {
            pos = pos;
          }else {
            pos = pos2;
          }
        //}
      }
      sum += l.get(i).get(pos);
      //System.out.println(sum);
    }
    return sum;
  }
  public static void main(String[] args) {
    Triangle t = new Triangle();
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> m = new ArrayList<>();
    m.add(2);

    List<Integer> n = new ArrayList<>();
    n.add(3);
    n.add(4);

    List<Integer> p = new ArrayList<>();
    p.add(6);
    p.add(5);
    p.add(7);

    List<Integer> q = new ArrayList<>();
    q.add(4);
    q.add(1);
    q.add(8);
    q.add(3);

    res.add(m);
    res.add(n);
    res.add(p);
    res.add(q);


    System.out.println(t.minPathSum(res));
  }
}
