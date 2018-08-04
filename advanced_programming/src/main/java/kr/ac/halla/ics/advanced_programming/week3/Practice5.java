package kr.ac.halla.ics.advanced_programming.week3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File input to File output
 * 
 * @author jack
 *
 */
public class Practice5 {

	public static void main(String[] args) {

		try {
			long startTime = System.currentTimeMillis();
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");
			FileWriter fout = new FileWriter("/home/jack/CRAWDAD/email/Email-EuAll2.txt");
			// Read each character from a file
			// At the end of file, read() returns -1
			int c;
			while (true) {
				c = fin.read();
				if (c == -1) {
					break;
				}
				fout.write((char) c);
			}
			fout.close();
			fin.close();
			long endTime = System.currentTimeMillis();
			System.out.println("Takes " + (endTime-startTime));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
