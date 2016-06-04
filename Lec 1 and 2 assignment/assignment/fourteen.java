package mainHome;

public class fourteen {

	public static void main(String[] args) {
		int num = 0;
		while(num < 20){
			int temp = 3*num + 2;
			if(temp%4 == 0){
				num = num + 1;
			}else {
				System.out.println(temp);
				num = num + 1;
			}
		}

	}

}
