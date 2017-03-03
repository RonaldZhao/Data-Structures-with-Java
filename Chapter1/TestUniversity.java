/**
 * 
 */
package io.github.gitzzg.Chapter1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mrzzg
 *
 */
public class TestUniversity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		University jsu = new University("JavaStateUniversity");
		Professor adams = new Professor("Adams", Professor.Rank.ASSOC);
		Professor baker = new Professor("Baker", Professor.Rank.ASST);
		Professor cohen = new Professor("Cohen", Professor.Rank.PROF);
		Set<Professor>profs = new HashSet<Professor>();
		Collections.addAll(profs, adams, baker, cohen);
		jsu.addDepartment("Computer science", profs);
		Professor davis = new Professor("Davis", Professor.Rank.ASST);
		Professor evans = new Professor("Evans", Professor.Rank.INSRT);
		profs.clear();
		Collections.addAll(profs, davis, evans, baker);
		jsu.addDepartment("Biology", profs);
		adams.setRank(Professor.Rank.PROF);
	}

}
