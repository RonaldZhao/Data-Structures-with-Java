package io.github.gitzzg.Chapter2;

public class DuplicatingArrays {

	public static void main(String[] args) {
		int[] a = {22,44,66,88};
		print(a);
		int[] b = (int[])a.clone();	// 由于方法clone()返回的是Object的引用，所以它必须强制转换为相应复制数组的类型
		print(b);
		String[] c = {"AB", "CD", "EF"};
		print(c);
		String[] d = (String[])c.clone();
		print(d);
		c[1] = "XYZ";
		print(c);
		print(d);
	}
	
	public static void print(int[] a) {
		System.out.printf("{%d", a[0]);
		for (int i=1;i<a.length;i++) {
			System.out.printf(",%d", a[i]);
		}
		System.out.println("}");
	}
	
	public static void print(Object[] a) {
		System.out.printf("{%s", a[0]);
		for (int i=1;i<a.length;i++) {
			System.out.printf(",%s", a[i]);
		}
		System.out.println("}");
	}

}
