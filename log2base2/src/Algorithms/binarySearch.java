package Algorithms;

public class binarySearch {

	
	int BinarySearch(int arr[], int start, int end, int key) {
		
		if (start <=end) {
			int mid = (start + end)/2;
			
			if (arr[mid] == key)
				return 1;
			
			if (arr[mid] < key)
				return BinarySearch(arr, start, mid + 1, key);
			else
			return BinarySearch(arr, mid-1, end,key);
			
		}
	return 0;
	}
	
	
	public static void main(String[] args) {
		
		binarySearch ob = new binarySearch();
		int arr[] = {2,4,6,8,10};
		int n= arr.length;
		int key= 10;
		int result = ob.BinarySearch(arr, 0, n- 1 , key);
		if (result == -1)
			System.out.println("Element not present");
		else 
		result = ob.BinarySearch(arr, key, n, key);
			System.out.println("Element found at index:" + " "+ result);
		
		
		
	}

}
