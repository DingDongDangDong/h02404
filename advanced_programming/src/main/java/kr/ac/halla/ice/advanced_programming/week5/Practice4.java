package kr.ac.halla.ice.advanced_programming.week5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		// Load the dataset via ArrayList
		ArrayList<Email> emailList = new ArrayList<Email>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);

			Email email = new Email(sender, receiver);
			emailList.add(email);
		}

		bufferedReader.close();

		// reuse emailList

		HashSet<Integer> r93285 = new HashSet<Integer>();

		Iterator<Email> iterator = emailList.iterator();
		while (iterator.hasNext()) {

			Email email = iterator.next();

			if (email.getSenderID() == 93285) {
				r93285.add(email.getReceiverID());
			}
		}

		System.out.println("r93285: " + r93285.size());

		HashSet<Integer> rr93285 = new HashSet<Integer>();

		iterator = emailList.iterator();
		while (iterator.hasNext()) {
			Email email = iterator.next();
			if (r93285.contains(email.getSenderID())) {
				rr93285.add(email.getReceiverID());
			}
		}

		System.out.println("rr93285: " + rr93285.size());
	}
}
