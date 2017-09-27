import java.util.*;

class Interval{
  int start , end;
  public Interval (int start, int end){
    this.start = start;
    this.end = end;
  }
}

class MergeIntervals {
  public List<Interval> merge(List<Interval> a){
    List<Interval> result = new ArrayList<Interval>();

    if (a == null || a.size() == 0) {
      return result;
    }

    //Implementing the Comparator Interface to Change the way elements are sorted in the given Collection.
    Collections.sort(a, new Comparator<Interval>(){
      public int compare(Interval i, Interval j){
        if (i.start != j.start) {
          return i.start - j.start;
        }else {
          return i.end - j.end;
        }
      }
    });

    Interval pre = a.get(0);
    for (int k = 0; k < a.size(); k++) {
      Interval curr = a.get(k);
      if (curr.start > pre.end) {
        result.add(pre);
        pre = curr;
      }else {
        Interval tmp = new Interval(pre.start, Math.max(pre.end, curr.end));
        pre = tmp;
      }
    }
    result.add(pre);
    return result;
  }

  void printAll(List<Interval> l) {
    for ( Interval x : l) {
      System.out.println("Start: "+ x.start + " end: "+ x.end);
    }
  }


  public static void main(String[] args) {
    MergeIntervals m = new MergeIntervals();
    List<Interval> list = new ArrayList<>();
    list.add(new Interval(1,3));
    list.add(new Interval(2,6));
    list.add(new Interval(8,10));
    list.add(new Interval(15,18));
    list = m.merge(list);
    m.printAll(list);
  }
}
