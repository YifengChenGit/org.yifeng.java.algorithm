package org.yifeng.java.algorithm.sort;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 4, 3, 0);
		System.out.println(list);
		bubbleSort(list);
		System.out.println(list);
	}
	
	private static void bubbleSort(List<Integer> list) {
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i  - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
			System.out.println(list);
		}
	}
}
