package com.eric4tw.pair2;

public enum Direction {

    EAST {
        public Direction turnLeft() {
            return Direction.NORTH;
        }

        public Direction turnRight() {
            return Direction.SOUTH;
        }

        public Coordinate moveAhead() {
            return new Coordinate(1, 0);
        }
    },

    WEST {
        public Direction turnLeft() {
            return Direction.SOUTH;
        }

        public Direction turnRight() {
            return Direction.NORTH;
        }

        public Coordinate moveAhead() {
            return new Coordinate(-1, 0);
        }
    },

    NORTH {
        public Direction turnLeft() {
            return Direction.WEST;
        }

        public Direction turnRight() {
            return Direction.EAST;
        }

        public Coordinate moveAhead() {
            return new Coordinate(0, 1);
        }
    },

    SOUTH {
        public Direction turnLeft() {
            return Direction.EAST;
        }

        public Direction turnRight() {
            return Direction.WEST;
        }

        public Coordinate moveAhead() {
            return new Coordinate(0, -1);
        }
    };

    public abstract Direction turnLeft();

    public abstract Direction turnRight();

    public abstract Coordinate moveAhead();

}
