package com.SearchAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSort {

	public static void main(String[] args) {
		
		int bucketSize = 10; 
		int []numbers = new int[]{28,2,11,4,40,1,33,19};
		
		int minVal = numbers[0];
		int maxVal = numbers[0];
		for(int i=0 ; i<numbers.length ; i++){
			if(numbers[i] < minVal){
				minVal = numbers[i];
			}
			else if(numbers[i] > maxVal){
				maxVal = numbers[i]; 
			}
		}
		
		
		// Initialize buckets 
		int bucketCount = ( maxVal - minVal )/ bucketSize +1;
		List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        
        
        // Distribute input array values into buckets
        for (int i = 0; i < numbers.length; i++) {
            buckets.get((numbers[i] - minVal) / bucketSize).add(numbers[i]);
        }
        
        // Sort buckets and place back into input array
        int currentIndex = 0;
        for (int i = 0; i < buckets.size(); i++) {
            Integer[] bucketArray = new Integer[buckets.get(i).size()];
            bucketArray = buckets.get(i).toArray(bucketArray);
            Arrays.sort( bucketArray );
            for (int j = 0; j < bucketArray.length; j++) {
                numbers[currentIndex++] = bucketArray[j];
            }
        }
        
        // Print arrays 
        for(int i=0 ; i<numbers.length; i++){
        	System.out.print(numbers[i]+" ");
        }

	}

}
