package kr.ac.halla.ice.advanced_programming.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Union of source IDs and destination IDs
 * 
 * @author jack
 *
 */
public class Assignment2 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");

			BufferedReader br = new BufferedReader(fin);

			HashSet<String> sourceIDSet = new HashSet<>();
			HashSet<String> destIDSet = new HashSet<>();
			
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\t");

				sourceIDSet.add(arr[0]);
				destIDSet.add(arr[1]);
				
			}
			sourceIDSet.addAll(destIDSet);
			System.out.println(sourceIDSet.size());
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
