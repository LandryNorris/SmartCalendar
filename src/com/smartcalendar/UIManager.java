package com.smartcalendar;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class UIManager {

	Canvas canvas;
	JFrame frame;
	
	static UIManager openNew() {
		int width = 1000;
		int height = 500;
		JFrame frame = new JFrame("Smart Calendar");
		Canvas canvas = new Canvas();
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setPreferredSize(new Dimension(width, height));

		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.pack();
		UIManager manager = new UIManager(frame, canvas);
		
		return manager;
	}
	
	UIManager(JFrame frame, Canvas canvas) {
		this.frame = frame;
		this.canvas = canvas;
	}

}
