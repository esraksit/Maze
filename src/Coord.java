
public class Coord {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		boolean status=false;
		if( obj instanceof Coord) {
			Coord other=(Coord)obj;
			
			status= (other.x==this.x) && (other.y==this.y);
		}
		return status;
	}
	
	public  static void  main(String []s)
	{
		Coord p1=new Coord(1, 1);
		Coord p2=new Coord(1, 2);
		//System.out.println(p1.equals("hello world"));
	}
}
