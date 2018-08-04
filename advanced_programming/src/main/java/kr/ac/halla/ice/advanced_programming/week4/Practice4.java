package kr.ac.halla.ice.advanced_programming.week4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

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

		HashMap<String, Integer> age = new HashMap<String, Integer>();

		age.put("jack", 43);
		age.put("mark", 37);
		age.put("james", 28);

		// get the age of mark
		Integer ageOfMark = age.get("mark");
		System.out.println(ageOfMark);

		// each key of hashmap is unique
		age.put("mark", 35);
		ageOfMark = age.get("mark");
		System.out.println(ageOfMark);

		// containsKey
		boolean doesJackExist = age.containsKey("jack");
		System.out.println(doesJackExist);

		boolean doesTrumpExist = age.containsKey("trump");
		System.out.println(doesTrumpExist);

		// iterator pattern for hashmap 1
		Set<String> keys = age.keySet();
		Iterator<String> keyIterator = keys.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println(key + "-" + age.get(key));
		}
		
		// iterator pattern for hashmap 2
		Set<Entry<String, Integer>> entrySet = age.entrySet();
		Iterator<Entry<String, Integer>> entryIterator =  entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
}
