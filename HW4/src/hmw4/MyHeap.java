package hmw4;

public class MyHeap {

	 int size=0;
	 int arraySize=20;
	  schedule [] arr = new schedule[arraySize];
	  
	  
	  private void expand() {
		  arraySize = 2*arraySize;
		  schedule [] arr1 = new schedule[arraySize];
		  
		  
		  
		  for(int i =0;i<size;i++) {
			  
			  arr1[i]=arr[i];
		  }
		  arr=arr1;
	  }
	  
	 private void shrink() {
		 arraySize = arraySize/2;
		  schedule [] arr1 = new schedule[arraySize];
		  
		  
		  
		  for(int i =0;i<size;i++) {
			  
			  arr1[i]=arr[i];
		  }
		  arr=arr1;
		 
		 
	 }
	  
	  
	  
	  public void insert(schedule val) {
		  if(size ==arraySize-2 ) {
			  
			  expand();
		  }
		  
		
	    arr[size] = val;
	    int index = size;
	    int parent = (index - 1)/2;
	    
	    while(parent >= 0 && arr[index].compareTo(arr[parent])==1) {
	      schedule t = arr[parent];
	      arr[parent] = arr[index];
	      arr[index] = t;
	      
	      int a = parent;
	      index = parent;
	      parent = (a - 1) / 2;
	    }
	    
	    size++;
	  }
	  
	  public String peek() {
		  try {
			  return arr[0].toString();
		  }
 catch(ArrayIndexOutOfBoundsException exception) {
			  
			  return "the queue is empty";
		  }
	  }
	  
	  public schedule poll() {
		  try {
			  schedule max = arr[0];
			    arr[0] = arr[size -1];
			    size = size - 1;
			    if(size == (arraySize-2)/2) {
					  
					  shrink();
				  }
			    minHeapify(0);
			    return max;
			  
		  }
	    
		  
		  catch(ArrayIndexOutOfBoundsException exception) {
			  schedule sc =new schedule();
			  sc.name="the queue is empty";
			  
			  return sc;
		  }
		  
		  
		  
		  
		  
	  }
	  
	  public void minHeapify(int index) {
	    int l, r;
	    l = 2 * index + 1;
	    r = 2 * index + 2;
	    
	    int smallest = index; 
	    if(l < this.size && arr[l].compareTo( arr[smallest])==1) {
	      smallest = l;
	    }
	    
	    if(r < this.size && arr[r].compareTo( arr[smallest])==1) {
	      smallest = r;
	    }
	    
	    if(smallest != index) {
	      schedule t = arr[smallest];
	      arr[smallest] = arr[index];
	      arr[index] = t;
	      
	      minHeapify(smallest);
	    }
	  }
	  
	  public void buildMinHeap(schedule[] arr) {
	    this.arr = arr;
	    this.size = arr.length;
	    
	    for(int i = size/2 - 1; i >= 0; i--) {
	      minHeapify(i);
	    }
	  }
	



	public static void main(String[] args) {
		
		MyHeap h = new MyHeap();
		schedule sc = new schedule();
		sc.deadline=1233;
		schedule sc1 = new schedule();
		sc1.deadline=2324;
		schedule sc2 = new schedule();
		sc2.deadline=4566;
		schedule sc3 = new schedule();
		sc3.deadline=1442;
		schedule sc4 = new schedule();
		sc4.deadline=2939;
		schedule sc5 = new schedule();
		sc5.deadline=7545;
		schedule sc6 = new schedule();
		sc6.deadline=2039;
		schedule sc7 = new schedule();
		sc7.deadline=5959;
		
		
		
		
		
		
		
		
		
		
		
		h.insert(sc);
		h.insert(sc1);
		h.insert(sc2);
		h.insert(sc3);
		h.insert(sc4);
		h.insert(sc5);
		h.insert(sc6);
		h.insert(sc7);		
		
		
		
		
		System.out.println(h.poll());
		System.out.println(h.poll());
		
		System.out.println(h.poll());
		
		System.out.println(h.poll());
		
		System.out.println(h.poll());
		
		System.out.println(h.poll());
		System.out.println(h.poll());
		System.out.println(h.poll());
		System.out.println(h.poll());
		System.out.println(h.poll());
		System.out.println(h.poll());
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

