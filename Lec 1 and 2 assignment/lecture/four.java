import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		int[] ar = input();
		output(ar);
		//large(ar);
		//linear(ar);
		//reverse(ar);
		//output(ar);
		//pair(ar);
		bubble(ar);
		output(ar);
	}
	public static void bubble (int[] arr){
		System.out.println("yout sorted array is :");
		for (int j = 0;j < arr.length;j++){
			for (int i = 0;i < arr.length - j;i++){
				if (arr[i] < arr[i + 1]){
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	public static void pair (int[] arr){
		System.out.println("enter the value for which value is to be found");
		Scanner read = new Scanner (System.in);
		int x = read.nextInt();
		int j = 0;
		while (j < arr.length){
			int i = 0;
			while (i < arr.length){
				if (arr[i] + arr[j] == x){
					System.out.println("pair found");
					System.out.println(arr[i] + "," + arr[j]);
				}
				i = i + 1;
			}
			j = j + 1;
		}
	}
	public static void reverse (int[] arr){
		System.out.println("your reversed array is :");
		int temp = 0;
		int j = 0;
		int full = arr.length;
		while (j < arr.length/2){
			temp = arr[j];
			arr[j] = arr[full - j - 1];
			arr[full -j -1] = temp;
			temp = 0;
			j = j + 1;
		}
	}
	public static void linear(int[] arr){
		System.out.println("enter the element to be searched:");
		Scanner read = new Scanner (System.in);
		int element = read.nextInt();
		int j = 0;
		while (j < arr.length){
			if(element == arr[j]){
				System.out.println("your element is found at "+ j +"position");
				break;
			}
			j = j + 1;
		}
	}
	public static void large (int[] arr){
		int large = 0;
		int n = 0;
		while (n < arr.length){
			if(large < arr[n]){
				large = arr[n];
			}
			n = n + 1;
		}
		System.out.println("the largest no. in arr is  ");
		System.out.println(large);
	}
	public static int[] input(){
		System.out.println("enter the size");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int[size];
		int i = 0;
		while (i < size){
			System.out.println("enter the " + i +"th element");
			arr[i] = read.nextInt();
			i++;
		}	
		return arr;
	}
	public static void output(int[] arr){
		int j = 0;
		while (j < arr.length){
			System.out.println(arr[j]);
			j++;
		}
	}
}