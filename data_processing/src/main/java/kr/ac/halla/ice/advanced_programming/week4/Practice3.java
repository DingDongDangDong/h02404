package kr.ac.halla.ice.advanced_programming.week4;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet methods
 * 
 * Week 4-1
 * 
 * @author jack
 *
 */
public class Practice3 {

	public static void main(String[] args) {

		HashSet<String> s1 = new HashSet<String>();
		s1.add("apple");
		s1.add("banana");
		s1.add("cake");
		s1.add("apple");

		// Get the number of elements in a hashset
		System.out.println(s1.size());

		// check whether an element exists
		boolean doesBananaExist = s1.contains("banana");
		System.out.println(doesBananaExist);

		boolean doesMelonExist = s1.contains("melon");
		System.out.println(doesMelonExist);

		// Iterator pattern
		Iterator<String> iterator = s1.iterator();
		while (iterator.hasNext()) {
			String id = iterator.next();
			System.out.println(id);
		}

		// remove
		s1.remove("apple");
		iterator = s1.iterator();
		while (iterator.hasNext()) {
			String id = iterator.next();
			System.out.println(id);
		}

		// Another set
		HashSet<String> s2 = new HashSet<String>();
		s2.add("banana");
		s2.add("melon");
		s2.add("ice cream");

		// Compute intersection
		// union is addAll
		s1.retainAll(s2);

		iterator = s1.iterator();
		while (iterator.hasNext()) {
			String id = iterator.next();
			System.out.println(id);
		}
	}
}
