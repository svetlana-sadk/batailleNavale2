package BatailleNavale2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBoardPlot {

	@Test
	void test() {
		BoardPlot boardPlot = new BoardPlot(5,5);
		// need to instantiate from Plot because of implementation of methods of interface Plot
		final Plot boardPlotExpected = boardPlot.getPlotTo(Direction.UP); // final - to not able to change object
		assertEquals(6, boardPlotExpected.getOrdinate());
	}

}
