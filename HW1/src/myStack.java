import java.util.Scanner;
import java.util.Stack;

public class myStack {
	
	Node head;
	
	int size=0;
	
	

	// we check if our head is empty or not in here
	public boolean isEmpty() {
		if(head== null) {
			return true;
			 
		}else
			return false;
		
			
	}
	// we return our size here
	public int size() {
		
		return size;
		
		}


// we add element in our stack with push method

public void push(VaccineStock z) {
	
	// created new node
	Node node =new Node(z);
	
	// we set z parameter as our vaccine node 
	node.Vaccine=z;
	// we set our node's next as null
	node.next=null;
	
	// if it is empty stack we set our node as a head of the stack
	if(isEmpty()) {
		head=node;
	
	}
	else {
		// if it is not empty 
	// we said node n is head
		Node n =head;
// while n.next is becoming equal we set n as n.next
		// we try to reach and of the stack (tail)
		
		while(n.next != null) {
			// we set n as n.next for every node 
			n=n.next;
		}
		n.next=node;
	
	}
	// and we add element in our stack so make size++
	size++;
}

// we delete elements in pop method
public  void pop() {
	// if it is empty 
	if(isEmpty()) {
		// we just print stack underflow. Because there is no Node to pop
		System.out.println("stack underflow");
		}
	else {
// if it is not empty 
		// we have special case for single node 
	if(size == 1) {
		// we print it and set our single Node (head) as null because we pop it
		System.out.println(head.Vaccine);
		head = null;
		 
		 
	}else {
		// if it is not empty
	// we said Node n is head and Node n1 is null
		Node n =head;
		Node n1 =null;
	// for every Node we set our n's next as n1
		for(int i = 0;i<size-1;i++){
	n1=n.next;
		}
		// and we set last n's next as n1
	n.next=n1.next;
	// we print that deleted element
	System.out.println(n1.Vaccine);
		
	}
	}
	size--;
}
	


// We show the most recently inserted item on the stack without removing it.

public VaccineStock peek () {
	// we said node n = head beacuse it is our last added element
	Node n =head;
	
		System.out.println(n.Vaccine);
	// and returned 
	return n.Vaccine;

	
	
}
// In here we displays the action menu and returns the user’s choice

int action() {
	int userchoice = 0;
	
	System.out.println("(ADD/DELETE/EXIT)?");
	
	Scanner keyboard = new Scanner(System.in);
	String input = keyboard.next();
	String[] command = input.split(" ");
	switch (command[0]) {
	
		 case "ADD":
			 userchoice = 1;
	          
	  		break;
		case "DELETE":
			userchoice = 2;
			break;
			
		case"EXIT":
			userchoice = 3;
			break;
	}

return userchoice;
	
}



// print method for printing the elements of the stack starting from top to bottom.
public void print() {
	// if stack is empty we print "The stack is empty"
	if(isEmpty()) {
		System.out.println("The stack is empty");
	}
	else {
		// we print the elements in the stack until our last node's next is null
	Node n =head;
	while(n.next !=null) {
		System.out.println(n.Vaccine);
		n=n.next;
		
	}
	// when user press exit it will bring elements in the stack
	System.out.println(n.Vaccine);
	}
	
}
	
	




































}
