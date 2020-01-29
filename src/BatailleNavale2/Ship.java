package BatailleNavale2;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	private Plot firstPlot; // always use interface class instead of subclass
	private ShipModel shipModel;
	private Direction direction;
	
	List<Plot> coordinatesList;
	
	// always use interface class instead of subclass
	public Ship(Plot firstPlot, ShipModel shipModel, Direction direction){
		this.firstPlot = firstPlot;
		this.shipModel = shipModel;
		this.direction = direction;
		this.coordinatesList = new ArrayList<>();
		
		// set first plot
		coordinatesList.add(firstPlot);
		
		//Plot nextPlot = this.firstPlot.getPlotTo(direction);
		
		Plot currentPLot = firstPlot;
		
		// Calculate all plots for this ship
		for (int i=1; i<shipModel.getSize(); i++) {
			// calculate next case
			Plot nextPlot = currentPLot.getPlotTo(direction);
			// add next case to the list of ship cases
			coordinatesList.add(nextPlot);
		}
	}
	
	// check if current plot is in the list of the coordinatesList of some ship
	// require override of comparison method equals (in BoardPlot class)
	public boolean isOnPlot(Plot plot) {
		for (Plot currentPlot : coordinatesList) {
		if (coordinatesList.contains(plot)) {
			return true;
			}
		}
		return false;
	}
}
