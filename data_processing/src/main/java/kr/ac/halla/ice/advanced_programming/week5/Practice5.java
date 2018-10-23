package kr.ac.halla.ice.advanced_programming.week5;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, ParseException {

		long currentMil = System.currentTimeMillis();
		Date date = new Date(currentMil);
		System.out.println(date.getYear() + 1900);

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String dateStr = sdf.format(date);
		System.out.println(dateStr);

		Date parsedDate = sdf.parse("2018-09-26");
		System.out.println(parsedDate);
	}
}
