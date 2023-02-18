import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
	public static int MAX_ROW=30;
	public static int MAX_COL=30;
	public int rowSize;
	public int colSize;
	public char [][]board=new char[MAX_ROW][MAX_COL];
	public boolean [][]isVisited=new boolean[MAX_ROW][MAX_COL];
	
	public final Coord exitPoint;
	private Bug bug=new Bug();
	private Stack<Bug> s=new Stack<>();
	
	public Maze(String fileName) throws FileNotFoundException {
		
		Scanner mazeReader=new Scanner(new File(fileName));
		int i=0;
		int j=0;
		while(mazeReader.hasNext()) {
			String line=mazeReader.nextLine();
			if(line.charAt(0)=='0'||line.charAt(0)=='1') {
				int l=0;
				while(l<line.length()) {
					board[i][l]=line.charAt(l);
					l++;
				}
				colSize=line.length();
			}
			i++;
			
		}
		rowSize=i;
		exitPoint=new Coord(rowSize-1, colSize-1);
		System.out.println(bug);
	}
	
	public void Solve() {
		int i=0;
		while(!bug.getPos().equals(exitPoint)) {
			
			determineDirectionAndTakeStep(bug);
			
		}
	}
	private void determineDirectionAndTakeStep(Bug bug2) {
		int x=0;
		int y=0;
	//	determineNewPos(bug.getDirection());
		
		
	}
/*
	private  determineNewPos(int dir) {
		int x;
		int y;
		if(dir==0) {
			y=-1;
		}else if(dir==1) {
			x=1;
			y=-1;
		}else if(dir==2) {
			x=1;
		}else if(dir==3) {
			x=1;
			y=1;
		}else if(dir==4) {
			y=1;
		}else if(dir==5) {
			x=-1;
			y=1;
		}else if(dir==6) {
			x=-1;
		}else if(dir==7) {
			x=-1;
			y=-1;
		}
	}  */

	public void print() {
		int i=0;
		int j=0;
		System.out.println("Maze ("+rowSize+","+colSize+")");
		while(i<rowSize) {
			j=0;
			
			while(j<colSize) {
				if(bug.getPos().getX()==i && bug.getPos().getY()==j)
					System.out.print('#');
				else
					System.out.print(board[i][j]);
				j++;
			}
			i++;
			System.out.println();
		}
	}


}
