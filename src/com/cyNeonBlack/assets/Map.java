package com.cyNeonBlack.assets;

import java.awt.image.BufferedImage;

public class Map {

	public BufferedImage background;
	public Coordinate[] path;

	public Map(BufferedImage _img, Coordinate[] _path) {
		setPath(_path);
		setBackground(_img);
	}

	public void setPath(Coordinate[] _path) {
		this.path = _path;
	}

	public void setBackground(BufferedImage _img) {
		this.background = _img;
	}

	public Coordinate[] getPath() {
		return this.path;
	}

	public BufferedImage getBackground() {
		return this.background;
	}

}
