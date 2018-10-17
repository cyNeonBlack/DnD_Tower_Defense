package com.cyNeonBlack.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ScorePanel extends JPanel {

	private MainPanel mp;

	public int score, lives, cash;
	public int width, height;
	private static int RES;

	public ScorePanel(MainPanel _mp) {

		mp = _mp;
		RES = MainPanel.RES;
		setup();

	}

	private void setup() {

		width = RES * 4;
		height = RES * 2;
		setBounds(mp.width - width, 0, width, height);

		score = 0;

	}

	public void paintComponent(Graphics g) {

		g.clearRect(0, 0, width, height);

		g.setColor(new Color(100, 0, 0));
		g.fillRect(0, 0, width, height);

		g.setColor(new Color(255, 255, 255));
		g.setFont(new Font("Monospaced", Font.BOLD, 32));

		g.drawString("Lives: ", RES / 2, height / 4 * 1 + RES / 8);
		g.drawString("Cash : ", RES / 2, height / 4 * 2 + RES / 8);
		g.drawString("Score: ", RES / 2, height / 4 * 3 + RES / 8);

		g.drawString("" + lives, width - RES / 2 * 3, height / 4 * 1 + RES / 8);
		g.drawString("" + cash,  width - RES / 2 * 3, height / 4 * 2 + RES / 8);
		g.drawString("" + score, width - RES / 2 * 3, height / 4 * 3 + RES / 8);

	}

	public void render() {
		repaint();
	}

}
