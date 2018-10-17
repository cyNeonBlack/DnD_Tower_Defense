package com.cyNeonBlack.window;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TowerPanel extends JPanel {

	private MainPanel mp;

	public int width, height;
	private int RES;

	public TowerPanel(MainPanel _mp) {

		mp = _mp;
		setup();
	}

	private void setup() {

		RES = MainPanel.RES;

		width = RES * 4;
		height = mp.height - RES * 2;

		setBounds(mp.width - width, RES * 2, width, height);

	}

	public void click(int _mx, int _my) {

	}

	public void paintComponent(Graphics g) {

		g.clearRect(0, 0, width, height);

		g.setColor(new Color(0, 0, 100));
		g.fillRect(0, 0, width, height);
	}

	public void render() {

		repaint();
	}
}
