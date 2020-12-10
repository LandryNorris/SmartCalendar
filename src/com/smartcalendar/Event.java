package com.smartcalendar;

import java.util.Date;

public class Event {

	// INT TYPES
	//

	//Days of Week Types
	static final byte SUNDAY = 0b01000000;
	static final byte MONDAY = 0b00100000;
	static final byte TUESDAY = 0b00010000;
	static final byte WEDNESDAY = 0b00001000;
	static final byte THURSDAY = 0b00000100;
	static final byte FRIDAY = 0b00000010;
	static final byte SATURDAY = 0b00000001;
	
	//PRIORITY SCALE
	static final int PRIORITY_CONSTANT=10000000;
	static final int PRIORITY_HIGH=10000;
	static final int PRIORITY_MEDIUM=1000;
	static final int PRIORITY_LOW=100;
	static final int PRIORITY_OVERLAP=0;
	
	
	
	Date start;
	Date end;
	int priority;
	String name;
	String description;
	String type;
	byte days = 0;
	
	
	///Possible additional parameters
	boolean mergable;
	boolean splittable;

	
	/**
	 * 
	 * @param start
	 * @param duration    duration of the event in milliseconds
	 * @param priority
	 * @param name
	 * @param description
	 * @param type
	 */
	public Event(Date start, int duration, int priority, String name, String description, String type) {
		this.start = start;
		this.end = new Date(start.getTime() + duration * 60000);
		this.priority = priority;
		this.name = name;
		this.description = description;
		this.type = type;
	}

	public void addRepeatDay(byte day) {
		days |= day;
	}

	public void removeRepeatDay(byte day) {
		days &= ~day;
	}

	public boolean isRepeatDay(byte day) {

		return (days & day) != 0;

	}



}
