package kr.ac.halla.ics.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Process the number of source IDs with HashSet
 * 
 * @author jack
 *
 */
public class Assignment5 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");

			BufferedReader br = new BufferedReader(fin);

			HashSet<String> sourceIDSet = new HashSet<>();

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\t");

				sourceIDSet.add(arr[0]);

			}

			System.out.println(sourceIDSet.size());
			br.close();

			// 225409

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int getIndexForInsert(String[] arr, String str) {
		boolean isExist = false;
		int i = 0;
		for (; i < arr.length; i++) {
			if (arr[i] == null)
				break;
			if (arr[i].equals(str))
				isExist = true;
		}
		if (isExist == false)
			return i;
		else
			return -1;
	}
}
