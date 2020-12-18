package com.smartcalendar;

import javax.swing.JFrame;
import java.awt.*;

public class UIManager {

	CalendarView calendarView;
	JFrame frame;
	
	static UIManager openNew() {
		int width = 1000;
		int height = 500;
		JFrame frame = new JFrame("Smart Calendar");
		CalendarView calendarView = new CalendarView();
		calendarView.setMaximumSize(new Dimension(10000, 10000));
		calendarView.setMinimumSize(new Dimension(width, height));
		calendarView.setPreferredSize(new Dimension(width, height));

		frame.add(calendarView);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.pack();
		UIManager manager = new UIManager(frame, calendarView);
		System.out.println("Opened Frame.");
		return manager;
	}
	
	UIManager(JFrame frame, CalendarView calendarView) {
		this.frame = frame;
		this.calendarView = calendarView;
	}

}
