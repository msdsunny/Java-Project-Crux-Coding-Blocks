package mainHome;
import java.util.Scanner;

public class AllArray {

	public static void main(String[] args) {
		//System.out.println("enter no.:");
		//Scanner read = new Scanner (System.in);
		//int x = read.nextInt();
		int[] ar = input();
		output(ar);
		int[] br = input();
		output(br);
		//large(ar);
		//linear(ar);
		//reverse(ar);
		//output(ar);
		//pair(ar);
		//bubble(ar);
		//selection(ar);
		//insertion(ar);
		//output (ar);
		//binary (ar,x);
		merge(ar,br);
	}
	public static void merge (int[] arr, int[] brr){
		int i = 0,j = 0,z = 0;
		int[] crr = new int[arr.length + brr.length];
		while (i < arr.length || j < brr.length){
		     if (arr[i] <= brr[j]){
				crr[z] = arr[i];
				z++;
				i++;
			}else if (arr[i] > brr[j]){
				crr[z] = brr[j];
				z++;
				j++;
			} if(i == arr.length){
				while (j < brr.length){
					crr[z] = brr[j];
					z++;
					j++;
				}
			}if(j == brr.length){
				while (i < arr.length){
					crr[z] = arr[i];
					z++;
					i++;
				}
			}
		}
		output(crr);
	}
	public static int binary (int[] arr, int x){
		int i = 0;
		int low = arr[0];
		int high = arr[arr.length - 1];
		int mid = (low + high)/2;
		while (low < high){
			if (low == x){
				System.out.println(low);
				return low;
			}else if(high == x){
				System.out.println(high);
				return high;
			}else if(mid == x){
				System.out.println(mid);
				return mid;
			}else if (x < mid){
				low = low + 1;
				high = mid - 1;
				mid = (low + high)/2;
			}else if (x > mid){
				low = mid + 1;
				high = high - 1;
				mid = (low + high)/2;
			}
		}
		return -1;
	}
	public static void insertion (int[] arr){
		for(int i = 1;i < arr.length;i++){
			for(int j = i;j>0;j--){
				if(arr[j-1] > arr[j]){
					int temp = arr[j-1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}else{
					break;
				}
			}
		}
	}
	public static void selection (int[] arr){
		for (int i = 0;i < arr.length - 1;i++){
			for (int j = i + 1;j< arr.length;j++){
				if (arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void bubble (int[] arr){
		//System.out.println("your sorted array is :");
		for (int j = 0;j < arr.length - 1;j++){
			for (int i = 0;i < arr.length - j - 1;i++){
				if (arr[i] > arr[i + 1]){
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