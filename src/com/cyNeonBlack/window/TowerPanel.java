package com.cyNeonBlack.window;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

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

		int mx = MouseInfo.getPointerInfo().getLocation().x - this.getLocationOnScreen().x;
		int my = MouseInfo.getPointerInfo().getLocation().y - this.getLocationOnScreen().y;

		g.setColor(new Color(255, 255, 255, 96));
		if (mx > -1 && my > -1) {
			mx -= mx % RES;
			my -= my % RES;
			g.fillRect(mx, my, RES, RES);
		}
	}

	public void render() {

		repaint();
	}
}
