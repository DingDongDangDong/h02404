package kr.ac.halla.ice.advanced_programming.week4q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class P7s {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		HashMap<Integer, Integer> occurrenceMap = new HashMap<Integer, Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);

			if(occurrenceMap.containsKey(sender)) {
				occurrenceMap.put(sender, occurrenceMap.get(sender)+1);
			}else {
				occurrenceMap.put(sender, 1);
			}
			
			if(occurrenceMap.containsKey(receiver)) {
				occurrenceMap.put(receiver, occurrenceMap.get(receiver)+1);
			}else {
				occurrenceMap.put(receiver, 1);
			}
		}

		int maximum = -1;
		int mkey = -1;

		Iterator<Integer> iterator = occurrenceMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			if(occurrenceMap.get(key) > maximum) {
				maximum = occurrenceMap.get(key);
				mkey = key;
			}

		}
		System.out.println(mkey + " : " + maximum);
		bufferedReader.close();
	}
}
