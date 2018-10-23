package kr.ac.halla.ice.advanced_programming.week5q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;

public class P4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/jack/tcoauthor.txt"));

		HashSet<Integer> m1970 = new HashSet<Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("%"))
				continue;

			String[] arr = line.split("\\|");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			long timestamp = Long.parseLong(arr[2]);
			Date date = new Date(timestamp);
			if (date.getYear() == 70) {
				m1970.add(left);
				m1970.add(right);
			}
		}

		System.out.println(m1970.size());
		bufferedReader.close();
	}

}
