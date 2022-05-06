package hmw3;

public class deneme {
	
	
	
	
	
	public static int cmp(String a, String b) {
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
			}
			else if(arr1[i]<arr2[i]) {
				
				abc= 0; 
			}
		}
		return abc;
		
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST<Movie, String> bst = new BST<Movie, String>();
		BST<Persons,String> th=new BST<Persons,String>();
		
		
		
		Persons person0 = new Persons();			
		person0.setFname("0");
		Persons person1 = new Persons();			
		person1.setFname("1");
		Persons person2 = new Persons();			
		person2.setFname("2");
		Persons person3 = new Persons();			
		person3.setFname("3");
		Persons person4 = new Persons();			
		person4.setFname("4");
		Persons person5 = new Persons();			
		person5.setFname("5");
		Persons person6 = new Persons();			
		person6.setFname("6");
		Persons person7 = new Persons();			
		person7.setFname("7");

		Persons person8 = new Persons();			
		person8.setFname("8");
		Persons person9 = new Persons();			
		person9.setFname("9");
		Persons person10 = new Persons();			
		person10.setFname("10");

		Persons person11 = new Persons();			
		person11.setFname("k");

		th.put(person7, "7");
		th.put(person0, "0");
		th.put(person11,"11");
		th.put(person3, "3");
		th.put(person4, "4");
		th.put(person2, "2");
		th.put(person9, "9");
		th.put(person6, "6");
		th.put(person1, "1");
		th.put(person10, "10");
		th.put(person5, "5");
		th.put(person8, "8");


		
     	th.print(th.root);
		
		
	}

}
