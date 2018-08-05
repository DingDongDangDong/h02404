package kr.ac.halla.ice.advanced_programming.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CitationTrim {

	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("/home/jack/CRAWDAD/arxiv-hep-ph-coauth/out.ca-cit-HepPh");
			FileWriter fout = new FileWriter("/home/jack/CRAWDAD/arxiv-hep-ph-coauth/trim.txt");

			BufferedReader br = new BufferedReader(fin);
			BufferedWriter bw = new BufferedWriter(fout);

			int c = 0;
			while (true) {
				String line = br.readLine();
				if (c == 500000)
					break;
				c++;
				bw.write(line+"\n");
			}
			fout.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
