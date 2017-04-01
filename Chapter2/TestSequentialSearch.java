package io.github.gitzzg.Chapter2;

public class TestSequentialSearch {

	public static void main(String[] args) {
		int[] a = {22,33,44,55,66,77,88,99};
		DuplicatingArrays.print(a);
		System.out.println("Search(a, 44): " + search(a, 44));
		System.out.println("Search(a, 50): " + search(a, 50));
		System.out.println("Search(a, 77): " + search(a, 77));
		System.out.println("Search(a, 100): " + search(a, 100));
	}
	
	public static int search(int[] a, int x) {
		for(int i=0;i<a.length;i++) {
			if(x == a[i])
				return i;
		}
		return -1;
	}

}
