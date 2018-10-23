package kr.ac.halla.ice.advanced_programming.week4q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class P6 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		HashSet<Integer> s117480 = new HashSet<Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);
			if (receiver == 117480) {
				s117480.add(sender);
			}
		}

		System.out.println("s117480: " + s117480.size());

		bufferedReader.close();

		bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));

		HashSet<Integer> ss117480 = new HashSet<Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int sender = Integer.parseInt(arr[0]);
			int receiver = Integer.parseInt(arr[1]);
			if (s117480.contains(receiver)) {
				ss117480.add(sender);
			}
		}

		System.out.println("ss117480: " + ss117480.size());

		bufferedReader.close();
	}
}
