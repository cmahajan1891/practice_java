import java.util.*;

class InsertInterval {
  ArrayList<Interval> insert(ArrayList<Interval> a, Interval i) {
    ArrayList<Interval> result = new ArrayList<>();
    if (i == null) {
      return a;
    }

    //Best way to use the if else statements. Always use the conditions that are corner conditions first in the if/else if clause and the remaining conditions in the else clause...

    Interval prev = i;
    for (int k = 0; k < a.size(); k++ ) {
      Interval curr = a.get(k);
      // if ((prev.start<curr.start && (prev.end>curr.start && prev.end<curr.end))
      // || ((prev.start>curr.start && prev.start<curr.end) && prev.end>curr.end)
      // || (prev.start < curr.start && prev.end > curr.end )) {
      //   Interval merge = new Interval(Math.min(prev.start, curr.start), Math.max(curr.end, prev.end));
      //   prev = merge;
      // }
      // else if((prev.start < curr.start && prev.end > curr.end)
      // || (prev.start > curr.end) || (prev.end<curr.start)) {
      //
      // }
      // else{
      //   result.add(prev);
      //   prev = curr;
      // }

      if (prev.start > curr.end) {
        result.add(curr);
      }
      else if (prev.end<curr.start) {
        result.add(prev);
        prev = curr;
      }
      else{
        Interval merge = new Interval(Math.min(prev.start, curr.start), Math.max(curr.end, prev.end));
        prev = merge;
      }
    }
    result.add(prev);
    return result;
  }

  void printAll(List<Interval> l) {
    for ( Interval x : l) {
      System.out.println("Start: "+ x.start + " end: "+ x.end);
    }
  }

    public static void main(String[] args) {
      InsertInterval i = new InsertInterval();
      ArrayList<Interval> list = new ArrayList<>();
      // list.add(new Interval(1,2));
      // list.add(new Interval(3,5));
      // list.add(new Interval(6,7));
      // list.add(new Interval(8,10));
      // list.add(new Interval(12,16));
      // Interval n = new Interval(4,9);
      list.add(new Interval(1,3));
      list.add(new Interval(6,9));
      Interval n = new Interval(2,5);

      list = i.insert(list, n);
      i.printAll(list);
    }
}
