package kr.ac.halla.ice.advanced_programming.week4q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class P7 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		int totNum = 0;
		while (true) {
			String line = bufferedReader.readLine();
			if (line == null)
				break;
			totNum++;
		}

		bufferedReader.close();

		bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		HashSet<Occurrence> occurrenceSet = new HashSet<Occurrence>();

		int lineNum = 0;
		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);

			Iterator<Occurrence> iterator = occurrenceSet.iterator();
			Occurrence existLeft = null;
			while (iterator.hasNext()) {
				Occurrence occ = iterator.next();
				if (occ.getId() == sender) {
					existLeft = occ;
				}
			}

			if (existLeft != null) {
				existLeft.setId(existLeft.getId() + 1);
			} else {
				occurrenceSet.add(new Occurrence(sender, 1));
			}

			iterator = occurrenceSet.iterator();
			Occurrence existRight = null;
			while (iterator.hasNext()) {
				Occurrence occ = iterator.next();
				if (occ.getId() == receiver) {
					existRight = occ;
				}
			}

			if (existRight != null) {
				existRight.setId(existRight.getId() + 1);
			} else {
				occurrenceSet.add(new Occurrence(receiver, 1));
			}

			System.out.println(++lineNum + "/" + totNum);
		}

		int maximum = -1;

		Iterator<Occurrence> iterator = occurrenceSet.iterator();
		while (iterator.hasNext()) {
			Occurrence occ = iterator.next();
			if (occ.getOccurrence() > maximum)
				maximum = occ.getOccurrence();
		}
		System.out.println(maximum);
		bufferedReader.close();
	}
}
