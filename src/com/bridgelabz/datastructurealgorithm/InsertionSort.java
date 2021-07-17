package com.bridgelabz.datastructurealgorithm;

public class InsertionSort {

	public static String[] insertionSort(String array[], int len) {
		String temp = "";
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		String[] arr = { "Orange", "Apple", "Papaya", "Mango", "Watermelon", "Grapes", "Banana" };
		String sortedArray[] = insertionSort(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

}
