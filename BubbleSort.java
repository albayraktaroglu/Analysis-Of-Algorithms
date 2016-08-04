package com.SearchAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		// Unsorted integer array
		int []numbers = new int[]{2,4,1,7,8,3,9,5,6};
		
		// 
		boolean sorted  = false;
		while( !sorted ){
			
			int temp = -99;
			sorted = true;
			
			for(int i=1 ; i<numbers.length ; i++ ){
				
				if( numbers[i-1] > numbers[i] ){
					temp = numbers[i-1];
					numbers[i-1] = numbers[i];
					numbers[i] = temp;
					sorted = false;
				}
				
			}
		}
		
		// Printing the result 
		for(int item:numbers){
			System.out.println(item);
		}

	}

}
