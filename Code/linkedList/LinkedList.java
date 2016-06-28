package linkedList;
public class LinkedList<T extends Comparable<T>> {
	// this class should be private
	private class Node {
		T data;
		Node next;
		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
		public int compareTo(Node other){
			return this.data.compareTo(other.data);
		}
		public int comparable(Node other){
			return this.data.compareTo(other.data);
		}
	}
	private int size;
	private Node head;
	private Node tail;
	public LinkedList() {
		this(null, null, 0);
	}
	private LinkedList(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.size() == 0;
	}
	public T getFirst() {
		if (this.isEmpty()) {
			throw new RuntimeException("The list is empty");
		}
		return this.head.data;
	}
	public T getLast() {
		if (this.isEmpty()) {
			throw new RuntimeException("The list is empty");
		}
		return this.tail.data;
	}
	public T midPointElement() {
		return this.midPointNode().data;
	}
	public T getElementAt(int idx) {
		return this.getNodeAt(idx).data;
	}
	private Node getNodeAt(int idx) {
		if (this.isEmpty()) {
			throw new RuntimeException("The list is empty");
		}
		if (idx < 0 || idx >= this.size()) {
			throw new RuntimeException("Argument is invalid");
		}
		if (idx == 0) {
			return this.head;
		} else if (idx == this.size() - 1) {
			return this.tail;
		} else {
			int counter = 0;
			Node temp = this.head;
			while (counter < idx) {
				counter++;
				temp = temp.next;
			}
			return temp;
		}
	}
	public void addFirst(T data) {
		Node newNode = new Node(data, this.head);
		this.head = newNode;
		if (this.isEmpty()) {
			this.tail = this.head;
		}
		this.size++;
	}
	public void addLast(T data) {
		Node newNode = new Node(data, null);
		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.size++;
	}
	public void addAt(T data, int idx) {
		if (idx < 0 || idx > this.size()) {
			throw new RuntimeException("Invalid argument");
		}
		if (idx == 0) {
			this.addFirst(data);
		} else if (idx == this.size()) {
			this.addLast(data);
		} else {
			Node nM1 = this.getNodeAt(idx - 1);
			Node newNode = new Node(data, nM1.next);
			nM1.next = newNode;
			this.size++;
		}
	}
	public T removeFirst() {
		if (this.isEmpty()) {
			throw new RuntimeException("The list is empty");
		}
		T retVal = this.head.data;
		if (this.size() == 1) {
			this.head = this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return retVal;
	}
	public T removeAt(int idx){
		if(this.isEmpty()){
			throw new RuntimeException("The list is empty");
		}
		if(idx < 0 || idx >= this.size()){
			throw new RuntimeException("Invalid argument.");
		}
		if(idx == 0){
			return this.removeFirst();
		}
		else{
			Node nM1 = this.getNodeAt(idx - 1);
			T retVal = nM1.next.data;
			nM1.next = nM1.next.next;
			// removing last element
			if(idx == this.size() - 1){
				this.tail = nM1;
			}
			this.size--;		
			return retVal;
		}
	}
	public String toString() {
		String retVal = "";
		Node temp = this.head;
		while (temp != null) {
			retVal += temp.data + ", ";
			temp = temp.next;
		}
		retVal += "END";
		return retVal;
	}
	public void display() {
		System.out.println(this);
	}
	public void swapTwoElement(int one,int two){
		T tempOne = getElementAt(one);
		T tempTwo = getElementAt(two);
		removeAt(one);
		addAt(tempTwo, one);
		removeAt(two);
		addAt(tempOne, two);
	}
	public void removeDub (){
			T prev;
			T next;
			int count = 0;
//			System.out.println(getElementAt(count) +","+ getLast());
			while (getElementAt(count) != getLast()){
				prev = getElementAt(count);
//				System.out.println(prev); // shows the intermediate steps try it !!!
				next = getElementAt(count + 1);
//				System.out.println(next); // shows the intermediate steps try it !!!
				if (prev == next){
					removeAt(count + 1);
				}
//				display(); // shows the intermediate steps try it !!!
				count++;
		}
	}
	public void mergeSort(){
		LinkedList<T> sorted = this.mergeSortHelper();
//		this = sorted;
		this.head = sorted.head;
		this.tail = sorted.tail;
		this.size = sorted.size;
	}
	private Node midPointNode() {
		Node slow = this.head, fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
	private LinkedList<T> mergeSortHelper(){
		if(this.size() == 1){
			return this;
		}
		
		Node mid = this.midPointNode();
		Node midNext = mid.next;
		
		mid.next = null;
		
		LinkedList<T> fHalf = null, sHalf = null;
		fHalf = new LinkedList<>(this.head, mid, (this.size() + 1)/ 2);
		sHalf = new LinkedList<>(midNext, this.tail, this.size() / 2);
		
		fHalf = fHalf.mergeSortHelper();
		sHalf = sHalf.mergeSortHelper();
		
		LinkedList<T> sorted = fHalf.mergeTwoSortedLists(sHalf);
		return sorted;
	}
	public LinkedList<T> mergeTwoSortedLists(LinkedList<T> other){
		LinkedList<T> retVal = new LinkedList<T>();
		Node thisTemp = this.head, otherTemp = other.head;
		
		while(thisTemp != null && otherTemp != null){
			if(thisTemp.compareTo(otherTemp) <= 0){
				retVal.addLast(thisTemp.data);
				thisTemp = thisTemp.next;
			}
			else{
				retVal.addLast(otherTemp.data);
				otherTemp = otherTemp.next;
			}
		}
		
		while(thisTemp != null){
			retVal.addLast(thisTemp.data);
			thisTemp = thisTemp.next;
		}
		
		while(otherTemp != null){
			retVal.addLast(otherTemp.data);
			otherTemp = otherTemp.next;
		}
		
		return retVal;
	}
	public T kthElementFromEnd(int k) {
		if (k <= 0 || k > this.size()) {
			throw new RuntimeException("Invalid argument");
		}

		Node slow = this.head, fast = this.head;

		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}
	public LinkedList<Integer> merge2to1 (LinkedList<Integer> one,LinkedList<Integer> two){
		LinkedList<Integer> result = new LinkedList<>();
		int i = 0,j = 0,k = 0;
		while (one.getElementAt(i) != one.getLast() && two.getElementAt(j) != two.getLast()){
			if(one.getElementAt(i) <= two.getElementAt(j)){
				int temp = one.getElementAt(i);
				result.addLast(temp);
				i++;				
				k++;
			}else if(one.getElementAt(i) >= two.getElementAt(j)){
				int temp = two.getElementAt(j);
				result.addLast(temp);
				j++;				
				k++;
			}
		}
		while (one.getElementAt(i) != one.getLast()){
			int temp = one.getElementAt(i);
			result.addLast(temp);
			i++;				
			k++;
		}
		while (two.getElementAt(j) != two.getLast()){
			int temp = two.getElementAt(j);
			result.addLast(temp);
			j++;				
			k++;
		}
		return result;
	}
	public void checkPalindrome (){
		int one ;int two ;
		int count = 0;
//		while (count < this.tail){
//			
//		}
//		Node first = new Node(data,next);
//		Node last = new Node(data,next);
	}
	public void midPoint (){
		int fast = 0;
		int slow = 0;
		Node aslow = this.head;
		Node afast = this.head;
		while (afast != null){
			fast = fast + 2;
			slow  = slow + 1;
			aslow = aslow.next;
			afast = afast.next.next;
		}
		System.out.println(getElementAt(slow));
	}
	public void fiveFromLast(){
		int fast = 5;
		int slow = 0;
		Node aslow = this.head;
		Node afast = this.head.next.next.next.next.next;
		while (afast != null){
			fast = fast + 1;
			slow  = slow + 1;
			aslow = aslow.next;
			afast = afast.next;
		}
		System.out.println(getElementAt(slow));
	}
	// reverse iterative  with swap first and last
	// reverse recursive with swap first and last
	// reverse iterative  with pointer 1>2>3 to 1<2<3
	//reverse recursive with pointer 1>2>3 to 1<2<3
	public void reverseIterativeSwap (){
		int idx = size();
		int count = 0;
		Node one = null;
		Node two = null;
		while (count < idx/2){
			one = getNodeAt(count);
			two = getNodeAt(idx - count - 1);
			T temp = one.data;
			one.data  = two.data;
			two.data  = temp;
			count++;
		}
	}
	public T find (int index, T find){
		if (index == 1){
			return getNodeAt(1).data;
		}
		int j = size();
		find(j - 1,find);
		T ans = getElementAt(j - 1);
		if (ans == find){
			System.out.println(ans);
		}
		return ans;
	}
	public int findElement(T data) {
		return this.findElement(this.head, data, 0);
	}
	private int findElement(Node temp, T data, int idx) {
		if (temp == null) {
			return -1;
		}

		if (temp.data.equals(data)) {
			return idx;
		} else {
			return findElement(temp.next, data, idx + 1);
		}
	}
	public void reverse_D_R() {
		Node tHead = this.head;
		this.reverse_D_R(this.head, 0);
		this.head = tHead;
	}
	private void reverse_D_R(Node temp, int idx) {
		if (temp == null) {
			return;
		}

		reverse_D_R(temp.next, idx + 1);

		if (idx >= this.size() / 2) {
			T hData = this.head.data;
			this.head.data = temp.data;
			temp.data = hData;

			this.head = this.head.next;
		}
	}
	// not working try better for next two function
	public void reverseIterativePointer (Node temp,int low,int tellme){//tell me 0
		int size = size();
		if (tellme <size/2){
			T data = temp.data;
			temp =temp.next;
			reverseIterativePointer (temp,low + 1,tellme);
			int i = 0;
			i++;
			T ele = getElementAt(i);
			T dnd = data;
			data = ele;
			ele = dnd;
			this.head = this.head.next;
		}
		System.out.println();
	}
	public void reverseRecursivePointer(){
		
	}
	public void bubbleSort(LinkedList<Integer> temp){
		int j = 0;
		while (temp.getElementAt(j) != temp.getLast()){
			int i = 0;
			while (temp.getElementAt(i) != temp.getLast()){
				if (temp.getElementAt(i) > temp.getElementAt(i + 1)){
					LinkedList<Integer>.Node one = temp.getNodeAt(i);
					LinkedList<Integer>.Node two = temp.getNodeAt(i + 1);
					int main = one.data;
					one.data = two.data;
					two.data = main;
				}
				i++;
			}
			j++;
		}
	}
	public void bubbleSort(){
		int counter = 1;
		while(counter <= this.size - 1){
			Node temp = this.head;
			for(int i = 0; i < this.size() - counter; i++){
				if(temp.compareTo(temp.next) > 0){
					T tData = temp.data;
					temp.data = temp.next.data;
					temp.next.data = tData;
				}
				temp = temp.next;
			}
			counter = counter + 1;
		}
	}
	public void selectionSort (LinkedList<Integer> temp){
//		temp.addLast(0);
//		temp.addLast(0); // using during previous bubble sort also 
		int j = 0;
		Node test = this.head;
		while (test != null){
			Node next = test.next;
			int i = j + 1;
			while (next != null){
				if (temp.getElementAt(j) > temp.getElementAt(i)){
					LinkedList<Integer>.Node one = temp.getNodeAt(i);
					LinkedList<Integer>.Node two = temp.getNodeAt(j);
					int main = one.data;
					one.data = two.data;
					two.data = main;
				}
				next = next.next;
				i++;
			}
			test = test.next;
			j++;
		}
	}
	public void insertionSort (LinkedList<Integer> temp){
		int i = 1;
		Node first = head.next;
		while (first != null){
			int j = i;
			Node second = first;
			while (second != head){
				if (temp.getElementAt(j - 1) > temp.getElementAt(j)){
					LinkedList<Integer>.Node one = temp.getNodeAt(j - 1);
					LinkedList<Integer>.Node two = temp.getNodeAt(j);
					int main = one.data;
					one.data = two.data;
					two.data = main;
				}
				Node important = head; // very important node
				while (important.next != second){
					important = important.next;
				}
				second = important;// previous
				j--;
			}
			first = first.next;
			i++;
		}
	}
	public boolean isPalindrome (LinkedList<Integer> temp){
		int i = 0; // add one more else if statement for 1 2 3 1 = false
		int size = size() - 1;
		Node first = head.next;
		while (first != null && first.next != null){
			LinkedList<Integer>.Node one = temp.getNodeAt(i);
			LinkedList<Integer>.Node two = temp.getNodeAt(size - i);
			if (one.data != two.data){
				return false;
			}
			first = first.next.next;
			i++;
		}
		return true;
	}
	public void arrangeOddThenEven (LinkedList<Integer> temp){
		LinkedList<Integer> first = new LinkedList<>();
		LinkedList<Integer> second = new LinkedList<>();
		for (int i = 0;i < size();i++){
			int tap = temp.getElementAt(i);
			if (tap % 2 == 1){
				first.addLast(tap);
			}else{
				second.addLast(tap);
			}
		}
//		System.out.println(first);
//		System.out.println(second);
		LinkedList<Integer> origin = new LinkedList<>();
		int j = 0;
		Node forj = head.next;
		while(forj != null){
			int a = first.getElementAt(j);
//			System.out.println(a);
			origin.addLast(a);
			forj = forj.next;
			j++;
		}
		int k = 0;
		Node fork = head.next;
		while (fork != null){
			int b = second.getElementAt(k);
			origin.addLast(b);
			forj = forj.next;
			k++;
		}
		temp = origin;
	}
	public void printReverse (LinkedList<Integer> temp){
		for (int i = size() - 1;i >= 0;i--){
			Node a = (LinkedList<T>.Node) temp.getNodeAt(i);
			System.out.print(a.data + " ,");
		}
	}
	public void appendLastN (LinkedList<Integer> temp,int n){
		// r 1→ 2→ 3 → 4 → 5 → 6→ null and n = 2 return 5→ 6→ 1→ 2→ 3 → 4 → null 
		int upto = size() - n;
		LinkedList<Integer> till = new LinkedList<>();
		int k = 0;
		for (int i = 0;i < upto;i++){
			till.addLast(temp.getElementAt(k));
			k++;
		}
		System.out.println(till);
		LinkedList<Integer> now = new LinkedList<>();
		for (int i = 0;i < n;i++){
			now.addLast(temp.getElementAt(k));
			k++;
		}
		System.out.println(now);
		temp = null;
		temp = now;
		System.out.println(temp);
		for (int i = 0;i < upto;i++){
			temp.addLast(till.getElementAt(i));
		}
		System.out.println(temp);
	}
	public void kReverse (LinkedList<Integer> temp,int n){
		// 3 →​ 4 →​ 5 →​ 2 →​ 6 →​ 1 →​ 9 for k reverse(3) becomes 5​ → 4→​ 3→​ 1→​ 6→​ 2→​ 9 →​ 1
		int upto = size() - n;
		LinkedList<Integer> till = new LinkedList<>();
		int k = 0;
		for (int i = 0;i < upto;i++){
			till.addLast(temp.getElementAt(k));
			k++;
		}
		System.out.println(till);
		LinkedList<Integer> now = new LinkedList<>();
		for (int i = 0;i < n;i++){
			now.addLast(temp.getElementAt(k));
			k++;
		}
		System.out.println(now);
		now.reverseIterativeSwap();
		temp = null;
		temp = now;
		System.out.println(temp);
		for (int i = 0;i < upto;i++){
			temp.addLast(till.getElementAt(i));
		}
		System.out.println(temp);
	}
}