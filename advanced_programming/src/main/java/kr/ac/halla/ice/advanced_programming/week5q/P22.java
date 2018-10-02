package kr.ac.halla.ice.advanced_programming.week5q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class P22 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/jack/Email-EuAll.txt"));

		HashMap<Integer, Integer> occurrenceMap = new HashMap<Integer, Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\\s");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);

			if (occurrenceMap.containsKey(sender)) {
				occurrenceMap.put(sender, occurrenceMap.get(sender) + 1);
			} else {
				occurrenceMap.put(sender, 1);
			}

			if (occurrenceMap.containsKey(receiver)) {
				occurrenceMap.put(receiver, occurrenceMap.get(receiver) + 1);
			} else {
				occurrenceMap.put(receiver, 1);
			}
		}

		// 등장횟수의 최소값
		int minimum = Integer.MAX_VALUE;
		// 등장횟수가 최소값인 ID SET 
		HashSet<Integer> minSet = new HashSet<Integer>();

		Iterator<Integer> iterator = occurrenceMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			if (occurrenceMap.get(key) < minimum) {
				minimum = occurrenceMap.get(key);
				minSet = new HashSet<Integer>();
				minSet.add(key);
			} else if (occurrenceMap.get(key) == minimum) {
				minSet.add(key);
			}
		}

		System.out.println(minSet.size());
		bufferedReader.close();
	}

}
