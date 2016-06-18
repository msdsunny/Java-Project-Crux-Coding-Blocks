package mainHome;

public class quickSort {

	public static void main(String[] args) {
		int[] arr = {3,8,5,2,42,1,77,66};
		quickSort(arr, 0, arr.length - 1);
		output(arr);
	}
	public static void output (int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void quickSort (int[] arr,int low,int high){
		if(low >= high){
			return;
		}
		int pi = (low + high)/2;
		int pivot = arr[pi];
		int left = low,right = high;
		while (left <= right){
			while (arr[left]<pivot){
				left++;
			}
			while (arr[right] > pivot){
				right--;
			}
			if (left <= right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quickSort(arr, low, right);
		quickSort(arr, left, high);
	}
}
