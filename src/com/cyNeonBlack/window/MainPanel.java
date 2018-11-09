package com.cyNeonBlack.window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.cyNeonBlack.handlers.MapHandler;

public class MainPanel extends JPanel {

	public Frame frame;
	public ScorePanel scorePanel;
	public TowerPanel towerPanel;
	public MapPanel mapPanel;

	public int width, height;

	public static int RES = 64;

	private Timer t = new Timer();
	private TimerTask painter, gameLoop;

	public MainPanel(Frame f) {
		frame = f;

		setup();
		start();
	}

	private void setup() {

		setLayout(null);

		width = RES * 20;
		height = RES * 12;
		setPreferredSize(new Dimension(width, height));

		scorePanel = new ScorePanel(this);
		add(scorePanel);
		towerPanel = new TowerPanel(this);
		add(towerPanel);

		// Map setup
		MapHandler.initMaps();

		mapPanel = new MapPanel(this, MapHandler.maps.get(0));
		add(mapPanel);

	}

	private void update() {

	}

	public void paintComponent(Graphics g) {

		g.clearRect(0, 0, width, height);
		g.setColor(new Color(0, 100, 0));
		g.fillRect(0, 0, width, height);

	}

	private void render() {
		repaint();
	}

	private void start() {

		gameLoop = new TimerTask() {

			@Override
			public void run() {

				update();
			}
		};

		painter = new TimerTask() {

			@Override
			public void run() {

				render();
				scorePanel.render();
				towerPanel.render();
				if (mapPanel != null)
					mapPanel.render();
			}
		};

		t.scheduleAtFixedRate(painter, 0, Math.round(1000 / 60f));
		t.scheduleAtFixedRate(gameLoop, 0, Math.round(1000 / 30f));

	}

}
