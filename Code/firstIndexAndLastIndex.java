package mainHome;

public class firstIndexAndLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstIndexSmarter(new int[] {1, 5, 6, 5, 9}, 5, 0));
		int[] allIndicesResult = allIndices(new int[] {1, 2, 2, 3, 2, 3, 2}, 2, 0);
		output(allIndicesResult);
	}
	public static void output (int[] arr){
		for (int  i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static int firstIndex(int[] arr, int el){
		if(arr.length == 0){
			return -1;
		}
		
		if(arr[0] == el){
			return 0;
		}
		else{
			int[] smallerArray = new int[arr.length - 1];

			for (int i = 0; i < smallerArray.length; i++) {
				smallerArray[i] = arr[i + 1];
			}
			
			int firstIndexInSmallerArray = firstIndex(smallerArray, el);
			if(firstIndexInSmallerArray == -1){
				return -1;
			}
			else{
				return firstIndexInSmallerArray + 1;
			}
		}
	}
	
	public static int firstIndexSmarter(int[] arr, int el, int si){
		if(si == arr.length){
			return -1;
		}
		
		if(arr[si] == el){
			return si;
		}
		else{
			// there is no smaller array, only a virtual index
			int firstIndexInSmallerArray = firstIndexSmarter(arr, el, si + 1);
			return firstIndexInSmallerArray;
		}
	}

	public static int lastIndex(int[] arr, int el, int si){
		if(si == arr.length){
			return -1;
		}
		
		int lastIndexInSA = lastIndex(arr, el, si + 1);
		if(lastIndexInSA != -1){
			return lastIndexInSA;
		}
		else{
			if(arr[si] == el){
				return si;
			}
			else{
				return -1;
			}
		}
	}

	public static int[] allIndices(int[] arr, int el, int si){
		if(si == arr.length){
			return new int[0];
		}
		
		int[] allIndicesOfSmallerArray = allIndices(arr, el, si + 1);
		if(arr[si] == el){
			int[] temp = new int[allIndicesOfSmallerArray.length + 1];
			
			for(int i = 0; i < allIndicesOfSmallerArray.length; i++){
				temp[i] = allIndicesOfSmallerArray[i];
			}
			
			temp[temp.length - 1] = si;
			allIndicesOfSmallerArray = temp;
		}
		return allIndicesOfSmallerArray;
	}
	
}
