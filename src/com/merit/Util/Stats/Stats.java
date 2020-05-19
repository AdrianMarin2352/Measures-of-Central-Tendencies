package com.merit.Util.Stats;

import java.util.Arrays;

public class Stats {

	
	public static int getMean(int[] a) {
		  int sum = 0;
		    for (int i = 0; i < a.length; i++) {
		        sum += a[i];
		    }
		    return sum / a.length;

	}
	
	
	public static int getMedian(int[] a) {
		
		Arrays.sort(a);
		int median;
		
		int total = a.length;
		
		if(total%2==0) {
			int middleSum = (total/2) + (total/2 - 1);
			
			median = middleSum/2;
		}
		else 
			median = total/2;
		
		
		return median;
		
	}
	
	public static int getRange(int[] a) {
		int range;
		int max;
		int min;
		
		Arrays.sort(a);
		
		max = (a.length - 1);
		min = a[0];
		
		range = max - min;
		
		
		return range;
	}
	
	public static int getMode(int[] a) {
		int mode = 0;
	    int count = 0;

	    int[] counts = new int[a.length];

	    for (int i=0; i < a.length; i++) {
	        counts[a[i]]++;
	        if (count < counts[a[i]]) {
	            count = counts[a[i]];
	            mode = a[i];
	        }
	    }
	    return mode;
	}
}
