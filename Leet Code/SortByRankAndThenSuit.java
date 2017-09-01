class SortByRankAndThenSuit implement Comparator<Card>{
  void sort(List<T> list, Comparator<? super T> c) throws  {

  }
  public int compare(Card f, Card s){
    int compVal = f.getRank().value() - s.getRank().value();
    if (compVal!=0) {
      return compVal;
    }else {
      return f.getSuit().value() - s.getSuit().value();
    }
  }

  public static void main(String[] args) {

  }
}
