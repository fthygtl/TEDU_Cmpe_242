package hmw4;

public class schedule implements Comparable<schedule> {
String name;
long deadline;
long duration;
long runTime=0;


public schedule() {
}




@Override
public int compareTo(schedule o) {
	if(o.deadline>this.deadline) {
		return 1;
	}
	
	else {
		return 0;
	}
	
}


@Override
public String toString() {
	return "schedule [name=" + name + ", deadline=" + deadline + ", duration=" + duration + "]";
}
	
	
	
	
	
}
