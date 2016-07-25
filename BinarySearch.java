package com.SearchAlgorithms;

public class BinarySearch {


	public static void main(String[] args) {

		/**
		 *  Creating Sorted Array
		 */
		int []numbers = new int[(int) Math.pow(2,10)];
		for(int i=0; i<(int)Math.pow(2,10) ; i++){
			numbers[i] = i;
		}
		
		// Pick a number to make computer guess it 
		int myNumber = 1;
		
		// Bounds, counters, and average variables
		int left = 0;
		int right = (int)Math.pow(2,11);
		int temp = ((left+right)/2);
		int count = 0;
		
		// Main loop of the Binary Search
		while( left<right ){
			
			System.out.println("Start Left - "+left+" right - "+right+" Average - "+ temp);
			temp = ((left+right)/2);
			
			if( temp == myNumber ){
				count++;
				System.out.println(" Found my number is "+myNumber+" -- #"+ count+"times");
				break;
			}
			else if( temp < myNumber ){
				left = temp;
			}
			else{
				right = temp;
			}
			count++;
			
			System.out.println(count + "-th try ");
			System.out.println(" Left - "+left+" right - "+right+" Average - "+ temp);
			
		}

	}
}
