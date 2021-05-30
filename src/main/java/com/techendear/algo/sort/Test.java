package com.techendear.algo.sort;

public class Test {

	public static void main(String[] args) {
		int[] arr = { -1, 3, -2, 2};
		
		
		System.out.println(arrayMedian(arr));

	}
	
static	double arrayMedian(int[] sequence) {
	    
	    
	    int[] sorted = sortArr(sequence);
	    
	    if(sorted.length % 2==0) {
	        double e1 = sorted[(sorted.length)/2 - 1];
	        double e2 = sorted[(sorted.length)/2];
	        double d = (e1+e2)/2;
	        
	        System.out.println(d);
	        return (e1+e2)/2;
	    } else {
	        int in =  (sorted.length)/2;
	        return sorted[in];
	    }
	}


	public static int[] sortArr(int[] arr) {

			for (int i = 1; i < arr.length; i++) {
				int insEle = arr[i];

				int j;
				for (j = i; j > 0 && arr[j - 1] > insEle; j--) {
					arr[j] = arr[j-1];
				}
				
				arr[j] = insEle;
			}

			return arr;
		}

}
