package BatailleNavale2;

import java.util.ArrayList;
import java.util.List;

public class BoardPlot implements Plot{
	
	private int abscissa;
	private int ordinate;

	BoardPlot(int abscissa, int ordinate) {
		super();
		this.abscissa = abscissa;
		this.ordinate = ordinate;
	}

	List<BoardPlot> boardPlotList = new ArrayList<>();
	
	@Override
	public int getAbscissa() {
		return abscissa;
	}

	@Override
	public int getOrdinate() {
		return ordinate;
	}

	@Override
	// to find 1 new coordinate(case) according to direction
	public Plot getPlotTo(Direction direction) {
		int newCoordAbscissa = abscissa;
		int newCoordOrdinate = ordinate;
		
		if(direction == Direction.DOWN) {
			newCoordOrdinate--;
		}
		if(direction == Direction.UP) {
			newCoordOrdinate++;
		}
		if(direction == Direction.LEFT) {
			newCoordAbscissa--;
		}
		if(direction == Direction.RIGHT) {
			newCoordAbscissa++;
		}
		
		// creation of the new coordinate(case)
		BoardPlot boardPlot = new BoardPlot(newCoordAbscissa,newCoordOrdinate);
		return boardPlot;
	}
	
}
