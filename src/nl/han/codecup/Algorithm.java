package nl.han.codecup;

import nl.han.codecup.Game.Direction;

public class Algorithm implements AlgorithmBase {

	public Direction slide(Board board) {
		System.out.println(board.get(3, 3));
		return Direction.RIGHT;
	}

}
