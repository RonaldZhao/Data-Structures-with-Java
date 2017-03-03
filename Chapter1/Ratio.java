/**
 * 该类的实例表示的是分数
 */
package io.github.gitzzg.Chapter1;

import java.text.Normalizer;

/**
 * @author mrzzg
 *
 */
public class Ratio implements Comparable {
	protected int num;	// 分子
	protected int den;	// 分母
	public static final Ratio ZERO = new Ratio();
	
	private Ratio() {	// private，在类外部无法调用
		this(0, 1);
	}
	
	public Ratio(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		} else if (!(object instanceof Ratio)) {
			return false;
		}
		Ratio that = (Ratio)object;
		return (this.num * that.den == that.num * this.den);
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public String toString() {
		return String.format("%d/%d", num, den);
	}
	
	public double value() {
		return (double)num/den;
	}

	@Override
	public int compareTo(Object o) {
		if (o==this) {
			return 0;
		} else if (!(o instanceof Ratio)) {
			throw new IllegalArgumentException("Ratio type expected");
		}
		Ratio that = (Ratio)o;
		normalize(this);
		normalize(that);
		return (this.num*that.den - this.den*that.num);
	}
	
	private static void normalize(Ratio x) {
		if (x.num == 0) {	// x == Ratio.ZERO
			x.den = 1;
		} else if (x.den < 0) {	// change sign of num and den
			x.num *= -1;
			x.den *= -1;
		}
	}
}
