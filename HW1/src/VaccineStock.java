
public class VaccineStock {
	private int serialNumber;
	private String countryName;
	private int numberOfVaccines;

	// We have parameters in constructor that show our vaccines' serial number, where they made and number of vaccines

public VaccineStock(int serialNumber2, String countryName2, int numberOfVaccines2) {
	// TODO Auto-generated constructor stubthis.serialNumber = serialNumber;
	
	this.serialNumber = serialNumber2;
	this.countryName = countryName2;
	this.numberOfVaccines = numberOfVaccines2;
}

// we create new stack 
myStack a = new myStack();


	
	// we have getters and setters for our constructor.

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getNumberOfVaccines() {
		return numberOfVaccines;
	}

	public void setNumberOfVaccines(int numberOfVaccines) {
		this.numberOfVaccines = numberOfVaccines;
	}

	// we called push method here
	public void pushItem(VaccineStock z) {
		a.push(z);
	}
	// we called pop and print method here
   public void popItem() {
	    a.pop();
	    a.print();
	   
		
	}


	
	// toString method for our output's printing type
	@Override
	public String toString() {
		return  serialNumber + ", " +countryName + ", "+ numberOfVaccines;
	}
}
