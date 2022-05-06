package hmw3;

public class Movie implements Comparable<Movie> {

	private String title;
	private int day;
	private int month;
	private int year;
	Persons arr2[] = new Persons[100];
	
	
	
	
	
	
	private Persons director;
	
	
	
	Movie() {
}
	
	public void addperson(Persons a){
		for(int i =0;i<arr2.length;i++) {
			if(arr2[i]==null) {
				arr2[i]=a;
				break;
				
			}
			
		}
		
	}
	
	public void removeperson(Persons a) {
		
		for(int i =0;i<arr2.length;i++) {
			if(arr2[i]==a) {
				arr2[i]=null;
				break;
				
			}
			
		}
		
	}
	
	public boolean  findperson(Persons a) {
		Boolean a1 =false ; 
		for(int i =0;i<arr2.length;i++) {
			if(arr2[i].getFname().contentEquals(a.getFname())&&arr2[i].getLname().contentEquals(a.getLname())) {
			
				a1 = true;
				
			}
			}
		return a1;
	}
	
	
	
	
	
	
	@Override
	public int compareTo(Movie o) {
		if (o.year >this.year) {

			return 1;
		}

		
		else if(o.year ==this.year) {
			
			return 1;
		}
		
		
		
		else {
			return 0;
		}

	}

	
	
	
	
	
	
	
	public Persons getDirector() {
		return director;
	}

	public void setDirector(Persons director) {
		this.director = director;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	String a ;
public void person1() {
	for(int i =0;i<arr2.length;i++) {
		String a =(arr2[i].getFname()+" "+arr2[i].getLname()+", ");
		if(arr2[i+1]!=null) {
			a.concat((arr2[i+1].getFname()+" "+arr2[i+1].getLname()+"\n"));
		i=i+1;	
		}
		
	}
	
	
}
	

	@Override // persons için print eklenecek 
	public String toString() {
		
		
		return title+", " +year+", "+director+"\n";
	}

	
}
