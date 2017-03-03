package io.github.gitzzg.Chapter1;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		String[] countries={"CN", "IN", "US", "ID", "BR"};
		print(countries);
		Arrays.sort(countries);
		print(countries);
		Ratio[] ratios = new Ratio[3];
		ratios[0] = new Ratio(22, 7);
		ratios[1] = new Ratio(25, 8);
		ratios[2] = new Ratio(28, 9);
		print(ratios);
		Arrays.sort(ratios);
		print(ratios);
	}
	
	static <T>void print(T[] a) {	// generic method
		for(T t:a) {
			System.out.printf("%s ", t);
		}
		System.out.println();
	}

}
