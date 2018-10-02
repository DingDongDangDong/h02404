package kr.ac.halla.ice.advanced_programming.week5q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class P6 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/jack/tcoauthor.txt"));

		ArrayList<Long> tList = new ArrayList<Long>();
		ArrayList<Long> sList = new ArrayList<Long>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("%"))
				continue;

			String[] arr = line.split("\\|");

			long timestamp = Long.parseLong(arr[2]);
			tList.add(timestamp);
		}

		for (int i = 0; i < tList.size(); i++) {
			long v = tList.get(i);
			int idx = getIndexForInsert(sList, v);
			if (idx == -2)
				continue;
			if (idx != -1)
				sList.add(idx, v);
			else
				sList.add(v);
		}

		long last = sList.get(sList.size() - 1);
		long last1 = sList.get(sList.size() - 2);
		long last2 = sList.get(sList.size() - 3);
		System.out.println(last + "\t" + last1 + "\t" + last2);
		bufferedReader.close();
	}

	public static int getIndexForInsert(ArrayList<Long> arrayList, long val) {

		int idx = -1;
		for (int i = 0; i < arrayList.size(); i++) {
			if (val < arrayList.get(i)) {
				idx = i;
				break;
			}
			if (val == arrayList.get(i)) {
				idx = -2;
				break;
			}
		}
		return idx;
	}

}
