package kr.ac.halla.ice.advanced_programming.week4;

import java.util.HashMap;
import java.util.Iterator;

/**
 * HashMap methods
 * 
 * Week 4-1
 * 
 * @author jack
 *
 */
public class Practice4 {

	public static void main(String[] args) {

		String data = "0 1 2 3 2 3 1 0 1 4 2 3 5 8 9 9 9 2 3 0 1 2 9 7 7 3";
		String[] arr = data.split("\\s");
		HashMap<Integer, Integer> newSet = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			// Integer.parseInt(String str): parses the string argument as a signed decimal
			// integer.
			int key = Integer.parseInt(arr[i]);

			if (newSet.containsKey(key)) {
				// If the key is in the map
				// it should be more than 1
				int prevValue = newSet.get(key);
				// increase the value and update the map
				newSet.put(key, prevValue + 1);
			} else {
				// If the key is not in the map yet
				newSet.put(key, 1);
			}
		}
		Iterator<Integer> iterator = newSet.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			Integer value = newSet.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
