package kr.ac.halla.ice.advanced_programming.week7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * SimpleDateFormat
 * 
 * Week 5-1
 * 
 * @author jack
 *
 */
public class Practice6 {

	public static void main(String[] args) throws ParseException {

		String dateString1 = "2004-09-10 21:01:36";
		String dateString2 = "2005-09-10 21:01:36";
		String dateString3 = "2002-09-10 21:01:36";
		String dateString4 = "2004-09-13 21:01:36";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = sdf.parse(dateString1);
		Date date2 = sdf.parse(dateString2);
		Date date3 = sdf.parse(dateString3);
		Date date4 = sdf.parse(dateString4);

		TreeSet<Date> dateSet = new TreeSet<Date>();
		dateSet.add(date1);
		dateSet.add(date2);
		dateSet.add(date3);
		dateSet.add(date4);
		Iterator<Date> iter = dateSet.descendingIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		iter = dateSet.iterator();
		while (iter.hasNext()) {
			System.out.println(sdf.format(iter.next()));
		}
	}
}
