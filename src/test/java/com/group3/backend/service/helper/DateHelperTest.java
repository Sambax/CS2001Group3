package com.group3.backend.service.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

public class DateHelperTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	@Test
	void canGetMidnightToday() {
		Date midnightToday = DateHelper.getStartOfDayXDaysInAdvance(0);
		String midnightString = sdf.format(midnightToday);
		Date now = new Date();
		String nowString = sdf.format(now);
		
		assertEquals(nowString.split(" ")[0], midnightString.split(" ")[0]); //day is the same
		assertEquals("00:00:00", midnightString.split(" ")[1]); //time is the same
	}
	
	@Test
	void canAddDays() {
		int daysToAdd = 35;
		
		Date futureDate = DateHelper.getStartOfDayXDaysInAdvance(daysToAdd);
		Date now = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(now);
		calendar.add(Calendar.DATE, daysToAdd);
		
		String futureDateString = sdf.format(futureDate);
		String datePart = futureDateString.split(" ")[0];
		String timePart = futureDateString.split(" ")[1];
		
		assertEquals(calendar.get(Calendar.YEAR), Integer.parseInt(datePart.split("-")[0]));
		assertEquals(calendar.get(Calendar.MONTH)+1, Integer.parseInt(datePart.split("-")[1]));
		assertEquals(calendar.get(Calendar.DATE), Integer.parseInt(datePart.split("-")[2]));
		
		assertEquals(0, Integer.parseInt(timePart.split(":")[0]));
		assertEquals(0, Integer.parseInt(timePart.split(":")[1]));
		assertEquals(0, Integer.parseInt(timePart.split(":")[2]));
	}
	
	@Test
	void canSubtractDays() {
		int daysToAdd= -35;
		
		Date futureDate = DateHelper.getStartOfDayXDaysInAdvance(daysToAdd);
		Date now = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(now);
		calendar.add(Calendar.DATE, daysToAdd);
		
		String futureDateString = sdf.format(futureDate);
		String datePart = futureDateString.split(" ")[0];
		String timePart = futureDateString.split(" ")[1];
		
		assertEquals(calendar.get(Calendar.YEAR), Integer.parseInt(datePart.split("-")[0]));
		assertEquals(calendar.get(Calendar.MONTH)+1, Integer.parseInt(datePart.split("-")[1]));
		assertEquals(calendar.get(Calendar.DATE), Integer.parseInt(datePart.split("-")[2]));
		
		assertEquals(0, Integer.parseInt(timePart.split(":")[0]));
		assertEquals(0, Integer.parseInt(timePart.split(":")[1]));
		assertEquals(0, Integer.parseInt(timePart.split(":")[2]));
	}

}
