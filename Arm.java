package bergerson.ARMS;

//Arm class (superclass, abstract)
public abstract class Arm {
	
	//Data fields
	private String iDNumber;
	private String aType;
	
	//Constructor
	public Arm(String iDNumber, String aType) {
		this.iDNumber = iDNumber;
		this.aType = aType;
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

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}
		
}