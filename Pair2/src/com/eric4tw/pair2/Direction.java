package com.eric4tw.pair2;

public enum Direction {

    EAST {
        public Direction turnLeft() {
            return Direction.NORTH;
        }

        public Direction turnRight() {
            return Direction.SOUTH;
        }

        public Direction halfTurn() {
            return Direction.WEST;
        }

        public Coordinate changeRelative(Coordinate coordinate) {
            return new Coordinate(coordinate.getY(), coordinate.getX());
        }
    },

    WEST {
        public Direction turnLeft() {
            return Direction.SOUTH;
        }

        public Direction turnRight() {
            return Direction.NORTH;
        }

        public Direction halfTurn() {
            return Direction.EAST;
        }

        public Coordinate changeRelative(Coordinate coordinate) {
            return new Coordinate(-coordinate.getY(), coordinate.getX());
        }
    },

    NORTH {
        public Direction turnLeft() {
            return Direction.WEST;
        }

        public Direction turnRight() {
            return Direction.EAST;
        }

        public Direction halfTurn() {
            return Direction.SOUTH;
        }

        public Coordinate changeRelative(Coordinate coordinate) {
            return coordinate;
        }
    },

    SOUTH {
        public Direction turnLeft() {
            return Direction.EAST;
        }

        public Direction turnRight() {
            return Direction.WEST;
        }

        public Direction halfTurn() {
            return Direction.NORTH;
        }

        public Coordinate changeRelative(Coordinate coordinate) {
            return new Coordinate(-coordinate.getX(), -coordinate.getY());
        }
    };

    public abstract Direction turnLeft();

    public abstract Direction turnRight();

    public abstract Direction halfTurn();

    public abstract Coordinate changeRelative(Coordinate coordinate);

}
