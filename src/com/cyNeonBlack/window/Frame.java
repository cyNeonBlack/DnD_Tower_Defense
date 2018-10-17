package com.cyNeonBlack.window;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new Frame();
			}
		});
	}

	private Frame() {

		setFocusable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MainPanel p = new MainPanel(this);

		add(p);
		pack();
		setLocationRelativeTo(null);

	}

}
