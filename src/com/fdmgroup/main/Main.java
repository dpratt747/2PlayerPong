package com.fdmgroup.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Pong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		PongPanel pongPanel = new PongPanel();
		frame.add(pongPanel, BorderLayout.CENTER);
		Container c = frame.getContentPane();
				c.setBackground(Color.BLUE);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
