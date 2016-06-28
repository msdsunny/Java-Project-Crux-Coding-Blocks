package linkedList;

public class Ques1 {

	public static void main(String[] args) {
		//Ques 1
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(6);
		list.addFirst(7);
		list.display();
//		list.addAt(5, 3);
//		list.display();
//		list.swapTwoElement(2, 4);
//		list.display();
//		list.midPoint();
//		list.fiveFromLast();
//		list.reverseIterativeSwap();
//		list.display();
//		list.find(3, 4);
		list.bubbleSort(list);
		list.display();
	}
}
