package com.eric4tw.pair2;

public enum Command {

    LEFT('L') {
        public Position run(Position position) {
            return position.turnLeft();
        }
    },

    RIGHT('R') {
        public Position run(Position position) {
            return position.turnRight();
        }
    },

    MOVE('M') {
        public Position run(Position position) {
            return position.moveAhead();
        }
    };

    Command(char identifier) {
        this.identifier = identifier;
    }

    private final char identifier;

    public static Position command(char instruction, Position position) {
        for (Command cmd : values()) {
            if (cmd.identifier == instruction)
                return cmd.run(position);
        }
        throw new IllegalArgumentException("command " + instruction + " is undefined.");
    }

    public abstract Position run(Position position);
}
