package kr.ac.halla.ice.advanced_programming.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * The number of maximum occurrence for each source id
 * 
 * @author jack
 *
 */
public class Assignment6 {

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

			ArrayList<Integer> newList = new ArrayList<>(occurrenceMap.values());
			newList.sort(Comparator.reverseOrder());
			System.out.println(newList.get(0));

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
