package com.smartcalendar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class CalendarView extends JComponent {

	private static final long serialVersionUID = 1328651987L;

	private Calendar calendar;

	CalendarView() {
		calendar = new Calendar();
	}

	@Override
	public void paintComponent(Graphics graphics) {
		Graphics2D g = (Graphics2D) graphics;
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());

		drawEvents();
	}

	void drawEvents() {
		for(int i = 0; i < calendar.events.size(); i++) {

		}
	}

	int[] getDaysFromByte(byte days) {
		int[] result = new int[7];
		for(int i = 1; i < 8; i++) {
			if((days & (1<<i)) != 0) {
				result[i] = 1;
			}
		}

		return result;
	}
}
