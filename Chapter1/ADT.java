/**
 * 分数 ADT:
 * ADT: Fraction
 * plus(Fraction): Fraction
 * times(Integer): Fraction
 * times(Fraction): Fraction
 * reciprocal(): Fraction
 * value(): Real
 */
package io.github.gitzzg.Chapter1;

/**
 * @author mrzzg
 */
public class ADT {
	// Fraction ADT 对应的接口
	public interface Fraction {
		Fraction plus(Fraction x);
		Fraction times(int n);
		Fraction times(Fraction x);
		Fraction reciprocal();
		double value();
	}
}
