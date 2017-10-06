class MinStack {
  int top ;
  int min ;
  int nums[];
  int size , capacity ;
  MinStack(int capacity){
    top = -1;
    min = Integer.MAX_VALUE ;
    capacity = capacity;
    nums = new int [capacity];
    size = 0;
  }

  int size() {
    return size;
  }

  void push(int num) {
    if (size() == capacity - 1) {
      //TODO Implement reSize
      //reSize();
    }
      top = top + 1;
      nums[top] = num;
      size++;
      if (findMin()>num) {
        min = num;
      }
  }

  int findMin() {
    if (top == -1) {
      return Integer.MAX_VALUE;
    }
    return min;
  }

  void pop() throws Exception{
    if (top == -1) {
      throw new Exception("Nothing to be Removed. Stack is Empty.");
    }
    calculateNewMin(top-1);
    top = top - 1;
    size = size - 1;
  }

  void calculateNewMin(int stop){
    int newMin = Integer.MAX_VALUE;
    for (int i = 0; i <= stop; i++) {
      if (newMin > nums[i]) {
        newMin = nums[i];
      }
    }
    min = newMin;
  }

  public static void main(String[] args) {
    try {
      MinStack m = new MinStack(10);
      m.push(20);
      m.push(10);
      System.out.println("Min " + m.findMin()); // Should print 10
      System.out.println("Size " + m.size());   // Should print 2
      m.pop();
      System.out.println("Min " + m.findMin()); // Shoud print 20
      m.push(5);
      System.out.println("Min " + m.findMin()); // Shoud print 5
      m.pop();
      m.pop();
      m.pop();
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
