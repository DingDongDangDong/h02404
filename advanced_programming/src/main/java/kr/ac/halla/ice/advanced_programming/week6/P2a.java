package kr.ac.halla.ice.advanced_programming.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class P2a {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/jack/Email-EuAll.txt"));

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

		Set<Integer> r93285 = emailList.parallelStream().map(email -> {
			if (email.getSenderID() == 93285)
				return email.getReceiverID();
			return null;
		}).filter(email -> email != null).collect(Collectors.toSet());

		System.out.println("r93285: " + r93285.size());

		Set<Integer> rr93285 = emailList.parallelStream().map(email -> {
			if (r93285.contains(email.getSenderID()))
				return email.getReceiverID();
			return null;
		}).filter(email -> email != null).collect(Collectors.toSet());

		System.out.println("rr93285: " + rr93285.size());
	}
}
