import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// we create new stack
		myStack stack = new myStack();

		
	// we will scan the user input
		Scanner keyboard = new Scanner(System.in);
		
// we created check value that type of boolean and we turned false in the  EXIT choice because we want to finish while loop after EXIT.
		boolean check = true;
	
		while (check) {
			System.out.println("Enter COMMAND(ADD/DELETE/EXIT)?");
// we use array and input.split to use the command in switch-case 
			String input = keyboard.next();
			String[] command = input.split(" ");
			
			
			switch (command[0]) {
			// if case is ADD we add the serialnumber country and numberofvaccines informations our stack as a node  with stack.push
			case "ADD":
				System.out.println("Enter ITEM DATA?");
				 int SerialNumber = keyboard.nextInt();
				  String country = keyboard.next();
				 int numberOfVaccines = keyboard.nextInt();
					VaccineStock vc = new VaccineStock(SerialNumber,country,numberOfVaccines);
					stack.push(vc);
			
				 
				break;
// we delete the head (the top elements)
			case "DELETE":
				stack.pop();
			   
								
				

				break;
				// we print our last modified stacks and type of boolean values make false
			case"EXIT":
				stack.print();
				check = false;
				
			}
			
			
		} 
		
		}
		
	}

