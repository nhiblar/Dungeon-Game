package main;

public class Room {
	
	private char[][] tempRoom;
	private boolean monster;
	private boolean north, east, south, west;
	private boolean key;
	private boolean healPotion, manaPotion, visionPotion;
	private boolean trap;
	
	public Room(char[][] tempRoom, int keyCount) {
		
		if(Dice.d10() > 4) { this.monster = true; }
		if(Dice.d10() > 8) { this.trap = true; }
		if(Dice.d10() > 9 && keyCount < 4) { this.key = true; }
		
		if(Dice.d8() > 6) {
			int potionType = Dice.d4();
			if(potionType >  2) this.healPotion = true;
			if(potionType == 2) this.manaPotion = true;
			if(potionType == 1) this.visionPotion = true;
		}
		
		setDoors(tempRoom);
	}
	
	public void printRoom(char[][] dungeon, int xLoc, int yLoc) {
		
		this.tempRoom = setRoomAscii(dungeon, xLoc, yLoc);
		
		for(int i = 0; i < 5; i++) {	      
			for(int k = 0; k < 9; k++) {
				System.out.print(this.tempRoom[i][k]);
			}
			System.out.println();
		}
	}
	
	private void setDoors(char[][] tempRoom) {
		
		if(tempRoom[0][4] == ' ') setNorth(true);
			else setNorth(false);
		if(tempRoom[2][8] == ' ') setEast(true);
			else setEast(false);
		if(tempRoom[4][4] == ' ') setSouth(true);
			else setSouth(false);
		if(tempRoom[2][0] == ' ') setWest(true);
			else setWest(false);
	}

	public char[][] setRoomAscii(char[][] dungeon, int xLoc, int yLoc) {
			
			char[][] tempRoom = new char[5][9];
		
			for(int i = 0; i < 5; i++) {	      
				for(int k = 0; k < 9; k++) {
						tempRoom[i][k] = dungeon[xLoc+i][yLoc+k];
				}
			}

			if(this.monster) tempRoom[1][2] = 'M';
			if(this.healPotion || this.manaPotion || this.visionPotion) tempRoom[1][6] = 'P';
			if(this.key) tempRoom[3][2] = 'K';
			if(this.trap) tempRoom[3][6] = 'T';
			
			return tempRoom;
		}
	
	public boolean hasMonster() { return (this.monster); }
	public boolean hasKey() { return (this.key); }
	public boolean hasTrap() { return (this.trap); }
	public boolean hasPotion() { return (this.healPotion || this.manaPotion || this.visionPotion); }
	public boolean hasHealPotion() { return this.healPotion; }
	public boolean hasManaPotion() { return this.manaPotion; }
	public boolean hasVisionPotion() { return this.visionPotion; }
	
	public void setNorth(boolean set) { this.north = set; }
	public boolean getNorth() { return this.north; }
	
	public void setEast(boolean set) { this.east = set; }
	public boolean getEast() { return this.east; }
	
	public void setSouth(boolean set) { this.south = set; }
	public boolean getSouth() { return this.south; }
	
	public void setWest(boolean set) { this.west = set; }
	public boolean getWest() { return this.west; }

}
