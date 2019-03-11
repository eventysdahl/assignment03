package game;

import game.PlayerType;

public class Piece {

	private PlayerType player;
	
	public Piece(PlayerType player) {
		this.player = player;
		}
	
	public String toString() {
		return player.toString();
	}
	
	public PlayerType getPlayer() {
		return player;
	}
	
	public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
		if(initPos.equals(finalPos)) {
			return false;
		}
		
		if(Math.abs(initPos.getY()-finalPos.getY())==1 && Math.abs(initPos.getX()-finalPos.getX())==1) {
			if(this.getPlayer() == PlayerType.One) {
				if(initPos.getY() > finalPos.getY()) {
					return true;
				}
			}
			if(this.getPlayer() == PlayerType.Two) {
				if(initPos.getY() < finalPos.getY()) {
					return true;
				}
			}
		}
		return false;
	
}
}
