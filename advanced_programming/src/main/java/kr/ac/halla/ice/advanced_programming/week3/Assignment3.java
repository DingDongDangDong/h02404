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
public class Assignment3 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");

			BufferedReader br = new BufferedReader(fin);

			long numID = 0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\t");
				numID = numID + arr.length;
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
