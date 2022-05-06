package hmw4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main1 {

	MyHeap que = new MyHeap();
	
	long time =0;
	long time1=0;
	
	public void read() {
		
		try {
		      File myObj = new File("input.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		    	  
		        String data = myReader.nextLine();
		        String array[] = data.split(" ");
		        if(array[0].equals("run")){
		        	time1 = Long.parseLong(array[1]);
		        	
		        }
		        else {
		        	schedule sc = new schedule();
		        	sc.name=array[1];
			        sc.deadline=Long.parseLong(array[2]);
			        sc.duration=Long.parseLong(array[3]);
			        que.insert(sc);
			       System.out.println(time+": adding "+ sc.name+" with deadline "+ 
			        sc.deadline+" and duration "+sc.duration);
			      
		        }
		        
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}

	

	public void run() {
		
		
		
		while(true) {
			
			schedule s = new schedule();
			
			s= que.poll();
			if(s.name.equals("the queue is empty")){
				break;
				
			}
			System.out.println(time +": busy with "+s.name+" with deadline "+s.deadline+" and "+"duration "+s.duration);
			time =time+s.duration;
			if(time>time1) {
				long time3 = (time -time1);
				s.duration=time3;
				que.insert(s);
				System.out.println(time1+": adding "+ s.name+" with deadline "+ 
				        s.deadline+" and duration "+s.duration);
				break;

			}else {
				
				System.out.println(time + ": Done with "+s.name);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		}
		
		


	
	
	
	
	
	public void action() {
		read();
		run();


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

main1 m = new main1();
		
		m.action();
		
		
		
		
		
		
		
		
		
		
	}

}
