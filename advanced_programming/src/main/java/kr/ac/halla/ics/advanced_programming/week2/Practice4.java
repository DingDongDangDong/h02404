package kr.ac.halla.ics.advanced_programming.week2;

import java.util.Scanner;

/**
 * Branch: If then else
 * 
 * Relational operator: >=
 * 
 * Logical operator: &&
 * 
 * @author jack
 *
 */
public class Practice4 {

	public static void main(String[] args) {
		System.out.print("What is your point (0~100): ");
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();

		if (point >= 90) {
			System.out.println("Your grade: A");
		} else if (point >= 80 && point < 90) {
			System.out.println("Your grade: B");
		} else if (point >= 70 && point < 80) {
			System.out.println("Your grade: C");
		} else if (point >= 60 && point < 70) {
			System.out.println("Your grade: D");
		} else {
			System.out.println("Your grade: F");
		}

		scanner.close();
	}

}
