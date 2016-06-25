package com.eric4tw.pair2;

public class Coordinate {

	private int x;
	private int y;

	public Coordinate(int aX, int aY) {
		x = aX;
		y = aY;
	}
	
	public  void  add(Coordinate coordinate){
		x += coordinate.x;
		y += coordinate.y;
	}

	private int getY() {
		return y;
	}

	private int getX() {
		return x;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Coordinate coordinate = (Coordinate) o;

		if (x != coordinate.x) return false;
		if (y != coordinate.y) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		return result;
	}
}
