package kr.ac.halla.ice.advanced_programming.week4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList methods
 * 
 * Week 4-1
 * 
 * @author jack
 *
 */
public class Practice5 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("apple");
		list.add("banana");
		list.add("cake");
		list.add("apple");

		// Get the number of elements in a list
		System.out.println(list.size());

		// check whether an element exists
		boolean doesBananaExist = list.contains("banana");
		System.out.println(doesBananaExist);

		boolean doesMelonExist = list.contains("melon");
		System.out.println(doesMelonExist);

		// get with index
		String third = list.get(2);
		System.out.println(third);

		// remove
		list.remove(third);

		third = list.get(2);
		System.out.println(third);

		// get index of an element
		int indexOfApple = list.indexOf("apple");
		System.out.println(indexOfApple);

		// iterator pattern for ArrayList 1
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			System.out.println(element);
		}

		// iterator pattern for ArrayList 2
		for (String element : list) {
			System.out.println(element);
		}

		// iterator pattern for ArrayList 3
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
