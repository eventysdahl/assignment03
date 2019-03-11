package game;

public enum PlayerType {
	One("1"), Two("2");
	
	private String value;
	
	PlayerType(String value){
		this.value = value;
	}
	
	public String toString() {
		return value;
	}
}