package kr.ac.halla.ice.advanced_programming.week5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Practice1 {

	public static void main(String[] args) {

		// Construction
		HashMap<Integer, String> idName = new HashMap<Integer, String>();
		idName.put(18174, "jack");
		idName.put(20151111, "jackson");
		idName.put(20151234, "wonder");
		idName.put(20154321, "Eminem");
		idName.remove(20154321);
		System.out.println(idName.size()); // 3
		System.out.println(idName.containsKey(18174)); // true
		System.out.println(idName.get(20151111)); // “jackson“
		System.out.println(idName.isEmpty()); // false

		Iterator<Integer> iterator = idName.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			String value = idName.get(key);
			System.out.println(key + " : " + value);
		}

		Iterator<Entry<Integer, String>> iterator2 = idName.entrySet().iterator();
		while (iterator2.hasNext()) {
			Entry<Integer, String> entry = iterator2.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}
}
