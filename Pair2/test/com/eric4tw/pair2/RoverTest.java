package com.eric4tw.pair2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class RoverTest {

	@Test
	public void turnsToWIfInstructionIsLAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Direction.NORTH));
		rover.command('L');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 1, Direction.WEST)));
	}

	@Test
	public void turnsToEIfInstructionIsLAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Direction.SOUTH));
		rover.command('L');
		Position position = rover.getCurrent();
		assertThat(position, is(new Position(1, 1, Direction.EAST)));
	}

	@Test
	public void turnsToNIfInstructionIsLAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Direction.EAST));
		rover.command('L');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 1, Direction.NORTH)));
	}

	@Test
	public void turnsToSIfInstructionIsLAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Direction.WEST));
		rover.command('L');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 1, Direction.SOUTH)));
	}

	@Test
	public void turnsToEIfInstructionIsRAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Direction.NORTH));
		rover.command('R');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 1, Direction.EAST)));
	}

	@Test
	public void turnsToWIfInstructionIsRAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Direction.SOUTH));
		rover.command('R');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 1, Direction.WEST)));
	}

	@Test
	public void turnsToSIfInstructionIsRAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Direction.EAST));
		rover.command('R');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 1, Direction.SOUTH)));
	}

	@Test
	public void turnsToNIfInstructionIsRAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Direction.WEST));
		rover.command('R');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 1, Direction.NORTH)));
	}

	@Test
	public void movesInYIfInstructionIsMAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Direction.NORTH));
		rover.command('M');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 2, Direction.NORTH)));
	}

	@Test
	public void movesInXIfInstructionIsMAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Direction.EAST));
		rover.command('M');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(2, 1, Direction.EAST)));
	}

	@Test
	public void movesInReverseYIfInstructionIsMAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Direction.SOUTH));
		rover.command('M');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(1, 0, Direction.SOUTH)));
	}

	@Test
	public void movesInReverseXIfInstructionIsMAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Direction.WEST));
		rover.command('M');
		Position position = rover.getCurrent();
        assertThat(position, is(new Position(0, 1, Direction.WEST)));
	}
}
