package kr.ac.halla.ice.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Process the number of source IDs
 * 
 * @author jack
 *
 */
public class Assignment5S {

	public static void main(String[] args) {

		try {
			// FileReader fin = new FileReader("/home/jack/Email-EuAll.txt");
			FileReader fin = new FileReader("/home/jack/Wiki-Vote.txt");

			BufferedReader br = new BufferedReader(fin);

			HashSet<Integer> set = new HashSet<Integer>();

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				// String[] arr = line.split("\t");
				String[] arr = line.split("\\s");

				set.add(Integer.parseInt(arr[0]));
				set.add(Integer.parseInt(arr[1]));

			}

			System.out.println(set.size());
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
