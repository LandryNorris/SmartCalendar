package com.smartcalendar;

import java.time.Instant;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		UIManager.openNew();
		
		
		Event event = new Event(new Date(),15,0,"Test","Hello",0);
		event.addRepeatDay(Event.SUNDAY);
		event.addRepeatDay(Event.WEDNESDAY);
		event.addRepeatDay(Event.SATURDAY);
		event.removeRepeatDay(Event.FRIDAY);
		
		System.out.printf(Integer.toBinaryString(event.days));
		
		
		
		
		
	}
}
