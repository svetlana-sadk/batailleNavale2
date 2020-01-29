package BatailleNavale2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShip {

	@Test
	void test1() {
		Ship ship1 = new Ship(new BoardPlot(1,1), ShipModel.DESTROYER, Direction.UP);
		Plot plot = new BoardPlot(1,1);
		boolean result = ship1.isOnPlot(plot);
		assertTrue(result);
	}
	
	@Test
	void test2() {
		Ship ship1 = new Ship(new BoardPlot(1,1), ShipModel.DESTROYER, Direction.UP);
		Plot plot = new BoardPlot(2,1);
		boolean result = ship1.isOnPlot(plot);
		assertFalse(result);
	}
	
	@Test
	void test3() {
		Ship ship1 = new Ship(new BoardPlot(8,1), ShipModel.SUBMARINE, Direction.UP);
		Plot plot = new BoardPlot(8,2);
		assertTrue(ship1.isOnPlot(plot));
	}
	
	@Test
	void test4() {
		Ship ship1 = new Ship(new BoardPlot(8,1), ShipModel.SUBMARINE, Direction.UP);
		Plot plot = new BoardPlot(8,4);
		assertFalse(ship1.isOnPlot(plot));
	}
}

