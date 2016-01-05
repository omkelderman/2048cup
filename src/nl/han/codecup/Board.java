package nl.han.codecup;

import nl.han.codecup.Game.Tile;

public class Board {
	
	private Tile[] tiles;
	
	private final int BOARD_SIZE = 4;
	
	public void setTiles(Tile[] tiles) {
		this.tiles = tiles;
	}

	public int get(int x, int y) {
		if(x >= BOARD_SIZE || x < 0 || y >= BOARD_SIZE || y < 0) {
			throw new IllegalArgumentException(String.format("x en y moeten tussen de 1 en de %s zijn", BOARD_SIZE));
		}
		return tiles[y * 4 + x].value;
	}
	
}
