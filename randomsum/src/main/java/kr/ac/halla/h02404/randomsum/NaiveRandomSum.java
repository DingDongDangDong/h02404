package kr.ac.halla.h02404.randomsum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class NaiveRandomSum {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		BufferedWriter writer = null;
		if (args.length == 1)
			writer = new BufferedWriter(new FileWriter(args[0]));
		else
			writer = new BufferedWriter(new FileWriter("/home/jack/results.csv"));

		while (true) {
			System.out.println("Insert the total number of five numbers from 12 to 20: (0 will exit the program");
			int tot = scan.nextInt();

			if (tot == 0) {
				System.out.println("Good Bye");
				break;
			}

			if (tot < 60) {
				System.out.println("[Please insert the number larger than or equal to 60]");
				continue;
			}

			if (tot > 100) {
				System.out.println("[Please insert the number less than or equal to 100]");
				continue;
			}

			while (true) {
				int v1 = r.nextInt(9) + 12;
				int v2 = r.nextInt(9) + 12;
				int v3 = r.nextInt(9) + 12;
				int v4 = r.nextInt(9) + 12;
				int v5 = r.nextInt(9) + 12;
				if ((v1 + v2 + v3 + v4 + v5 == tot)) {
					System.out.println(tot + "\t=\t" + v1 + "\t" + v2 + "\t" + v3 + "\t" + v4 + "\t" + v5);
					writer.write(tot + "\t=\t" + v1 + "\t" + v2 + "\t" + v3 + "\t" + v4 + "\t" + v5 + "\n");
					break;
				}
			}
		}
		writer.close();
		scan.close();
	}
}
