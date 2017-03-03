package io.github.gitzzg.Chapter1;

public class Person {
	private final String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return new String(name);
	}
}
