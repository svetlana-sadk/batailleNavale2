package BatailleNavale2;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	private Plot firstPlot;
	private ShipModel shipModel;
	private Direction direction;
	
	List<Plot> coordinatesList;
	
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
			// calculer case suivante
			Plot nextPlot = currentPLot.getPlotTo(direction);
			// et ajouter case suivante dans la liste des cases
			coordinatesList.add(nextPlot);
		}
	}
	
	public boolean isOnPlot(Plot plot) {
		for (Plot coord : coordinatesList) {
		if (coordinatesList.contains(plot)) {
			return true;
			}
		}
		return false;
	}
}
