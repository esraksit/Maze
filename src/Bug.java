
public class Bug {
	private Coord pos=new Coord(0, 0);
	private int direction=0;//0=N 1=NE 2=E 3=SE 4=S 5=SW 6=W 7=NW 
	
	public Coord getPos() {
		return pos;
	}

	public void setPos(Coord pos) {
		this.pos = pos;
	}
	public Bug() {
		
		
	}
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Bug "+pos+direction+"\n";
	}
	


	private static int i=1;
	
	public void takeStep() {
		Coord newPos=new Coord(0, i);
		i++;
		
	}
	
}

