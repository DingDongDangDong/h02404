package kr.ac.halla.ics.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class Practice4 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");
			FileWriter fout = new FileWriter("/home/jack/CRAWDAD/email/Email-EuAll3.txt");

			BufferedReader br = new BufferedReader(fin);
			BufferedWriter bw = new BufferedWriter(fout);

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				// should include new line \n
				bw.write(line + "\n");
				bw.flush();
			}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
