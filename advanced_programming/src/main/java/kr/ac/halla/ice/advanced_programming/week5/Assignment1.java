package kr.ac.halla.ice.advanced_programming.week5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Abstract citation.txt dataset with a class
 * 
 * constructor and getter and setter
 * 
 * callspan
 * 
 * # <- meta
 * 
 * split \t
 * 
 * @author jack
 *
 */
public class Assignment1 {

	public static void main(String[] args) {

		ArrayList<Citation> citationList = new ArrayList<Citation>();

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/arxiv-hep-ph-coauth/trim.txt");

			BufferedReader br = new BufferedReader(fin);

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("%") == true)
					continue;
				String[] arr = line.split("\\s");

				String sourceID = arr[0];
				String destinationID = arr[1];
				long timestamp = Long.parseLong(arr[3]);

				Citation citation = new Citation(sourceID, destinationID, timestamp);
				citationList.add(citation);
			}

			Iterator<Citation> iter = citationList.iterator();
			while (iter.hasNext()) {
				Citation citation = iter.next();
				System.out.println(citation);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
