package kr.ac.halla.ice.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Process the number of IDs in a file
 * 
 * @author jack
 *
 */
public class Assignment4 {

	public static void main(String[] args) {

		try {
			// FileReader fin = new FileReader("/home/jack/Email-EuAll.txt");
			FileReader fin = new FileReader("/home/jack/Wiki-Vote.txt");

			BufferedReader br = new BufferedReader(fin);

			long numID = 0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				// String[] arr = line.split("\t");
				String[] arr = line.split("\\s");
				if (arr[0] != null)
					numID++;
			}

			System.out.println(numID);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
