package kr.ac.halla.ice.advanced_programming.week7;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import kr.ac.halla.ice.advanced_programming.week2_1.Relationship;

/**
 * TreeSet with custom class ( should fail )
 * 
 * Week 5-1
 * 
 * @author jack
 *
 */
public class Practice4 {

	public static void main(String[] args) {

		TreeSet<Relationship> treeSet = new TreeSet<Relationship>();

		// insert 1000 random integer to the set
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			treeSet.add(new Relationship("a" + r.nextInt(10000), "b", "c" + r.nextInt(10000)));
		}

		// iterator (ascending order)
		Iterator<Relationship> ascIterator = treeSet.iterator();
		while (ascIterator.hasNext()) {
			Relationship i = ascIterator.next();
			System.out.println(i);
		}
	}
}
