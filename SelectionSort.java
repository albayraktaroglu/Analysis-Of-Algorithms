package com.SearchAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {

		int []numbers = new int[]{2,4,1,7,8,3,9,5,6};
		
		//Selection Sort Implementation 
		
		int min=0;
		int temp=0;
		
		for(int i=0 ; i<numbers.length; i++){
			
			min = i;
			for(int j=i+1 ; j<numbers.length ; j++){
				
				if(numbers[j] < numbers[min]){
					min = j;
				}
			}
			
			temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;			

		}
		
		// Print Result 
		
		for(int item: numbers)
			System.out.print(item+" ");
		
		

	}

}
