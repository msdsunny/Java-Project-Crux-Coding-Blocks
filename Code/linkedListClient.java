package mainHome;

public class linkedListClient {

	public static void main(String[] args) {
		linkedList<String> list = new linkedList<>();
		
		list.addLast("Hello");
		list.display();
		list.addLast("there");
		list.display();
		list.addLast("universe");
		list.display();
		
		list.addFirst("bingo");
		list.display();
		list.addFirst("whatelse");
		list.display();
		
//		list.addAt("abracadabra", 3);
//		list.display();
	}

}
