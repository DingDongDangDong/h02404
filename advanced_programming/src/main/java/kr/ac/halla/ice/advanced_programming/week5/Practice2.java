package kr.ac.halla.ice.advanced_programming.week5;

import java.util.HashMap;

public class Practice2 {

	public static void main(String[] args) {

		String data = "0 1 2 3 2 3 1 0 1 4 2 3 5 8 9 9 9 2 3 0 1 2 9 7 7 3";
		String[] arr = data.split("\\s");
		HashMap<String, Integer> newSet = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			// Check the redundancy
			// If exists
			String item = arr[i];
			if (newSet.containsKey(item)) {
				// Get the value // Increase the value // Update the value for the key
				int occ = newSet.get(item);
				newSet.put(arr[i], occ + 1);
			} else {
				// If not exists
				// Just put the value for the key (i.e., 1)
				newSet.put(arr[i], 1);
			}
		}
		System.out.println(newSet);
	}
}
