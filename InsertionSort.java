package com.SearchAlgorithms;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		// Sample set of unsorted array
		int []numbers = new int[]{33,44,83,56,73,22,99};
		
		
		// Sorting Calculation
		for(int i=0 ; i<(numbers.length)-1 ; i++){
			
			int swapped = -1;
			for(int j=i+1 ; j>0 ; j--){
			 
				if(numbers[j] < numbers[j-1]){
					swapped = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = swapped;
				}	
			}	
		}
		
		// Printing Result
		for(int item: numbers){
			System.out.println(item);
		}
		
		
		
	}
	
}

