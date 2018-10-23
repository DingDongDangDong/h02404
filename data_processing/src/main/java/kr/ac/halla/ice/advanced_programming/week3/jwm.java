package kr.ac.halla.ice.advanced_programming.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class jwm {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 오류 던짐

		FileReader reader = new FileReader("/home/jack/Wiki-Vote.txt");// 파일 읽어옴
		BufferedReader bf = new BufferedReader(reader);// 버퍼로 읽음
		int linenum1 = 0;// 라인총갯수 측정용
		int linenum2 = 0;// #제외라인측정용
		int linenum3 = 0;// id 총갯수
		int linenum4 = 0;// 좌측용
		while (true) {
			String line = bf.readLine();
			if (line == null)
				break;// 읽기끝
			if (line.startsWith("#")) {
				linenum1++;
				continue;
			}
			String arr[] = line.split("\\s");

			if (arr[0] != null) {
				linenum3++;
				linenum4++;
			}
			if (arr[1] != null) {
				linenum3++;
			}
			linenum1++;// 라인 총갯수 측정완료
			linenum2++;// #제외 측정 완료
		}
		System.out.println("1번:총라인수:" + linenum1 + " 2번:#제외 라인수:" + linenum2);// 1번 2번 답
		System.out.println("3번:id갯수:" + linenum3 + " 4번:왼쪽id라인수:" + linenum4);// 3번 4번답

	}

}
