package kr.ac.halla.ice.advanced_programming.week5q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/jack/tcoauthor.txt"));

		int lineNum = 0;

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("%"))
				continue;

			String[] arr = line.split("\\|");
			long timestamp = Long.parseLong(arr[2]);
			if (timestamp > 928620000)
				lineNum++;
		}

		System.out.println(lineNum);
		bufferedReader.close();
	}

}
