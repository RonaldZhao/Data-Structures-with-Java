package io.github.gitzzg.Chapter1;

public class Professor extends Person {
	public static enum Rank {INSRT, ASST, ASSOC, PROF}
	private Rank rank;
	public Professor(String name, Rank rank) {
		super(name);
		this.rank = rank;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
}
