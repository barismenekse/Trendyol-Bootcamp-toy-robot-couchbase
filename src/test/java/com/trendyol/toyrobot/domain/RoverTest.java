package com.trendyol.toyrobot.domain;

import static org.junit.jupiter.api.Assertions.*;

import com.trendyol.toyrobot.concretes.East;
import com.trendyol.toyrobot.concretes.North;
import com.trendyol.toyrobot.concretes.South;
import com.trendyol.toyrobot.concretes.West;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void should_create_rover() {
        Rover rover = createNorthRover();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals(North.class, rover.getCompass().getClass());
    }

    @Test
    public void should_move_forward_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.move();
        assertEquals(1, rover.getY());
    }

    @Test
    public void should_move_forward_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.move();
        assertEquals(1, rover.getX());
    }

    @Test
    public void should_move_forward_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.move();
        assertEquals(-1, rover.getY());
    }

    @Test
    public void should_move_forward_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.move();
        assertEquals(-1, rover.getX());
    }

    @Test
    public void should_turn_left_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.turnLeft();
        assertEquals(West.class, rover.getCompass().getClass());
    }

    @Test
    public void should_turn_left_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.turnLeft();
        assertEquals(South.class , rover.getCompass().getClass());
    }

    @Test
    public void should_turn_left_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnLeft();
        assertEquals(East.class, rover.getCompass().getClass());
    }

    @Test
    public void should_turn_left_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnLeft();
        assertEquals(North.class, rover.getCompass().getClass());
    }

    @Test
    public void should_turn_right_when_compass_is_north () {
        Rover rover = createNorthRover();
        rover.turnRight();
        assertEquals(East.class, rover.getCompass().getClass());
    }

    @Test
    public void should_turn_right_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnRight();
        assertEquals(South.class, rover.getCompass().getClass());
    }

    @Test
    public void should_turn_right_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnRight();
        assertEquals(West.class, rover.getCompass().getClass());
    }

    @Test
    public void should_turn_right_when_compass_is_west () {
        Rover rover = createWestRover();
        rover.turnRight();
        assertEquals(North.class, rover.getCompass().getClass());
    }

    private Rover createWestRover() {
        return new Rover(0, 0, new West());
    }

    private Rover createSouthRover() {
        return new Rover(0, 0, new South());
    }

    private Rover createEastRover() {
        return new Rover(0, 0, new East());
    }

    private Rover createNorthRover() {
        return new Rover();
    }
}
