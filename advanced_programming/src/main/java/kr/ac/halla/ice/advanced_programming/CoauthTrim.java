package kr.ac.halla.ice.advanced_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CoauthTrim {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("e:\\out.ca-cit-HepPh"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("e:\\tcoauthor.txt"));

		int cnt = 0;
		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			if (line.startsWith("%")) {
				writer.write(line + "\n");
				continue;
			}
			if (cnt > 500000)
				break;

			String[] arr = line.split("\\s");

			writer.write(arr[0] + "|" + arr[1] + "|" + arr[3] + "\n");
			cnt++;
		}

		reader.close();
		writer.close();
	}

}
