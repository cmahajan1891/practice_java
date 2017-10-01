class MultiplyTwoInteger {
  int multiply(int x, int y) {
    if (y == 0) {
      return 0;
    }
    else if (y > 0 && x > 0 || x < 0 && y < 0) {
      return x + multiply(x, y - 1);
    }
    else if (x < 0 && y > 0 || y < 0 && x > 0) {
      return -1 * (Math.abs(x) + multiply(Math.abs(x), Math.abs(y) - 1));
    }
    return -1;
  }

  public static void main(String[] args) {
    MultiplyTwoInteger m = new MultiplyTwoInteger();
    System.out.print(m.multiply(-3, 5));
  }
}
