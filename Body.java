package bergerson.BODIES;

//Body class (superclass, abstract)
public abstract class Body {
	
	//Data fields
	private String iDNumber;
	private String bType;
	
	//Constructor
	public Body(String iDNumber, String bType) {
		this.iDNumber = iDNumber;
		this.bType = bType;
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

	public String getbType() {
		return bType;
	}

	public void setbType(String bType) {
		this.bType = bType;
	}
	
}