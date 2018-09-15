package kr.ac.halla.ice.advanced_programming.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Process the number of source IDs with HashSet
 * 
 * Week 4-1
 * 
 * @author jack
 *
 */
public class Practice2 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/Email-EuAll.txt");

			BufferedReader br = new BufferedReader(fin);

			HashSet<Integer> idSet = new HashSet<Integer>();

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\t");

				idSet.add(Integer.parseInt(arr[0]));
				idSet.add(Integer.parseInt(arr[1]));
			}
			
			System.out.println(idSet.size());
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
