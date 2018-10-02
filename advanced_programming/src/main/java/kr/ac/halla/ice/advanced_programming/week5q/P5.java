package kr.ac.halla.ice.advanced_programming.week5q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public class P5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/jack/tcoauthor.txt"));

		HashMap<Integer, Integer> dayCount = new HashMap<Integer, Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("%"))
				continue;

			String[] arr = line.split("\\|");
//			int left = Integer.parseInt(arr[0]);
//			int right = Integer.parseInt(arr[1]);
			long timestamp = Long.parseLong(arr[2]);
			Date date = new Date(timestamp);
			//  (0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday)
			if (dayCount.containsKey(date.getDay())) {
				int cnt = dayCount.get(date.getDay());
				dayCount.put(date.getDay(), ++cnt);
			} else {
				dayCount.put(date.getDay(), 1);
			}

		}

		System.out.println(dayCount);
		bufferedReader.close();
	}

}
