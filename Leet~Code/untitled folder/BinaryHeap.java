// public class BinaryHeap<T extends Comparable<? super T>> {
// 	//construct a binary heap.
// 	public BinaryHeap(){
// 		this(DEFAULT_CAPACITY);
// 	}

// 	public BinaryHeap(int capacity){
// 		currentSize = 0;
// 		A = (T[]) new Comparable[capacity + 1];
// 	}

// 	public BinaryHeap(int [] items){
// 		currentSize = items.length;
// 		A = (T[]) new Comparable[(currentSize + 2)*11/10];
// 		int i = 1;
// 		for ( T item: items ) {
// 			A[i++] = item;
// 			buildHeap();
// 		}
// 	}

// 	//Insert into priotity queue, maintaining heap order. Duplicates are allowed.
// 	public void insert(T x){
// 		if (currentSize == A.length-1) {
// 			enlargeArray(A.length*2+1);
// 		}
// 		int hole = ++ currentSize;
// 		for (;hole>1 && x.compareTo(A[hole/2])<0;hole/=2 ) {
// 			A[hole] = A[hole/2];
// 		}
// 		A[hole] = x;
// 	}

// 	private void enlargeArray(int newSize){
// 		T[] old = A;
// 		A = (T[]) new Comparable[newSize];
// 		for (int i=0; i<old.length ;i++ ) {
// 			A[i] = old[i];
// 		}
// 	}

// 	//Find the smallest item in the Priority Queue
// 	public T findMin(){
// 		if (isEmpty()) {
// 			return null;
// 		}
// 		return A[1];
// 	}

// 	//Remove the smallest element from the priority Queue.
// 	public T deleteMin(){
// 		if (isEmpty()) {
// 			return null;
// 		}
// 		T minItem = findMin();
// 		A[1] = A[currentSize--];
// 		precolateDown(1);
// 		return minItem;
// 	}

// 	//Establish Heap Order property from an arbritary arrangements of items.
// 	private buildHeap(){
// 		for (int i=currentSize/2;i>0 ;i-- ) {
// 			precolateDown(i);
// 		}
// 	}

// 	//Test if the priority queue is logically empty
// 	public isEmpty(){
// 		return currentSize == 0;
// 	}

// 	public void makeEmpty(){
// 		currentSize = 0;
// 	}

// 	private static final int DEFAULT_CAPACITY = 10;

// 	private int currentSize;
// 	private T [] A;

// 	//Internal Method to percolate down in the Heap.
// 	private void precolateDown(int hole){
// 		int child;
// 		T tmp = A[hole];

// 		for (;hole*2<=currentSize ;hole=child ) {
// 			child = hole*2;
// 			if (child!=currentSize && T[child+1].compareTo(T[child])<0) {
// 				child++;
// 			}
// 			if (A[child].compareTo(tmp)<0) {
// 				A[hole] = A[child];
// 			}else {
// 				break;
// 			}
// 			A[hole] = tmp;
// 		}
// 	}

// 	public static void main(String [] args){
// 		int numItems = 10000;
// 		BinaryHeap<Integer> h = new BinaryHeap<Integer>();
// 		int i = 37;

// 		for (;i!=0 ; i=(i+37)%numItems) {
// 			h.insert(i);
// 		}
// 		for (i=1;i<numItems ;i++ ) {
// 			if (h.deleteMin()!=i) {
// 				System.out.println("Oops! "+i);
// 			}
// 		}
// 	}
// }



public class BinaryHeap{
	public int[] array;
	public int count;
	public int capacity;
	public int heap_type;

	public BinaryHeap(int capacity, int heap_type){
		this.heap_type = heap_type;
		this.count = 0;
		this.capacity = capacity;
		this.array = new int[capacity];
	}

	public int parent(int i){
		if (i<=0 || i>=this.count) {
			return -1;
		}
		return i-1/2;
	}

	public int leftChild(int i){
		int left = 2 * i +1;
		if (left>=this.count) {
			return -1;
		}
		return left;
	}

	public int rightChild(int i){
		int right = 2*i +2;
		if (right>=this.count) {
			return -1;
		}
		return right;
	}

	public int getMax(){
		if (this.count == 0) {
			return -1;
		}
		return this.array[0];
	}

	//Heapifying the element percolate down
	public void precolateDown(int i){
		int l,r, max, tmp;
		l=leftChild(i);
		r=rightChild(i);
		if (l!=-1 && this..array[l]>this.array[i]) {
			max = l;
		}
		else {
			max=i;
		}
		if (r!=-1 && this.array[r]>this.array[max]) {
			max = r;
		}
		if (max!=i) {//swap this.array[i] and this.array[max]
			tmp = this.array[i];
			this.array[i] = this.array[max];
			this.array[max] = tmp;
		}
		precolateDown(max);
	}

	int deleteMax(){
		if (this.count==0) {
			return -1;
		}
		int data = this.array[0];
		this.array[0] = this.array[this.count-1];
		this.count--;
		precolateDown(0);
		return data;
	}

	public int insert(int data){
		int i;
		if (this.count==this.capacity) {
			resizeHeap();
		}
		this.count++;
		i=this.count-1;
		while (i>=0 && data > this.array[(i-1)/2]) {
			this.array[i] = this.array[(i-1)/2];
			i=(i-1)/2;
		}
		this.array[i] = data;
	}

	public void resizeHeap(){
		int arrr_old = new int[this.capacity];
		System.arraycopy(this.array, 0, arrr_old, this.count-1);
		this.array = new int [this.capacity*2];
		if (this.array==null) {
		 	System.out.println("Memory Error");
		 	return;
		 }

		 for (int i=0; i < this.capacity; i++) {
		  	this.array[i] = arrr_old[i];
		  } 
		  this.capacity*=2;
		  arrr_old = null;
	}

	public void destroyHeap(){
		this.count = 0;
		this.array = null;
	}

	public void buildHeap(BinaryHeap h, int[] A, int n){
		if (h==null) {
			return;
		}
		while (n>this.capacity) {
			h.resizeHeap();
		}
		for (int i=0;i<n ;i++ ) {
			h.array[i] = A[i];
		}
		this.count=n;
		for (int i=(n-1)/2;i>=0 ;i-- ) {
			h.precolateDown(i);
		}
	}

	public void HeapSort(int []A, int n){
		BinaryHeap h = new BinaryHeap(n,0);
		
	}
}