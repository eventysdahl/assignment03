package game;

import game.PlayerType;

public class Board {

	
	public static Field[][] fields = new Field[8][8];
	
	
	public Board() {
		setFields();
		setOnePieces();
		setTwoPieces();
	}
	
	public void setFields() {
		for(int i = 0; i<fields.length;i++) {
			for( int j = 0;j<fields[i].length;j++) {
				fields[i][j] = new Field(new Coordinate(i,j));
			}
		}
	}
	
	public void setOnePieces() {
		for(int i = 1;i<8;i+=2) {
			for(int j = 0;j<3;j+=2) {
				fields[i][j].setPiece(new Piece(PlayerType.One));
			}
		}
		for(int i = 0;i<8;i+=2) {
			for(int j = 1;j<2;j+=2) {
				fields[i][j].setPiece(new Piece(PlayerType.One));
			}
		}
	}
	
	public void setTwoPieces() {
		for(int i = 0;i<8;i+=2) {
			for(int j = 5;j<8;j+=2) {
				fields[i][j].setPiece(new Piece(PlayerType.Two));
			}
		}
		for(int i = 1;i<8;i+=2) {
			for(int j = 6;j<8;j+=2) {
				fields[i][j].setPiece(new Piece(PlayerType.Two));
			}
		}
	}
		
	
	public void printBoard() {
		for (int y=0;y<8;y++){
			for(int x=0;x<8;x++)
			{
				System.out.print(fields[x][y].getPieceString()+" ");
			}
			System.out.print('\n');
		}
	}
	
	
}
