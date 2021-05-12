package com.test;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] arr1 =  {1,3,5,7,8};
		int[] arr2 =  {2,4,6,9,10};
		
		mergeTwoSortedArrays(arr1, arr2);
	}

	private static void mergeTwoSortedArrays(int[] arr1, int[] arr2) {

		int length1 = arr1.length;
		int length2 = arr2.length;
		int[] mergedArr = new int[length1+length2];
		int mergedIndex=0;
		int index1=0;
		int index2=0;
		
		while(index1<length1 && index2<length2) {
			if(arr1[index1]<arr2[index2]) {
				mergedArr[mergedIndex++] = arr1[index1++];
			}else {
				mergedArr[mergedIndex++] = arr2[index2++];
			}
		}
		while(index2<arr2.length) {
			mergedArr[mergedIndex++] = arr2[index2++];
		}
		while(index1<arr1.length) {
			mergedArr[mergedIndex++] = arr1[index1++];
		}
		Arrays.stream(mergedArr).forEach(num->System.out.println(num));
	}
}
