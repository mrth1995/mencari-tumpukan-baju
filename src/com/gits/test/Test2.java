package com.gits.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};
		int uang = 7;
		List<Integer> purchased = test2(input, uang);
		System.out.println(purchased);
	}

	private static List<Integer> test2(int[] array, int uang) {
		int spent = 0;
		List<Integer> purchasedItem = new ArrayList<>();
		Arrays.sort(array);
		for (int i : array) {
			spent += i;
			if (spent < uang) {
				purchasedItem.add(i);
			}
		}
		return purchasedItem;
	}
}
