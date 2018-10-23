package kr.ac.halla.ice.advanced_programming.week6;

import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class P1 {

	public static void main(String[] args) throws IOException {
		TreeSet<Citation> citationSet = new TreeSet<Citation>();
		citationSet.add(new Citation(2, 5, 7));
		citationSet.add(new Citation(3, 4, 6));
		citationSet.add(new Citation(2, 3, 11));
		citationSet.add(new Citation(1, 7, 14));
		citationSet.add(new Citation(7, 2, 17));
		citationSet.add(new Citation(5, 9, 20));
		citationSet.add(new Citation(11, 1, 4));

		Iterator<Citation> iter = citationSet.iterator();
		while (iter.hasNext()) {
			Citation cite = iter.next();
			System.out.println(cite);
		}
	}
}
