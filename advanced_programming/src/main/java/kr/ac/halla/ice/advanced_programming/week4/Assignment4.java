package kr.ac.halla.ice.advanced_programming.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * The number of occurrence for each source id
 * 
 * @author jack
 *
 */
public class Assignment4 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");

			BufferedReader br = new BufferedReader(fin);

			HashMap<String, Integer> occurrenceMap = new HashMap<String, Integer>();

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\t");

				if (occurrenceMap.containsKey(arr[0])) {
					Integer currentCnt = occurrenceMap.get(arr[0]);
					currentCnt = currentCnt + 1;
					occurrenceMap.put(arr[0], currentCnt);
				} else {
					occurrenceMap.put(arr[0], new Integer(1));
				}
			}

//			Iterator<Entry<String, Integer>> iterator = occurrenceMap.entrySet().iterator();
//			while (iterator.hasNext()) {
//				Entry<String, Integer> entry = iterator.next();
//				System.out.println(entry.getKey() + "-" + entry.getValue());
//			}

			// The number of 3024 occurrence
			System.out.println(occurrenceMap.get("3024"));

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
