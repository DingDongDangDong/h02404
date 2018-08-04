package kr.ac.halla.ics.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Process the number of lines in a file not started with #
 * 
 * @author jack
 *
 */
public class Assignment2 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");

			BufferedReader br = new BufferedReader(fin);

			int numLine = 0;

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == false)
					numLine++;
			}
			System.out.println(numLine);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
