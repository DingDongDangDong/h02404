package kr.ac.halla.ics.advanced_programming.week2;

/**
 * Loop: for loop
 * 
 * Array
 * 
 * String.split(regex)
 * 
 * continue
 * 
 * break
 * 
 * 
 * @author jack
 *
 */
public class Practice5 {

	public static void main(String[] args) {

		// google Java
		String java = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";

		// \\s indicates white-space
		String[] spaceSplit = java.split("\\s");

		// Pattern 1
		System.out.println("[Pattern 1]");
		for (int i = 0; i < spaceSplit.length; i++) {
			System.out.println(spaceSplit[i]);
		}
		
		// Pattern 2
		System.out.println("[Pattern 2]");
		for(String elem : spaceSplit){
			System.out.println(elem);
		}
		
		// Continue and Break
		System.out.println("[Continue and Break]");
		for(int i = 0 ; i < spaceSplit.length; i++) {
			if( i == 3 )
				continue;
			if( i == 8 )
				break;
			System.out.println(spaceSplit[i]);
		}
		
	}

}
