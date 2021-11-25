package bergerson.FACTORY;

//DroidFactory class (superclass, abstract)
public abstract class DroidFactory {
	
	//Data fields
	private String iDNumber;
	private String buildType;
	
	//Constructor
	public DroidFactory(String iDNumber, String buildType) {
		this.iDNumber = iDNumber;
		this.buildType = buildType;
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

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}	
	
}