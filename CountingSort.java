package com.SearchAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class CountingSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> elements = new ArrayList<>();

		// Add elements to the array list
		elements.add(10);
		elements.add(15);
		elements.add(20);
		elements.add(11);
		elements.add(15);
		elements.add(20);
		elements.add(17);
		elements.add(19);
		elements.add(40);
		elements.add(90);
		elements.add(99);
		elements.add(100);
		elements.add(0);
		elements.add(101);
		
		// get the max of array list
		int maxVal = Collections.max(elements);
		
		
		
		/* 
		 * Counting sort implementation begins here
		 */
		int []tempArr = new int[maxVal+1];
		
		// reset the temp array
		for(int i=0 ; i< maxVal+1 ; i++){
			tempArr[i] = 0;
		}
		
		// count each item and increase one 
		for(int item:elements){
			tempArr[item]++;
		}
		
		// print the sorted array
		for(int k=0 ; k<tempArr.length ; k++){
			for(int i = tempArr[k] ; i>0 ; i--){
				System.out.print(k+" ");
			}
		}

	}

}
