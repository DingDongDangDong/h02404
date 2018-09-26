package kr.ac.halla.ice.advanced_programming.week7;

import java.util.LinkedList;

/**
 * Queue practice
 * 
 * Week 5-1
 * 
 * @author jack
 *
 */
public class Practice2 {

	public static void main(String[] args) {

		LinkedList<String> queue = new LinkedList<>();
		//enqueue
		queue.add("abc");
		queue.add("def");
		queue.add("xfg");
		queue.add("fds");
		
		while(queue.isEmpty() == false) {
			//dequeue
			String first = queue.remove();
			System.out.println(first);
		}
		
		System.out.println(queue.size());
	}
}
