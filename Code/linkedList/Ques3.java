package linkedList;

public class Ques3 {

	public static void main(String[] args) {
		LinkedList<Integer> one = new LinkedList<>();
		one.addLast(1);
		one.addLast(3);
		one.addLast(5);
		one.addLast(7);
		one.addLast(9);
		one.display();
		LinkedList<Integer> two = new LinkedList<>();
		two.addLast(2);
		two.addLast(4);
		two.addLast(6);
		two.addLast(8);
		two.addLast(10);
		two.display();
		LinkedList<Integer> result = new LinkedList<>();
		LinkedList<Integer> some = result.merge2to1(one, two);
		some.display();
		one.display();
		two.display();
	}
}
