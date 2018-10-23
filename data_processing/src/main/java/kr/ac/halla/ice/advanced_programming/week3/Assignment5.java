package kr.ac.halla.ice.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Process the number of source IDs
 * 
 * @author jack
 *
 */
public class Assignment5 {

	public static void main(String[] args) {

		try {
			// FileReader fin = new FileReader("/home/jack/Email-EuAll.txt");
			FileReader fin = new FileReader("/home/jack/Wiki-Vote.txt");

			BufferedReader br = new BufferedReader(fin);

			String[] idArray = new String[265214];

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\t");

				int idx = getIndexForInsert(idArray, arr[0]);
				if (idx != -1) {
					idArray[idx] = arr[0];
				}

				int i = 0;
				for (; i < idArray.length; i++) {
					if (idArray[i] == null)
						break;
				}
				System.out.println(i);
			}

			int i = 0;
			for (; i < idArray.length; i++) {
				if (idArray[i] == null)
					break;
			}
			System.out.println(i);
			br.close();

			// 225409
			// 7115

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
