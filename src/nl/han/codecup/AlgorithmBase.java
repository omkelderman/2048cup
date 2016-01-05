package nl.han.codecup;

import nl.han.codecup.Game.Direction;
import nl.han.codecup.Game.Tile;

public interface AlgorithmBase {
	
	public final long SLIDE_INTERVAL = 1000;

	public Direction slide(Board board);
	
}
