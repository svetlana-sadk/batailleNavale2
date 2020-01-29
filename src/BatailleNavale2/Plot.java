package BatailleNavale2;

public interface Plot {
	
	public int getAbscissa(); //X

	public int getOrdinate(); // Y
	
	public Plot getPlotTo(Direction direction);
}
