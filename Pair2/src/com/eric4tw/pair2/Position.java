package com.eric4tw.pair2;

import java.util.function.UnaryOperator;

public class Position {
	
	private Coordinate coordinate;
	private Direction direction;

	public Position(int aX, int aY, Direction direction) {
		coordinate = new Coordinate(aX,aY);
		this.direction = direction;
	}

    public Position(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Position addCoordinate(Coordinate coordinate) {
        return new Position(this.coordinate.add(coordinate), direction);
    }

    public Position changeDirection(UnaryOperator<Direction> op) {
        return new Position(coordinate, op.apply(direction));
    }

	public Direction getDirection() {
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
