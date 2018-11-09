package com.cyNeonBlack.window;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

import javax.swing.JPanel;

import com.cyNeonBlack.assets.Map;

public class MapPanel extends JPanel {

	private MainPanel mp;

	private Map map;
	private final int RES;

	public int width, height;

	public MapPanel(MainPanel _mp, Map _m) {

		this.map = _m;
		RES = mp.RES;

		setup();
	}

	private void setup() {

		width = RES * 16;
		height = RES * 12;

		setBounds(0, 0, width, height);
	}

	public void render() {
		repaint();
	}

	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(map.getBackground(), 0, 0, null);

		// Draw Cursor
		int mx = MouseInfo.getPointerInfo().getLocation().x - this.getLocationOnScreen().x;
		int my = MouseInfo.getPointerInfo().getLocation().y - this.getLocationOnScreen().y;
		g.setColor(new Color(255, 255, 255, 96));
		mx -= mx % RES;
		my -= my % RES;
		g.fillRect(mx, my, RES, RES);
	}
}
