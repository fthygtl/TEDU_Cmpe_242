package hmw3;

public class Persons implements Comparable<Persons>{
private String fname ;
private String lname;
private String title;


	public Persons() {
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return  fname  +" "+ lname  ;
	}
	
	
public int comp(String a ,String b) {
	
	char[] arr1=new char[30];
	char[] arr2=new char[30];
	
	for(int i=0;i<a.length();i++) {
		arr1[i]=a.charAt(i);
		
	}
	
	
	
	
for(int i=0;i<b.length();i++) {
arr2[i]=b.charAt(i);
		
	}


	int abc=0;
	for(int i =0;i<arr1.length;i++) {
		
		if(arr1[i]==arr2[i]) {
			
			continue;
		}
		
		
		else if(arr1[i]>arr2[i]) {
			
			 abc=1;
			 break;
		}
		else if(arr1[i]<arr2[i]) {
			
			abc= 0;
			break;
		}
	}
	return abc;
	
	
	
		
	}
	
	
	
	
	
	
	

	@Override
	public int compareTo(Persons o) {
	
		if(o.fname.equals(this.fname)==true) {
			
			return 1;
		}
		
		else if(comp(o.fname,this.fname)==1) {
			return 1;
			
		}
		else if(comp(o.fname,this.fname)==0){
			return -1;
		}
		else {
			return -1;
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
