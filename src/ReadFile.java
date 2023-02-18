import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.Stack;

public class ReadFile {
		
	
	public static void read() throws FileNotFoundException {
		Path p =new Path();
		File file = new File("maze.txt");
	    Scanner input = new Scanner(file); 
	    int row=11;
	    int column=15;
	    int [][] maze = new int [row][column];
	
	    while (input.hasNext()) {
	      
	   //   System.out.println(word);
	      for(int j=0;j<row;j++) {
	    	  String word  = input.next();
	      for(int i=0;i<word.length();i++) {
	    	  int num=49-word.charAt(i);
	    	  if(num==1) {
	    		  num=0;
	    	  }
	    	  else { num=1; }
	    	  maze[j][i]=num;
	    	  System.out.print( maze[j][i]);
	      
	     }
	      System.out.println( );
	      }
	   
	    }
	p.findPath(maze);
		   }
		   
		  
   

}
