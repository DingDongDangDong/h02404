package kr.ac.halla.ice.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class dhk {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("/home/jack/Wiki-Vote.txt");
			BufferedReader br = new BufferedReader(reader);
			int line1 = 0;
			// int line2 = 0;
			// int identifiers = 0;
			// int voter = 0;

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;

				if (line.startsWith("#")) {
					// line2--;// 설명문장은 제외시켜준다.
					continue;
				}

				// String[] arr = line.split(" ");

				// line2++;// 1번
				line1++;// 2번 1씩 증가해주면서 라인을 구한다.
				// identifiers = line2 * 2;
				// 모든 identifiers는 설명한 라인을 제외한 라인의 두배이다.
				// voter = line2;
				// voter는 설명한 라인을 제외한 라인수와 같다.

			}
			br.close();
			// System.out.println("1. " + line1 + "\n2. " + line2 + "\n3. " + identifiers +
			// "\n4. " + voter);// line1 :
			// 1번답,
			// line2:2번답,
			// identifiers
			// 3번답,
			// voter:4번답
			System.out.println(line1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}
}
