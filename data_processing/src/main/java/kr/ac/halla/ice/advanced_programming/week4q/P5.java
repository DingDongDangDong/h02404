package kr.ac.halla.ice.advanced_programming.week4q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class P5 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		HashSet<Integer> r93285 = new HashSet<Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);
			if (sender == 93285) {
				r93285.add(receiver);
			}
		}

		System.out.println("r93285: " + r93285.size());

		bufferedReader.close();

		bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		HashSet<Integer> rr93285 = new HashSet<Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);
			if (r93285.contains(sender)) {
				rr93285.add(receiver);
			}
		}

		System.out.println("rr93285: " + rr93285.size());

		bufferedReader.close();
	}
}
