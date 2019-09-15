package com.gits.test;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] kaosKaki1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int[] kaosKaki2 = {1,2,1,2,1,3,2};
		int jumlahKaosKaki = test1(kaosKaki2);
		System.out.println(jumlahKaosKaki);
	}

	private static int test1(int[] array) {
		Arrays.sort(array);
		int totalKaosKaki = 0;
		int count = 1;
		int temp = array[0];
		int i = 1;
		while (i < array.length) {
			if (temp == array[i]) {
				count++;
			} else {
				totalKaosKaki += count / 2;
				count = 1;
				temp = array[i];
			}
			i++;
		}
		return totalKaosKaki;
	}
}
