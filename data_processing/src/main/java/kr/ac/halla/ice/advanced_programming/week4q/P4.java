package kr.ac.halla.ice.advanced_programming.week4q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class P4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\Email-euAll.txt"));
		
		HashSet<Integer> a = new HashSet<Integer>();
		HashSet<Integer> b = new HashSet<Integer>();

		while (true) {

			String line = bufferedReader.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			a.add(Integer.parseInt(arr[0]));
			b.add(Integer.parseInt(arr[1]));
		}

		b.removeAll(a);
		System.out.println(b.size());
		bufferedReader.close();
	}
}
