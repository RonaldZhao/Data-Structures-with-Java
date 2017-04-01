package io.github.gitzzg.Chapter2;

import java.util.Arrays;
import java.util.Random;

public class TestBinarySearch {
	
	private static final int SIZE = 10000;
	private static final int SATRT = 0;
	private static final int RANGE = 10000;
	private static Random random = new Random();
	private static int count = 0;

	public static void main(String[] args) {
		int[] a = {22,33,44,55,66,77,88,99};
		DuplicatingArrays.print(a);
		System.out.println("Search(a, 44): " + search(a, 44));
		System.out.println("Search(a, 50): " + search(a, 50));
		System.out.println("Search(a, 77): " + search(a, 77));
		System.out.println("Search(a, 100): " + search(a, 100));
		
		int[] b = new int[SIZE];
		load(b, SATRT, RANGE);
		Arrays.sort(b);
		search(b, random.nextInt(SIZE));
		System.out.println(count + " itrrations.");
	}
	
	/**
	 * 
	 * @param a
	 * @param start
	 * @param range
	 */
	public static void load(int[] a, int start, int range) {
		for(int i = 0; i<a.length; i++) {
			a[i] = start+random.nextInt(range);
		}
	}
	
	public static int search(int[] a, int x) {
		int lo = 0;
		int hi = a.length;
		while (lo < hi) {
			++count;
			int i = (lo+hi)/2;
			if(x == a[i])
				return i;
			else if (a[i] < x)
				lo = i+1;
			else
				hi = i;	// 不是 i-1
		}
		return -1;
	}

}
