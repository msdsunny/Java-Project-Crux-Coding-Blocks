package mainHome;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,1};
		arr = mergeSort(arr,0,arr.length - 1);
		output(arr);
	}
	public static void output(int[] arr){
		int j = 0;
		while (j < arr.length){
			System.out.println(arr[j]);
			j++;
		}
	}
	public static int[] mergeSort (int[] arr, int low,int high){
		int mid = (low + high)/2;
		if (low == high)
		return new int[]{arr[low]};
//		mergeTwoSortedArrays(arr[mid + 1],arr[]);
//		mergeTwoSortedArrays();
//		mergeTwoSortedArrays();
		int[] firstArr = mergeSort(arr, mid + 1, high);
		int[] secondArr = mergeSort(arr, low, mid);
		int[] finalArr = mergeTwoSortedArrays(firstArr, secondArr);
		return finalArr;
	}
	public static int[] mergeTwoSortedArrays(int[] a1, int[] a2){
		int[] a3 = new int[a1.length + a2.length];
		
		int i = 0, j = 0, k = 0;
		while(i < a1.length && j < a2.length){
			if(a1[i] <= a2[j]){
				a3[k] = a1[i];
				i++;
				k++;
			}
			else{
				a3[k] = a2[j];
				j++;
				k++;
			}
		}
		
		while(i < a1.length){
			a3[k] = a1[i];
			i++;
			k++;
		}
		
		while(j < a2.length){
			a3[k] = a2[j];
			j++;
			k++;
		}
		
		return a3;
	}

}


