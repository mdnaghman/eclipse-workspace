package Algorithms;

public class selectionSort {

	public static void main(String[] args) {
		
	
		int array[] = {5,2,-1,6,3};
		int number= array.length;
		
		for (int i=0; i< number-1; i++) {
			
			int minInd = i;
			for(int j= i; j < number; j++) {
				
				if(array[j] < array[minInd]) {
					minInd =j;
			}
		}
			int temp= array[i];
			array[i]= array[minInd];
			array[minInd] = temp;
			}
		
		for(int e:array) {
			System.out.print(e+ ", ");
		}
			
	}
}