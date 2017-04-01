package io.github.gitzzg.Chapter2;

import java.util.Arrays;
import java.util.Date;

public class TestArraysfill {

	public static void main(String[] args) {
		Object[] a = new Object[4];
		Arrays.fill(a, new Date());
		DuplicatingArrays.print(a);
		Arrays.fill(a, 33);
		DuplicatingArrays.print(a);
		Arrays.fill(a, "Yo!");
		DuplicatingArrays.print(a);
	}

}
