package main;

public class Dungeon {
	
	private int xLoc = 0;
	private int yLoc = 0;
	char[][] dungeon =  {
	//0    1    2    3    4    5    6    7    8      9   10   11   12   13   14   15   16   17     18   19   20   21   22   23   24   25   26     27   28   29   30    31
	{'#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#'},
	
	{'#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#'},
	
	{'#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#'},
	
	{'#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#'},
	
	{'#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', ' ', ' ', ' ', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',   ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#',   '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	{'#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '#', '#', '#', '#', '#', '#', '#',   '#', '#', '-', 'E', 'X', 'I', 'T', '-', '#'},
		};

	public void printVisionPotion() {
		
		int xHere = this.xLoc + 2;
		int yHere = this.yLoc + 4;
		
		int xStart = this.xLoc;
		int xStop  =  this.xLoc + 5;
		int yStart = this.yLoc;
		int yStop  =  this.yLoc + 9;
		
    	if(xStart < 5) xStart = 0;
    	if(xStart > 4) xStart -= 5;
		if(xStop  < 19) xStop += 5;
		
		if(yStart < 9) yStart = 0;
		if(yStart > 8) yStart -= 9;
		if(yStop < 34) yStop += 9;
		
		for(int i = xStart; i < xStop; i++) {	      
			for(int k = yStart; k < yStop; k++) {
				if(i == xHere && k == yHere)
					System.out.print('H');
				else
					System.out.print(dungeon[i][k]);
			}
			System.out.println();
		}
		
	}


	public int getXLoc() { return this.xLoc; }
	public int getYLoc() { return this.yLoc; }
	public void setXLoc(int x) {this.xLoc = x; }
	public void setYLoc(int y) {this.yLoc = y; }
	
	public void move(String direction, Room oldRoom) {
		
		Room cur = oldRoom;
		if(cur.getNorth() && direction.equals("w")) { this.xLoc -= 5; }
		if(cur.getEast() && direction.equals("d")) { this.yLoc += 9; }
		if(cur.getSouth() && direction.equals("s")) { this.xLoc += 5; }
		if(cur.getWest() && direction.equals("a")) { this.yLoc -= 9;}
		//System.out.println("Your path in that direction is blocked."); }
	}


	public char[][] getDungeon() { return this.dungeon; }
	
	
}//end class
