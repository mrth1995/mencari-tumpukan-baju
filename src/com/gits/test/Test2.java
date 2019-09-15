package com.gits.test;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int[] input = {1,2,3,4};
		int uang = 7;
		int purchased = test2(input, uang);
		System.out.println(purchased);
	}

	private static int test2(int[] array, int uang) {
		int spent = 0;
		int purchased = 0;
		Arrays.sort(array);
		for (int i : array) {
			spent += i;
			if (spent < uang) {
				purchased++;
			}
		}
		return purchased;
	}
}
