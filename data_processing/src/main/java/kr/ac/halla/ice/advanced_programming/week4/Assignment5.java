package kr.ac.halla.ice.advanced_programming.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import kr.ac.halla.ice.advanced_programming.week2_1.Relationship;

/**
 * Create ArrayList of Relationship
 * 
 * @author jack
 *
 */
public class Assignment5 {

	public static void main(String[] args) {

		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/email/Email-EuAll.txt");

			BufferedReader br = new BufferedReader(fin);

			ArrayList<Relationship> relationshipList = new ArrayList<Relationship>();

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.startsWith("#") == true)
					continue;
				String[] arr = line.split("\t");

				Relationship rel = new Relationship(arr[0], "sendEmailTo", arr[1]);
				relationshipList.add(rel);
			}

			Iterator<Relationship> iterator = relationshipList.iterator();
			while (iterator.hasNext()) {
				Relationship rel = iterator.next();
				System.out.println(rel);
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
