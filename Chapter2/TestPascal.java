package io.github.gitzzg.Chapter2;

import java.util.Arrays;

public class TestPascal {

	public static void main(String[] args) {
		int[][] a = pascal(15);
		for(int i=0;i<a.length;i++)
			System.out.println(Arrays.toString(a[i]));
	}
	
	public static int[][] pascal(int n) {	// 杨辉三角
		int[][] p = new int[n][n];
		for(int j=0;j<n;j++)
			p[j][0] = p[j][j] = 1;	// 将首末元素置1
		for(int i=2;i<n;i++) {	// 从第三行开始计算
			for(int j=1;j<i; j++)	// 从每行的第二个元素开始计算
				p[i][j] = p[i-1][j-1] + p[i-1][j];
		}
		return p;
	}

}
