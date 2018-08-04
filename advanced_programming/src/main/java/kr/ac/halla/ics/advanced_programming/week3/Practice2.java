package kr.ac.halla.ics.advanced_programming.week3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * String to File output
 * 
 * @author jack
 *
 */
public class Practice2 {

	public static void main(String[] args) {

		try {

			String outputMessage = "Hello World!";

			FileWriter fout = new FileWriter("/home/jack/CRAWDAD/email/helloworld.txt");

			fout.write(outputMessage);

			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
