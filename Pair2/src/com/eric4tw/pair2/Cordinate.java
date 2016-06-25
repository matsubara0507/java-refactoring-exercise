package com.eric4tw.pair2;

public class Cordinate {

	private int x;
	private int y;

	public Cordinate(int aX, int aY) {
		x = aX;
		y = aY;
	}
	
	public  void  add(Cordinate cordinate){
		x += cordinate.x;
		y += cordinate.y;
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

		Cordinate cordinate = (Cordinate) o;

		if (x != cordinate.x) return false;
		if (y != cordinate.y) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		return result;
	}
}
