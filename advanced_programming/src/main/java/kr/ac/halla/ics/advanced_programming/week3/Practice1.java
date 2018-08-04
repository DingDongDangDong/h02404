package kr.ac.halla.ics.advanced_programming.week3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * File input to Standard output
 * 
 * @author jack
 *
 */
public class Practice1 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");

			// Read each character from a file
			// At the end of file, read() returns -1
			int c;
			while (true) {
				c = fin.read();
				if (c == -1) {
					break;
				}

				System.out.print((char) c);
			}

			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
