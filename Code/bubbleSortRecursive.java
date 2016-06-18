package mainHome;

public class bubbleSortRecursive {

	public static void main(String[] args) {
		int[] arr = {7,6,5,4,3,2,1};
		bubbleSortRecursive(arr, 0, arr.length - 1);
		output(arr);
	}
	public static void output (int[] arr){
		for (int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void bubbleSortRecursive(int[] arr, int si, int li) {
		if (li == 0) {
			return;
		}

		if (si == li) {
			bubbleSortRecursive(arr, 0, li - 1);
			return;
		}

		if (arr[si] > arr[si + 1]) {
			int temp = arr[si];
			arr[si] = arr [si + 1];
			arr[si + 1] = temp;
		}
		bubbleSortRecursive(arr, si + 1, li);
	}

}
