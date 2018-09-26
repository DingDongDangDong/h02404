package kr.ac.halla.ice.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ap2201332021 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("/home/jack/Email-EuAll.txt");
		BufferedReader br = new BufferedReader(reader);

		// 라인수를 잡는 변수.
		int lineCnt = 0;
		while (true) {

			String line = br.readLine();
			if (line == null)
				break;

			else if (line.startsWith("#"))
				continue;

			lineCnt = lineCnt + 1;
			String[] arr = line.split("\t");

			System.out.println("first : " + arr[0] + "\t" + "second : " + arr[1]);
			System.out.println("라인 번호 " + lineCnt);
			// 파일을 writer 하는 메소드

		}
		br.close();

	}
}
