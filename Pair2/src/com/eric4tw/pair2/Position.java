package com.eric4tw.pair2;

public class Position {
	
	private static final char MOVE = 'M';
	private static final char RIGHT = 'R';
	private static final char LEFT = 'L';

	private Coordinate coordinate;
	private Direction direction;

	public Position(int aX, int aY, Direction direction) {
		coordinate = new Coordinate(aX,aY);
		this.direction = direction;
	}

	public void move(char instruction) {
		switch (instruction) {
		case LEFT:
			turnLeft();
			break;
		case RIGHT:
			turnRight();
			break;
		case MOVE:
			moveAhead();
			break;
		default:
			break;
		}
	}

	public void moveAhead() {
		coordinate = coordinate.add(direction.moveAhead());
	}

	public void turnRight() {
		direction = direction.turnRight();
	}

	public void turnLeft() {
		direction = direction.turnLeft();
	}

	public Object getDirection() {
		return direction;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (coordinate != null ? !coordinate.equals(position.coordinate) : position.coordinate != null) return false;
        if (direction != position.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coordinate != null ? coordinate.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
