package game;

import game.Piece;

public class Field {

private Coordinate coordinate;
	
	private Piece piece;
	
	public Field(Coordinate coordinate, Piece piece) {
		this.coordinate = coordinate;
		this.piece = piece;
	}
	
	public Field(Coordinate coordinate) {
		this(coordinate, null);
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public Piece getPiece() {
		return piece;
	}
	
	public boolean equals(Field field) {
		if (field.getCoordinate().equals(coordinate))
			return true;
		return false;
	}
	
	public boolean isOccupied() {
		if(piece == null) {
			return false;
		}
		return true;
	}
	
	public String getPieceString() {
		if(piece == null) {
			return " ";
		}
		return piece.toString();
	}
	
	public void releasePiece() {
		piece = null;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
}
