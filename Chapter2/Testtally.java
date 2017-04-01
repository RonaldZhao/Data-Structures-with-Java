package io.github.gitzzg.Chapter2;

import java.util.Arrays;

public class Testtally {

	public static void main(String[] args) {
		int[] a = tally("you are so bad...");
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] tally(String string) {
		int[] a = new int[26];
		for(int i=0; i<string.length(); i++) {
			char c = Character.toUpperCase(string.charAt(i));
			if(Character.isLetter(c))
				++a[(int)c - (int)'A'];
		}
		return a;
	}

}
