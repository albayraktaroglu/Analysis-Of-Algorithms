package com.SearchAlgorithms;

public class QuickSort {

	int array[];
	int lengthArray;
			
	public void sort( int[] inputArray ){
				
		if(inputArray == null || inputArray.length == 0){
			System.out.println("Please insert an array with legth greater than 0");
			return;
		}
				
		this.array = inputArray;
		this.lengthArray = inputArray.length;			
		quicksort(0, this.lengthArray-1 );
	}
	
	private void quicksort(int lowerIndex, int higherIndex){
		int l = lowerIndex;
		int h = higherIndex;
		
		// selecting pivot number
		int pivot = this.array[l];

		while( l <= h ){
			while( this.array[l] < pivot ){
				l++;
			}
			while( pivot < this.array[h] ){
				h--;
			} 
			if( l <= h ){
				exchangeItems(l, h);
				l++;
				h--;
			}
		}
		
		if( lowerIndex < h ){
			quicksort(lowerIndex, h);
		}
		if( l < higherIndex ){
			quicksort(l, higherIndex);
		}
		
	}
	
	private void exchangeItems(int low, int high){
		int temp = this.array[low];
		this.array[low] = this.array[high];
		this.array[high] = temp;
	}
	
	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		int[] input = {5,1,2,3,4,6,7,8,9};
		qs.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }

	}

}
