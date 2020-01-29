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

	//List<BoardPlot> boardPlotList = new ArrayList<>();
	
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

	// need to override method equals for correct working of the method (contains) in the method isOnPlot
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + abscissa;
		result = prime * result + ordinate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardPlot other = (BoardPlot) obj;
		if (abscissa != other.abscissa)
			return false;
		if (ordinate != other.ordinate)
			return false;
		return true;
	}
	
}
