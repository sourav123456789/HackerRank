package com.sourav.hackerRank;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 2, 3, 4, 10, 9, 14, 13, 11, 20, 16, 18 };
		int target = 0;
		getBinarySearchResult(array , target);
	}

	private static void getBinarySearchResult(int[] array, int target) {
		
		Arrays.sort(array);
//		int low = 0;
//		int high = array.length - 1;
//		
//		while (low <= high) {
//			int mid = low + ((high-low)/2);
//			
//			if(target < array[mid]) {
//				high = high - 1;
//			}
//			
//			if(target > array[mid]) {
//				low = low + 1;
//			}
//			
//			if(target == array[mid]) {
//				return true;
//			}
//		}
//		return false;
		
		
		int binarySearch = Arrays.binarySearch(array, target);
		System.out.println(binarySearch);
		
		
	}
		
		

}
