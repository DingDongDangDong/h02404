package kr.ac.halla.ice.advanced_programming.week2_1;

/**
 * Class: How to abstract a concept
 * 
 * Constructor
 * 
 * toString overriding
 * 
 * getter setter with Eclipse IDE
 * 
 * @author jack
 *
 */

public class Practice8 {

	public static void main(String[] args) {

		// Jack has a lecture N223
		Relationship relationship1 = new Relationship("Jack", "hasLecture", "N223");
		Relationship relationship2 = new Relationship("James", "takeLecture", "N223");
		Relationship relationship3 = new Relationship("Jill", "takeLecture", "N223");
		Relationship relationship4 = new Relationship("Mark", "takeLecture", "N223");
		
		Relationship[] relationships = new Relationship[4];
		relationships[0] = relationship1;
		relationships[1] = relationship2;
		relationships[2] = relationship3;
		relationships[3] = relationship4;
		
		for(Relationship relationship: relationships) {
			System.out.println(relationship);
		}
	}
}