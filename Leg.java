package bergerson.LEGS;

//Leg class (superclass, abstract)
public abstract class Leg {
	
	//Data fields
	private String iDNumber;
	private String lType;
	
	//Constructor
	public Leg(String iDNumber, String lType) {
		this.iDNumber = iDNumber;
		this.lType = lType;
	}
	
	//Abstract methods
	//name: displayInfo
	public abstract void displayInfo();

	//Accessors and mutators
	public String getiDNumber() {
		return iDNumber;
	}

	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}

	public String getlType() {
		return lType;
	}

	public void setlType(String lType) {
		this.lType = lType;
	}
	
}