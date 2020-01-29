package BatailleNavale2;

public enum ShipModel {
	DESTROYER(2), SUBMARINE(3), CRUISER(4), BATTLESHIP(5); 
	
	private int size;
	
	ShipModel(int shipSize){
		this.size = shipSize; 
	}

	public int getSize() {
		return size;
	}
}
