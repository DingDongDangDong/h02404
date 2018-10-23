package kr.ac.halla.ice.advanced_programming.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * The number of occurrence for each source id
 * 
 * @author jack
 *
 */
public class Assignment8 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/Wiki-Vote.txt");

			BufferedReader br = new BufferedReader(fin);

			TreeMap<String, Integer> occurrenceMap = new TreeMap<String, Integer>();

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\\s");

				if (occurrenceMap.containsKey(arr[0])) {
					Integer currentCnt = occurrenceMap.get(arr[0]);
					currentCnt = currentCnt + 1;
					occurrenceMap.put(arr[0], currentCnt);
				} else {
					occurrenceMap.put(arr[0], new Integer(1));
				}
			}

			int max = -1;
			Iterator<Entry<String, Integer>> iterator = occurrenceMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<String, Integer> entry = iterator.next();
				if( entry.getValue() > max)
					max = entry.getValue();
			}

			System.out.println(max);
			// Wiki: 930
			// Vote: 893
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
