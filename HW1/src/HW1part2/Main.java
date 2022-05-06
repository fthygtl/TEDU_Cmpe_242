package HW1part2;

import java.io.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
	// we initialize our que
	myQueue que = new myQueue();
		
		// to read a file 
		File myFile = new File("COVID19.txt");
		
		
		// scanner
		Scanner scan = new Scanner(myFile);
		int count = 0;
		int sum = 0;
		
		
		// we first set the capacity of vaccine
		 que.setCapacity(scan.nextInt());
       
      //if there is a line it scans the line 
		while (scan.hasNextLine()) { 
         
         // and creating groups
			Group group = new Group(scan.next(), scan.nextInt());

			
			// we enqueue the groups
			que.enqueue(group);
			
			
			
			
			
		
			
			

		}
		
		// we do all these thing in something method
		que.something();
		

		
		
	}

}
