package kr.ac.halla.ice.advanced_programming.week7;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * TreeSet with custom comparable class
 * 
 * Week 5-1
 * 
 * @author jack
 *
 */
public class Practice5 {

	public static void main(String[] args) {

		TreeSet<ComparableRelationship> treeSet = new TreeSet<ComparableRelationship>();

		// insert 1000 random integer to the set
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			treeSet.add(new ComparableRelationship("a" + r.nextInt(10000), "b", "c" + r.nextInt(10000)));
		}

		// iterator (ascending order)
		Iterator<ComparableRelationship> ascIterator = treeSet.iterator();
		while (ascIterator.hasNext()) {
			ComparableRelationship i = ascIterator.next();
			System.out.println(i.getSubject());
		}
	}
}
