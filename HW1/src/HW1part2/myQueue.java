package HW1part2;

public class myQueue {
	
	
private int capacity =0;

// we have getter and setter for the vaccine capacity 
	/**
 * @return the capacity
 */
public int getCapacity() {
	return capacity;
}

/**
 * @param capacity the capacity to set
 */
public void setCapacity(int capacity) {
	this.capacity = capacity;
}


// we initialize our necessary variables

int totalstudent = 0;

	int capaticy = 4;

	int size;
	
	int first=0;
	int end=0;


	int count;
	
	
	Group myqueue[];
//our constructor for myQueue
	
	
	public myQueue() {
		first = end =0;
// we crate an array type of group and has size 4
		
		myqueue = new Group[capaticy];

	}
	
	
	// peek method to peek first element in the queue
	Group peek(Group z) {
		myqueue[first] = z;
		return z;
	}
//  method to check our group array is empty or not
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;

		} else {
			return false;
		}

	}
// method to check our array full or not
	
	public boolean isFull() {
		if (size == capaticy) {
			return true;
		} else {
			return false;
		}

	}
// to method that returning size
	
	public int size() {

		return size;

	}
	// if our array is full we called expand method and we make our arrays double sized with copying process
	
	private void expand() {
		
		// we make it our capaticy double
		
		capaticy = capaticy * 2;
		Group[] copied = new Group[capaticy];
		
		
		// we copied our array elements
		
		for (int i = 0; i < size; i++) {
			copied[i] = myqueue[i];
		}
		
		// and we make our arrays equal (we assign our copied arrays as our first array)
		myqueue = copied;
	}
// method to add  element in our queue
	
	public void enqueue(Group a) {
		if (isFull()) {
			
//if it is full we called our expand method and we make the size double
			
			expand();
			
// and at the end of the queue we assign our group
			
			myqueue[end] = a;
			end = (end+1);
			
			// and size++ because we add element
			
			size++;

		} else {
// if it is not full we didn't called expand method and we add element in the queue
			
			myqueue[end] = a;
			end++;
			// and size++ because we add element
			
			size++;

		}

	}
// method to make the arrays capacity half. Because our array's half is empty
	private void shrink() {
		capaticy = capaticy / 2 ;

		Group[] copied = new Group[capaticy];
		
//we assign all the elements that from myqueue to copied 
		for (int i = 0; i < size; i++) {
			copied[i] = myqueue[i];
			
		}
		// and we make it equal.
		myqueue = copied;
	}

	// dequeue method to delete element from queue
	
	public Group dequeue() {
		// if it is empty we return null because there is no element in the queue
		
        if (isEmpty()) {
               return null;
        } else {
        	// we make the size-- because we delete element 
        	
             size--;
           //assign elements to elements that come before them
             
       Group n = myqueue[first];
       for (int i = 0; i < size; i++) {
              myqueue[i] = myqueue[i + 1];
             
              
          
        }
      // and assign the last element in the queue as null.
       
      //because if we don't do this there will be like after the dequeue ([Group2 20, Group3 50, Group4 30, Group4 20])
       
       myqueue[size]=null;
              // and if we have half of the element in the queue we called shrink method
       
               if (capaticy == 2 * size) {
                      shrink();
               }
               return n;
        }
  }
        
	
	
        //method for printing queue
	
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(myqueue[i]);
		}
	}
	
	
	
	
	
	
	// with these method we run our vaccine app

	public void something() {
		// we initialize our variables
		
		int day = 1;
		int daynumber =0;
		int count = 0;
		int sum = 0;
		int countforstudent=0;
		// to array for the how many day spent and we add the array to find  which day has which groups
		
		String[] Arrayofday = new String[size];
		// for loop to find total number of students 
		
		for(int i1 = 0; i1<size; i1++) {
			totalstudent=totalstudent+myqueue[i1].getGroupSize();
		}
		
		
		// while size not equal to zero 
		while(size!=0) {
			// at first we assign sum and count 0
			sum =0;
			count=0;
		// we find the our sum of groups 
			
			for (int i = 0; i <size; i++) {
				sum = sum + myqueue[i].getGroupSize();
				
// But if our sum of groups size bigger than our vaccine capacit.
				
				if (sum <= capacity) {
// we increment count and countforstudent
					
					count++;
					countforstudent++;
					
					
				}

			}
// for the first iteration our count has 2 becasue group 1 and 2's total size is equal to our vaccine capacity. so for the first for loop we increment count two times
			
			for (int i = 0; i < count; i++) {
				
				// and in here we add our groups arrayofday array to print them
				
				if (Arrayofday[day] == null) {
					Arrayofday[day] ="day: "+ day +" "+ myqueue[i].toString();
					
					

				} else {

					Arrayofday[day] = Arrayofday[day] + " " + myqueue[i].toString();
					
					
				}

			
				
				
				
			}
			// we print Arrayofdays arrays elements
			System.out.println(Arrayofday[day]);
			day++;
			daynumber++;
			
			// and at the and we dequeue our elements that we printed 
			for(int i =0; i<count; i++) {
				dequeue();
				
			}
	      
			
		}
		
		
		// it prints total student
		System.out.println("Total Student:"+ totalstudent );
		
		// and it prints day number
		System.out.println("Total Day:"+ daynumber );
		
	}
	
	
	
}

