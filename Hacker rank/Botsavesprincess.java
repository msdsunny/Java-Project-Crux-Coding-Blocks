import java.util.Scanner;

public class Botsavesprincess {

	public static void main(String[] args) {
		System.out.println("enter the size of cage :");
		Scanner read = new Scanner (System.in);
		int n = read.nextInt();
		char[][] arr = input(n);
		displayPathtoPrincess(n, arr);
	}
	public static void displayPathtoPrincess (int n,char [][] arr){
		int[] bot = new int[2];
		int[] princess = new int[2];
		int check = '-';
		int pri = 'p';
		int bo = 'm';
		for (int i = 0;i < arr.length;i++){
			char[] brr = arr[i];
			for (int j = 0;j < brr.length;j++){
				int local = brr[j];
				if (local == pri){
					princess[0] = i;
					princess[1] = j;
				}else if(local == bo){
					bot[0] = i;
					bot[1] = j;
				}
			}
		}
		int[] print = new int [2];
		print[0] = princess[0] - bot[0];
		print[1] = princess[1] - bot[1];
		int temp = print[0];
		print[0] = print[1];
		print[1] = temp;
		for (int i = 0;i < 1000;i++){
			if (print[0] != 0 && print[1] != 0){
				if (print[0] < 0 && print[1] < 0){
					System.out.println("UP");
					System.out.println("LEFT");
					print[0] = print[0] + 1;
					print[1] = print[1] + 1;
				}else if (print[0] < 0 && print[1] > 1){
					System.out.println("UP");
					System.out.println("RIGHT");
					print[0] = print[0] + 1;
					print[1] = print[1] - 1;
				}else if (print[0] > 0 && print[1] < 1){
					System.out.println("DOWN");
					System.out.println("LEFT");
					print[0] = print[0] - 1;
					print[1] = print[1] + 1;
				}else if (print[0] > 0 && print[1] > 1){
					System.out.println("DOWN");
					System.out.println("RIGHT");
					print[0] = print[0] - 1;
					print[1] = print[1] - 1;
				}
			}
			if (print[0] == 0 && print[1] > 0){
				System.out.println("UP");
				print[1] = print[1] - 1;
			}
			if (print[0] == 0 && print[1] < 0){
				System.out.println("DOWN");
				print[1] = print[1] + 1;
			}
			if (print[0] > 0 && print[1] == 0){
				System.out.println("LEFT");
				print[0] = print[0] - 1;
			}
			if (print[0] < 0 && print[1] == 0){
				System.out.println("RIGHT");
				print[0] = print[0] + 1;
			}
			if (print[0] == 0 && print[1] == 0){
				break;
			}
		}
	}
	public static char[][] input (int n){
		char[][] arr = new char[n][n];
		Scanner read = new Scanner (System.in);
		for (int i = 0;i < arr.length;i++){
			for (int j = 0;j < arr.length;j++){
				arr[i][j] = read.next().charAt(0);
			}
		}
		return arr;
	}
}
