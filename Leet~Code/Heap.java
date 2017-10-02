class Heap {

  int [] array;
  int count;
  int capacity;
  int heap_type;

  public Heap(int capacity, int heap_type){
    this.heap_type = heap_type;
    this.count = 0;
    this.capacity = capacity;
    this.array = new int[capacity];
  }

  int parent(int j){
    if (j <= 0 || j >= this.count) {
      return -1;
    }
    return j-1/2;
  }
  int leftChild(int j){
    int left = 2 * j + 1;
    if (left >= this.count) {
      return -1;
    }
    return left;
  }
  int rightChild(int j){
    int right = 2 * j + 2;
    if (right >= this.count) {
      return -1;
    }
    return right;
  }

  int getMaximum(){
    if (this.count == 0) {
      return -1;
    }
    return this.array[0];
  }
  int percolateDown(int j){
      int l, r, max, temp;
      l = leftChild(j);
      r = rightChild(j);
      if (l!=-1 && this.array[l] > this.array[j]) {
        max = l;
      }
      else{
        max = j;
      }
      if (r!=-1 && this.array[r] > this.array[max]) {
        max = r;
      }
      if (max!=j) {
        temp = this.array[j];
        array[j] = array[max];
        array[max] = temp;
      }
      percolateDown(max);
  }

  int deleteMax(){
    if (this.count == 0) {
      return -1;
    }
    int data = this.array[0];
    this.array[0] = this.array[this.count - 1];
    this.count--;
    percolateDown(0);
    return data;
  }

  int insert(int data) {
    int j;
    if (this.count == this.capacity) {
      resizeHeap();
    }
    this.count++;
    j = this.count - 1;
    while(j >= 0 && data > this.array[(j-1)/2]){
      this.array[j] = this.array[(j-1)/2];
      j = (j-1)/2;
    }
    this.array[j] = data;
  }

  void resizeHeap(){
    int []arr_old = new int[this.capacity];
    System.arraycopy(this.array, 0, arr_old, this.count-1);
    //System.arraycopy(Object, int, Object, int, int)
    this.array = new int[this.capacity*2];
    if (this.array == null) {
      System.out.print("Memory Error");
      return ;
    }
    for (int i = 0; i < this.capacity ; i++) {
      this.array[i] = arr_old[i];
    }
    this.capacity*=2;
    arr_old=null;
  }

  void destroyHeap(){
    this.count = 0;
    this.array = null;
  }

  public static void main(String[] args) {

  }
}
