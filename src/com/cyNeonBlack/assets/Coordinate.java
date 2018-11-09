package com.cyNeonBlack.assets;

public class Coordinate {

	private int x, y;

	public Coordinate() {
		setX(0);
		setY(0);
	}

	public Coordinate(int _x, int _y) {
		setX(_x);
		setY(_y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
