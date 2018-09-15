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
public class Assignment6 {

	public static void main(String[] args) {

		try {
			// FileReader fin = new FileReader("/home/jack/Email-EuAll.txt");
			FileReader fin = new FileReader("/home/jack/Wiki-Vote.txt");

			BufferedReader br = new BufferedReader(fin);

			long max = Long.MIN_VALUE;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				// String[] arr = line.split("\t");
				String[] arr = line.split("\\s");
				int val1 = Integer.parseInt(arr[0]);
				int val2 = Integer.parseInt(arr[1]);
				if (val1 > max)
					max = val1;
				if (val2 > max)
					max = val2;
			}

			System.out.println(max);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
