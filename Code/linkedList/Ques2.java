package linkedList;

public class Ques2 {

	public static void main(String[] args) {
		//Ques 2
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(1);
		list.display();
		list.addLast(2);
		list.display();
		list.addLast(2);
		list.display();
		list.addLast(3);
		list.display();
		list.addLast(4);
		list.display();
		list.addLast(4);
		list.display();
		list.addLast(5);
		list.display();
		list.addLast(6);
		list.display();
		list.removeDub();
		list.display();
	}
}
