package BatailleNavale2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShip {

	@Test
	void test1() {
		Ship ship1 = new Ship(new BoardPlot(1,1), ShipModel.DESTROYER, Direction.UP);
		Plot plot = new BoardPlot(1,1);
		ship1.isOnPlot(plot);
		assertTrue(true);
	}
	
	@Test
	void test2() {
		Ship ship1 = new Ship(new BoardPlot(1,1), ShipModel.DESTROYER, Direction.UP);
		Plot plot = new BoardPlot(2,1);
		ship1.isOnPlot(plot);
		assertFalse(false);
	}
	
	@Test
	void test3() {
		Ship ship1 = new Ship(new BoardPlot(8,1), ShipModel.SUBMARINE, Direction.UP);
		Plot plot = new BoardPlot(8,2);
		ship1.isOnPlot(plot);
		assertTrue(true);
	}
	
	@Test
	void test4() {
		Ship ship1 = new Ship(new BoardPlot(8,1), ShipModel.SUBMARINE, Direction.UP);
		Plot plot = new BoardPlot(8,4);
		ship1.isOnPlot(plot);
		assertFalse(false);
	}
}

