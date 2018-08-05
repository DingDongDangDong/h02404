package kr.ac.halla.ice.advanced_programming.week5;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * TreeSet
 * 
 * Week 5-1
 * 
 * @author jack
 *
 */
public class Practice3 {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		// insert 1000 random integer to the set
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			treeSet.add(r.nextInt(10000));
		}

		// iterator (ascending order)
		Iterator<Integer> ascIterator = treeSet.iterator();
		while (ascIterator.hasNext()) {
			Integer i = ascIterator.next();
			System.out.println(i);
		}

		// iterator (descending order)
		Iterator<Integer> descIterator = treeSet.descendingIterator();
		while (descIterator.hasNext()) {
			Integer i = descIterator.next();
			System.out.println(i);
		}

		// ceiling: Returns the least element in this set greater than or equal to the
		// given element, or null if there is no such element.
		System.out.println(treeSet.ceiling(35));

		// floor: Returns the greatest element in this set less than or equal to the
		// given element, or null if there is no such element.
		System.out.println(treeSet.floor(35));

		// higher: Returns the least element in this set strictly greater than the given
		// element, or null if there is no such element.
		System.out.println(treeSet.higher(35));

		// lower: Returns the greatest element in this set strictly less than the given
		// element, or null if there is no such element.
		System.out.println(treeSet.lower(35));
	}
}
